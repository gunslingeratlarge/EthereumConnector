package cn.ssc.blockchain;

import org.apache.commons.configuration.Configuration;
import org.apache.commons.configuration.PropertiesConfiguration;

import java.math.BigInteger;


/**
 * Hello world!
 *
 */
public class AppByte
{
    public static void main( String[] args ) throws Exception {
        BlockChainByte bc = new BlockChainByteImpl();
        //BigInteger balance = bc.getBalanceOf("0xb6060daeb3a0fD0AfEe80aED0e64126F3528150b");
        Configuration config = new PropertiesConfiguration("blockchainByte.properties");
        String address = config.getString("owner.address");
        BigInteger balance = bc.getBalanceOf(address);
        System.out.println("balance is:" +  balance);
        int count = 0;
        String txHash;
        //while(true) {

            count++;
            System.out.println("第"+ count +"次尝试");

            byte[] bp = new byte[2];
            bp[0] = new Byte("48");
            bp[1] = new Byte("57");
            String s = "Byte pair encoding[1] or digram coding[2] is a simple form of data compression in which the most common pair of consecutive bytes of data is replaced with a byte that does not occur within that data. A table of the replacements is required to rebuild the original data. The algorithm was first described publicly by Philip Gage in a February 1994 article A New Algorithm for Data Compression in the C Users Journal.";
//            txHash = bc.publishProject("0xb6060daeb3a0fD0AfEe80aED0e64126F3528150b", "20180202", "区块链项目", "0xb6060daeb3a0fD0AfEe80aED0e64126F3528150b");

        txHash = bc.publishProjectAndSendBP("0xb6060daeb3a0fD0AfEe80aED0e64126F3528150b", "20180202", "区块链项目", "0xb6060daeb3a0fD0AfEe80aED0e64126F3528150b",s.getBytes());
            if (txHash != null || count == 5) {
                //break;
            }
        //}
        System.out.println("https://rinkeby.etherscan.io/tx/" + txHash);
    }
}
