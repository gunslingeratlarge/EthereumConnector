package cn.ssc.blockchain;

import org.apache.commons.configuration.ConfigurationException;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.math.BigInteger;

/**
 * @author Kvmial
 * @version V1.0
 * @Title: BlockChainTest
 * @Package cn.ssc.blockchain
 * @Description:测试区块链连接类是否正常工作
 * @date 2018/7/12 0012 下午 16:04
 */


public class BlockChainTest {
   BlockChain bc;
   Logger logger = LoggerFactory.getLogger(getClass());
    @Before
    public void init() throws ConfigurationException {
        bc = new BlockChainImpl();
    }


    @Test
    public void testAddUser() throws IOException {
        String user = bc.addUser();
        logger.info(user);
        //0x869529b24c45c58db2836dd7d8d07c2c2245341d
        //0xb6060daeb3a0fD0AfEe80aED0e64126F3528150b
    }


    @Test
    public void testGetBalance() throws Exception {
        BigInteger i = bc.getBalanceOf("0xb6060daeb3a0fD0AfEe80aED0e64126F3528150b");
        logger.debug(i.toString());
    }


}
