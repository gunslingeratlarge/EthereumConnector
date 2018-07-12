package cn.ssc.blockchain;

import java.math.BigInteger;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception {
        BlockChain bc = new BlockChainImpl();
        BigInteger balance = bc.getBalanceOf("0xb6060daeb3a0fD0AfEe80aED0e64126F3528150b");
        System.out.println("balance is:" +  balance);
    }
}
