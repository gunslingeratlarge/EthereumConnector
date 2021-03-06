package cn.ssc.blockchain;

import org.web3j.crypto.CipherException;

import java.io.IOException;
import java.math.BigInteger;

/**
 * @author Kvmial
 * @version V1.0
 * @title BlockChain
 * @package cn.ssc.blockchain
 * @description 区块链调用接口
 * @date 2018/7/12 0012 下午 14:27
 */

public interface BlockChainByte {
    //token information
    public BigInteger getBalanceOf(String who) throws Exception;
    public BigInteger totalSupply()throws Exception;

    //token manag  ment
    public String adminDeleteTokenFrom(String from, BigInteger value) throws Exception;
    public String adminAddTokenTo(String to, BigInteger value) throws Exception;
    public String adminTransfer(String from, String to, BigInteger value) throws Exception;
    public String adminSetBalanceOf(String who, BigInteger value) throws Exception;

    //projects
    public String publishProject(String publisher, String publishTime, String projectName, String projectHash) throws Exception;
    public String publishProjectAndSendBP(String publisher, String publishTime, String projectName, String projectHash,byte[] bp) throws Exception;
    public String buyProject(String buyer, String buyTime, String projectName, String projectHash) throws Exception;

    //demands
    public String publishDemand(String publisher, String publishTime, String demandName, String demandHash) throws Exception;
    public String answerDemand(String answerer, String answerTime, String demandName, String answerHash) throws Exception;

    //user
    public String addUser(String password) throws IOException;
    public String localAddUser(String password) throws IOException, CipherException;
}