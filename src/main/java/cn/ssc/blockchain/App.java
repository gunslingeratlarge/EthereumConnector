package cn.ssc.blockchain;

import org.apache.commons.configuration.Configuration;
import org.apache.commons.configuration.PropertiesConfiguration;

import java.math.BigInteger;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception {
        BlockChain bc = new BlockChainImpl();
        //BigInteger balance = bc.getBalanceOf("0xb6060daeb3a0fD0AfEe80aED0e64126F3528150b");
        Configuration config = new PropertiesConfiguration("classpath:config.properties");
        String address = config.getString("address");
        BigInteger balance = bc.getBalanceOf(address);
        System.out.println("balance is:" +  balance);
    }
}
