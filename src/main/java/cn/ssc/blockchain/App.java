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
        Configuration config = new PropertiesConfiguration("blockchain.properties");
        String address = config.getString("owner.address");
        BigInteger balance = bc.getBalanceOf(address);
        System.out.println("balance is:" +  balance);
        int count = 0;
        String txHash;
        //while(true) {

            count++;
            System.out.println("第"+ count +"次尝试");

            txHash = bc.publishProject("0xb6060daeb3a0fD0AfEe80aED0e64126F3528150b", "20180202", "区块链项目", "0xb6060daeb3a0fD0AfEe80aED0e64126F3528150b");
            if (txHash != null || count == 5) {
                //break;
            }
        //}
        System.out.println("https://rinkeby.etherscan.io/tx/" + txHash);
    }
}
