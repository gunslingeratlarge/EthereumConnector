package cn.ssc.blockchain;

import cn.ssc.blockchain.generated.DevToken;
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

/**
 * @author Kvmial
 * @version V1.0
 * @Title: BlockChainImpl
 * @Package cn.ssc.blockchain
 * @Description: 区块链实现类
 * @date 2018/7/12 0012 下午 14:36
 */


public class BlockChainImpl implements BlockChain{
    public Web3j web3;
    public Credentials credentials;
    public DevToken contract;
    Logger logger = LoggerFactory.getLogger(getClass());


    public BlockChainImpl() {
        web3 = Web3j.build(new HttpService("https://rinkeby.infura.io/w4Ys7tFaHr9YwlS1dqvB"));
        try {
            credentials =
                    WalletUtils.loadCredentials(
                            "123456789",
                            "E:/chain/whjKeyFile/keyfile");
            logger.info("credentials loaded");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (CipherException e) {
            e.printStackTrace();
        }

        String address = credentials.getAddress();

        contract = DevToken.load("0xc41Cc72eA84d117A096F938B807657722bD7738C",
                web3, credentials, BigInteger.valueOf(3_000_000_000L), BigInteger.valueOf(300000L));
        logger.info("contract loaded");
    }

    @Override
    public BigInteger getBalanceOf(String who) throws Exception {
        BigInteger balance = contract.balanceOf("0xb6060daeb3a0fD0AfEe80aED0e64126F3528150b").send();
        return balance;
    }

    //
    @Override
    public BigInteger totalSupply() {
        return null;
    }

    @Override
    public String adminDeleteTokenFrom(String from, BigInteger value) {
        return null;
    }

    @Override
    public String adminAddTokenTo(String to, BigInteger value) {
        return null;
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
