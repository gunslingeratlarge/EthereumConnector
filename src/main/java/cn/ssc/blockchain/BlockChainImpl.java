package cn.ssc.blockchain;

import cn.ssc.blockchain.generated.DevToken;
import org.apache.commons.configuration.Configuration;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.web3j.crypto.Bip39Wallet;
import org.web3j.crypto.CipherException;
import org.web3j.crypto.Credentials;
import org.web3j.crypto.WalletUtils;
import org.web3j.protocol.admin.Admin;
import org.web3j.protocol.admin.methods.response.NewAccountIdentifier;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.protocol.http.HttpService;
import org.web3j.tx.FastRawTransactionManager;
import org.web3j.tx.response.PollingTransactionReceiptProcessor;

import java.io.File;
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
    private Admin web3;
    private Credentials credentials;
    private DevToken contract;
    Logger logger = LoggerFactory.getLogger(getClass());

    private Configuration config = new PropertiesConfiguration("blockchain.properties");
    public BlockChainImpl() throws ConfigurationException {
        web3 = Admin.build(new HttpService(config.getString("web3j.url")));

    try {
            credentials = WalletUtils.loadCredentials(
                    config.getString("owner.password"),
                    config.getString("owner.keyfile"));
            logger.info("credentials loaded");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (CipherException e) {
            e.printStackTrace();
        }

        String address = credentials.getAddress();
        contract = DevToken.load(config.getString("contract.address"),
                web3, credentials,
                new BigInteger(config.getString("gas.price")),
                new BigInteger(config.getString("gas.limit")));


        FastRawTransactionManager fastRawTxMgr =new FastRawTransactionManager(web3, credentials, new PollingTransactionReceiptProcessor(web3, 6000, 60));
        contract = DevToken.load(config.getString("contract.address"), web3, fastRawTxMgr, new BigInteger(config.getString("gas.price")), new BigInteger(config.getString("gas.limit")));

        logger.info("contract loaded");
    }

    @Override
    public BigInteger getBalanceOf(String who) throws Exception {

        BigInteger balance = contract.balanceOf(who).send();
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
    public String adminTransfer(String from, String to, BigInteger value) throws Exception {
        return contract.adminTransfer(from,to,value).send().getTransactionHash();
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
    public String buyProject(String buyer, String buyTime, String projectName, String projectHash) throws Exception {
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

    //add new user to blockchain
    @Override
    public String addUser(String password) throws IOException {
        NewAccountIdentifier identifier = web3.personalNewAccount(password).send();
        return identifier.getAccountId();
    }

    @Override
    public String localAddUser(String password) throws CipherException, IOException {
        String keyStoreDir = WalletUtils.getDefaultKeyDirectory();
        System.out.println("生成keyStore文件的默认目录：" + keyStoreDir);
        //通过密码及keystore目录生成钱包
        Bip39Wallet wallet = WalletUtils.generateBip39Wallet(password, new File(keyStoreDir));
        Credentials cd = WalletUtils.loadBip39Credentials(password,
                wallet.getMnemonic());
        //钱包地址
        System.out.println(cd.getAddress());
        return cd.getAddress();
    }




}
