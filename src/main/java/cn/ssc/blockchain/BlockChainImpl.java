package cn.ssc.blockchain;

import cn.ssc.blockchain.generated.DevToken;
import org.apache.commons.configuration.Configuration;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.web3j.crypto.CipherException;
import org.web3j.crypto.Credentials;
import org.web3j.crypto.WalletUtils;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.protocol.http.HttpService;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Properties;

/**
 * @author Kvmial
 * @version V1.0
 * @Title: BlockChainImpl
 * @Package cn.ssc.blockchain
 * @Description: 区块链实现类
 * @date 2018/7/12 0012 下午 14:36
 */


public class BlockChainImpl implements BlockChain{
    private Web3j web3;
    private Credentials credentials;
    private DevToken contract;
    //public Configuration config;
    Logger logger = LoggerFactory.getLogger(getClass());

    private Configuration config = new PropertiesConfiguration("classpath:config.properties");
    public BlockChainImpl() throws ConfigurationException {
        web3 = Web3j.build(new HttpService(config.getString("web3j_url")));

        try {
            credentials = WalletUtils.loadCredentials(
                    config.getString("password"),
                    config.getString("source"));
            logger.info("credentials loaded");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (CipherException e) {
            e.printStackTrace();
        }

        String address = credentials.getAddress();

        contract = DevToken.load(config.getString("contractAddress"),
                web3, credentials, config.getBigInteger("GAS_LIMIT"),
                config.getBigInteger("GAS_PRICE"));
        logger.info("contract loaded");
    }

    @Override
    public BigInteger getBalanceOf(String who) throws Exception {

        BigInteger balance = contract.balanceOf(config.getString("owner")).send();
        return balance;
    }

    //
    @Override
    public BigInteger totalSupply() throws Exception{
        BigInteger totalSupply = contract.totalSupply().send();
        return totalSupply;
    }

    @Override
    public String adminDeleteTokenFrom(String from, BigInteger value)throws Exception {
        TransactionReceipt receipt = contract.adminDeleteTokenFrom(from, value).send();
        return receipt.getTransactionHash();
    }

    @Override
    public String adminAddTokenTo(String to, BigInteger value) throws Exception {
        String hash = contract.adminAddTokenTo(to, value).send().getTransactionHash();
        return hash;
    }

    @Override
    public String adminTransfer(String from, String to, BigInteger value) {
        return null;
    }

    @Override
    public String adminSetBalanceOf(String who, BigInteger value) throws Exception {
        return contract.adminSetBalanceOf(who,value).send().getTransactionHash();
    }

    @Override
    public String publishProject(String publisher, String publishTime, String projectName, String projectHash) throws Exception {
        TransactionReceipt receipt = contract.publishProject(publisher, publishTime, projectName, projectHash).send();
        return  receipt.getTransactionHash();
    }

    @Override
    public String BuyProject(String buyer, String buyTime, String projectName, String projectHash) throws Exception {
        TransactionReceipt receipt = contract.buyProject(buyer, buyTime, projectName, projectHash).send();
        return receipt.getTransactionHash();
    }

    @Override
    public String publishDemand(String publisher, String publishTime, String demandName, String demandHash) throws Exception {
          TransactionReceipt receipt = contract.publishDemand(publisher,publishTime, demandName, demandHash).send();
          return receipt.getTransactionHash();
    }

    @Override
    public String answerDemand(String answerer, String answerTime, String demandName, String answerHash) throws Exception {
        TransactionReceipt receipt = contract.answerDemand(answerer, answerTime, demandName, answerHash).send();
        return receipt.getTransactionHash();
    }
}
