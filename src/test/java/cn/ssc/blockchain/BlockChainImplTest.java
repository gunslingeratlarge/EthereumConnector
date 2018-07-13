package cn.ssc.blockchain;

import org.apache.commons.configuration.ConfigurationException;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.math.BigInteger;

import static org.junit.Assert.*;

/**
 * @author Kvmial
 * @version V1.0
 * @Title: BlockChainImplTest
 * @Package cn.ssc.blockchain
 * @Description: TODO
 * @date 2018/7/13 0013 上午 10:47
 */

public class BlockChainImplTest {
    BlockChain bc;
    Logger logger = LoggerFactory.getLogger(getClass());

    @Before
    public void init() throws ConfigurationException {
        bc = new BlockChainImpl();
    }

    @Test
    public void getBalanceOf() throws Exception {
        bc.getBalanceOf("0xb6060daeb3a0fD0AfEe80aED0e64126F3528150b");
    }

    @Test
    public void totalSupply() throws Exception {
        BigInteger totalSupply = bc.totalSupply();
        logger.debug("totalSupply:" + totalSupply.toString() );
    }

    @Test
    public void adminDeleteTokenFrom() throws Exception {
        String tx = bc.adminDeleteTokenFrom("0xb6060daeb3a0fD0AfEe80aED0e64126F3528150b", BigInteger.valueOf(10));
        logger.debug("adminDeleteTokenFrom: " + tx);
    }

    @Test
    public void adminAddTokenTo() throws Exception {
        String tx = bc.adminAddTokenTo("0xcf855242b880f4a92fc077b068f3c094c70f2c3f", BigInteger.valueOf(1000));
        logger.debug("adminAddTokenTo:" + tx);
    }

    @Test
    public void adminTransfer() throws Exception {
        String tx = bc.adminTransfer("0xcf855242b880f4a92fc077b068f3c094c70f2c3f","0xb6060daeb3a0fD0AfEe80aED0e64126F3528150b",BigInteger.valueOf(20));
        logger.debug("adminTransfer: " + tx);
    }

    @Test
    public void adminSetBalanceOf() throws Exception {
        String tx = bc.adminSetBalanceOf("0xcf855242b880f4a92fc077b068f3c094c70f2c3f", BigInteger.valueOf(500));
        logger.debug("adminSetBalanceOf: " + tx);
    }

    @Test
    public void publishProject() throws Exception {
        String tx = bc.publishProject("0xcf855242b880f4a92fc077b068f3c094c70f2c3f",
                "20180713",
                "EthereumConnector",
                "0xb6060daeb3a0fD0AfEe80aED0e64126F3528150b");
        logger.debug("publishProject: " + tx);
    }

    @Test
    public void buyProject() throws Exception {
        String tx = bc.buyProject("0xcf855242b880f4a92fc077b068f3c094c70f2c3f",
                "20180713",
                "EthereumConnector",
                "0xb6060daeb3a0fD0AfEe80aED0e64126F3528150b");
        logger.debug("buyProject: " + tx);
    }

    @Test
    public void publishDemand() throws Exception {
        String tx = bc.publishDemand("0xcf855242b880f4a92fc077b068f3c094c70f2c3f",
                "20180713",
                "EthereumConnectorDemand",
                "0xb6060daeb3a0fD0AfEe80aED0e64126F3528150b");
        logger.debug("publishDemand: " + tx);
    }

    @Test
    public void answerDemand() throws Exception {
        String tx = bc.answerDemand("0xcf855242b880f4a92fc077b068f3c094c70f2c3f",
                "20180713",
                "EthereumConnectorDemand",
                "0xb6060daeb3a0fD0AfEe80aED0e64126F3528150b");
        logger.debug("answerDemand: " + tx);

    }

    @Test
    public void addUser() throws IOException {
        String user = bc.addUser("123456789");
        logger.debug("new user address: " + user);
    }
}