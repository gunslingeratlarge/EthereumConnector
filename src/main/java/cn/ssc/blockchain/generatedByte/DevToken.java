package cn.ssc.blockchain.generatedByte;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.web3j.abi.EventEncoder;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Address;
import org.web3j.abi.datatypes.Bool;
import org.web3j.abi.datatypes.DynamicBytes;
import org.web3j.abi.datatypes.Event;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.Utf8String;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.abi.datatypes.generated.Uint8;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.DefaultBlockParameter;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.methods.request.EthFilter;
import org.web3j.protocol.core.methods.response.Log;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;
import rx.Observable;
import rx.functions.Func1;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>,
 * or the org.web3j.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 3.4.0.
 */
public class DevToken extends Contract {
    private static final String BINARY = "608060405260038054600160a860020a03191633179055611698806100256000396000f30060806040526004361061015e5763ffffffff7c010000000000000000000000000000000000000000000000000000000060003504166306fdde038114610163578063095ea7b3146101ed57806318160ddd1461022557806323b872dd1461024c578063313ce5671461027657806339e73b50146102a15780633c9d6e2c146102e65780633f4ba83a1461032b57806342966c681461034257806351489c731461035a57806351be95ec146103ab5780635c975abb146103f0578063661884631461040557806370a08231146104295780638456cb591461044a5780638da5cb5b1461045f57806395d4facb1461049057806395d89b41146104b45780639aff7b8f146104c9578063a9059cbb146104ed578063b5cfac9f14610511578063b62a1ba414610556578063d73dd6231461056b578063da72c1e81461058f578063dd62ed3e146105b9578063e5daa878146105e0578063f2fde38b14610604575b600080fd5b34801561016f57600080fd5b50610178610625565b6040805160208082528351818301528351919283929083019185019080838360005b838110156101b257818101518382015260200161019a565b50505050905090810190601f1680156101df5780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b3480156101f957600080fd5b50610211600160a060020a036004351660243561065c565b604080519115158252519081900360200190f35b34801561023157600080fd5b5061023a610687565b60408051918252519081900360200190f35b34801561025857600080fd5b50610211600160a060020a036004358116906024351660443561068d565b34801561028257600080fd5b5061028b6106ba565b6040805160ff9092168252519081900360200190f35b3480156102ad57600080fd5b5061021160048035600160a060020a031690602480358082019290810135916044358082019290810135916064359081019101356106bf565b3480156102f257600080fd5b5061021160048035600160a060020a03169060248035808201929081013591604435808201929081013591606435908101910135610777565b34801561033757600080fd5b5061034061082f565b005b34801561034e57600080fd5b506103406004356108a7565b34801561036657600080fd5b5061021160048035600160a060020a03169060248035808201929081013591604435808201929081013591606435808201929081013591608435908101910135610985565b3480156103b757600080fd5b5061021160048035600160a060020a03169060248035808201929081013591604435808201929081013591606435908101910135610a5e565b3480156103fc57600080fd5b50610211610b16565b34801561041157600080fd5b50610211600160a060020a0360043516602435610b26565b34801561043557600080fd5b5061023a600160a060020a0360043516610b4a565b34801561045657600080fd5b50610340610b65565b34801561046b57600080fd5b50610474610be2565b60408051600160a060020a039092168252519081900360200190f35b34801561049c57600080fd5b50610211600160a060020a0360043516602435610bf1565b3480156104c057600080fd5b50610178610cff565b3480156104d557600080fd5b50610211600160a060020a0360043516602435610d36565b3480156104f957600080fd5b50610211600160a060020a0360043516602435610ded565b34801561051d57600080fd5b5061021160048035600160a060020a03169060248035808201929081013591604435808201929081013591606435908101910135610e11565b34801561056257600080fd5b50610340610ec9565b34801561057757600080fd5b50610211600160a060020a0360043516602435610ee9565b34801561059b57600080fd5b50610211600160a060020a0360043581169060243516604435610f0d565b3480156105c557600080fd5b5061023a600160a060020a036004358116906024351661100c565b3480156105ec57600080fd5b50610211600160a060020a0360043516602435611037565b34801561061057600080fd5b50610340600160a060020a0360043516611173565b60408051808201909152600881527f446576546f6b656e000000000000000000000000000000000000000000000000602082015281565b60035460009060a060020a900460ff161561067657600080fd5b6106808383611208565b9392505050565b60015490565b60035460009060a060020a900460ff16156106a757600080fd5b6106b284848461126e565b949350505050565b600081565b60007f28e91938c3f0447434d5a1d706a57ae75020f24e16ac65951db62a749d469503888888888888886040518088600160a060020a0316600160a060020a0316815260200180602001806020018060200184810384528a8a82818152602001925080828437909101858103845288815260200190508888808284379091018581038352868152602001905086868082843760405192018290039c50909a5050505050505050505050a1506001979650505050505050565b60007f1bdfbd7d73649ac4fe404be0a7f4bdc25af7800a3dcec17d40f93bfed3828363888888888888886040518088600160a060020a0316600160a060020a0316815260200180602001806020018060200184810384528a8a82818152602001925080828437909101858103845288815260200190508888808284379091018581038352868152602001905086868082843760405192018290039c50909a5050505050505050505050a1506001979650505050505050565b600354600160a060020a0316331461084657600080fd5b60035460a060020a900460ff16151561085e57600080fd5b6003805474ff0000000000000000000000000000000000000000191690556040517f7805862f689e2f13df9f062ff482ad3ad112aca9e0847911ed832e158c525b3390600090a1565b336000908152602081905260408120548211156108c357600080fd5b50336000818152602081905260409020546108e4908363ffffffff6113d316565b600160a060020a038216600090815260208190526040902055600154610910908363ffffffff6113d316565b600155604080518381529051600160a060020a038316917fcc16f5dbb4873280815c1ee09dbd06736cffcc184412cf7a71a0fdb75d397ca5919081900360200190a2604080518381529051600091600160a060020a0384169160008051602061164d8339815191529181900360200190a35050565b60007f0680a0846fde0854bafe031fd31452d10d3ff4438b7144de3482aa82236145ef8a8a8a8a8a8a8a8a8a604051808a600160a060020a0316600160a060020a031681526020018060200180602001806020018060200185810385528d8d8281815260200192508082843790910186810385528b815260200190508b8b80828437909101868103845289815260200190508989808284379091018681038352878152602001905087878082843760405192018290039f50909d5050505050505050505050505050a15060019998505050505050505050565b60007f47d336980f59b6abb1f3f080b57f98242ad9a241d306f2e9c4ff934fc565ea94888888888888886040518088600160a060020a0316600160a060020a0316815260200180602001806020018060200184810384528a8a82818152602001925080828437909101858103845288815260200190508888808284379091018581038352868152602001905086868082843760405192018290039c50909a5050505050505050505050a1506001979650505050505050565b60035460a060020a900460ff1681565b60035460009060a060020a900460ff1615610b4057600080fd5b61068083836113e5565b600160a060020a031660009081526020819052604090205490565b600354600160a060020a03163314610b7c57600080fd5b60035460a060020a900460ff1615610b9357600080fd5b6003805474ff0000000000000000000000000000000000000000191660a060020a1790556040517f6985a02210a168e66602d3235cb6db0e70f92b3ba4d376a33c0f3d9434bff62590600090a1565b600354600160a060020a031681565b600354600090600160a060020a03163314610c0b57600080fd5b600160a060020a038316600090815260208190526040902054821115610c3057600080fd5b600160a060020a038316600090815260208190526040902054610c59908363ffffffff6113d316565b600160a060020a038416600090815260208190526040902055600154610c85908363ffffffff6113d316565b600155604080518381529051600160a060020a038516917fcc16f5dbb4873280815c1ee09dbd06736cffcc184412cf7a71a0fdb75d397ca5919081900360200190a2604080518381529051600091600160a060020a0386169160008051602061164d8339815191529181900360200190a350600192915050565b60408051808201909152600381527f4445560000000000000000000000000000000000000000000000000000000000602082015281565b600354600090600160a060020a03163314610d5057600080fd5b600160a060020a0383161515610d6557600080fd5b600154610d78908363ffffffff6114d516565b600155600160a060020a038316600090815260208190526040902054610da4908363ffffffff6114d516565b600160a060020a03841660008181526020818152604080832094909455835186815293519293919260008051602061164d8339815191529281900390910190a350600192915050565b60035460009060a060020a900460ff1615610e0757600080fd5b61068083836114e4565b60007f117a19c4fac2b6735527c32fe2111dd985fe0d76037b86e66dada8fad8114006888888888888886040518088600160a060020a0316600160a060020a0316815260200180602001806020018060200184810384528a8a82818152602001925080828437909101858103845288815260200190508888808284379091018581038352868152602001905086868082843760405192018290039c50909a5050505050505050505050a1506001979650505050505050565b6003805474ff000000000000000000000000000000000000000019169055565b60035460009060a060020a900460ff1615610f0357600080fd5b61068083836115b3565b600354600090600160a060020a03163314610f2757600080fd5b600160a060020a038416600090815260208190526040902054821115610f4c57600080fd5b600160a060020a0383161515610f6157600080fd5b600160a060020a038416600090815260208190526040902054610f8a908363ffffffff6113d316565b600160a060020a038086166000908152602081905260408082209390935590851681522054610fbf908363ffffffff6114d516565b600160a060020a0380851660008181526020818152604091829020949094558051868152905191939288169260008051602061164d83398151915292918290030190a35060019392505050565b600160a060020a03918216600090815260026020908152604080832093909416825291909152205490565b6003546000908190600160a060020a0316331461105357600080fd5b600160a060020a038416151561106857600080fd5b50600160a060020a0383166000908152602081905260409020548083106110ef576110ab61109c848363ffffffff6113d316565b6001549063ffffffff6114d516565b600155600160a060020a038416600060008051602061164d8339815191526110d9868563ffffffff6113d316565b60408051918252519081900360200190a3611151565b611111611102828563ffffffff6113d316565b6001549063ffffffff6113d316565b6001556000600160a060020a03851660008051602061164d83398151915261113f848763ffffffff6113d316565b60408051918252519081900360200190a35b5050600160a060020a0391909116600090815260208190526040902055600190565b600354600160a060020a0316331461118a57600080fd5b600160a060020a038116151561119f57600080fd5b600354604051600160a060020a038084169216907f8be0079c531659141344cd1fd0a4f28419497f9722a3daafe3b4186f6b6457e090600090a36003805473ffffffffffffffffffffffffffffffffffffffff1916600160a060020a0392909216919091179055565b336000818152600260209081526040808320600160a060020a038716808552908352818420869055815186815291519394909390927f8c5be1e5ebec7d5bd14f71427d1e84f3dd0314c0f7b2291e5b200ac8c7c3b925928290030190a350600192915050565b6000600160a060020a038316151561128557600080fd5b600160a060020a0384166000908152602081905260409020548211156112aa57600080fd5b600160a060020a03841660009081526002602090815260408083203384529091529020548211156112da57600080fd5b600160a060020a038416600090815260208190526040902054611303908363ffffffff6113d316565b600160a060020a038086166000908152602081905260408082209390935590851681522054611338908363ffffffff6114d516565b600160a060020a0380851660009081526020818152604080832094909455918716815260028252828120338252909152205461137a908363ffffffff6113d316565b600160a060020a038086166000818152600260209081526040808320338452825291829020949094558051868152905192871693919260008051602061164d833981519152929181900390910190a35060019392505050565b6000828211156113df57fe5b50900390565b336000908152600260209081526040808320600160a060020a03861684529091528120548083111561143a57336000908152600260209081526040808320600160a060020a038816845290915281205561146f565b61144a818463ffffffff6113d316565b336000908152600260209081526040808320600160a060020a03891684529091529020555b336000818152600260209081526040808320600160a060020a0389168085529083529281902054815190815290519293927f8c5be1e5ebec7d5bd14f71427d1e84f3dd0314c0f7b2291e5b200ac8c7c3b925929181900390910190a35060019392505050565b60008282018381101561068057fe5b6000600160a060020a03831615156114fb57600080fd5b3360009081526020819052604090205482111561151757600080fd5b33600090815260208190526040902054611537908363ffffffff6113d316565b3360009081526020819052604080822092909255600160a060020a03851681522054611569908363ffffffff6114d516565b600160a060020a0384166000818152602081815260409182902093909355805185815290519192339260008051602061164d8339815191529281900390910190a350600192915050565b336000908152600260209081526040808320600160a060020a03861684529091528120546115e7908363ffffffff6114d516565b336000818152600260209081526040808320600160a060020a0389168085529083529281902085905580519485525191937f8c5be1e5ebec7d5bd14f71427d1e84f3dd0314c0f7b2291e5b200ac8c7c3b925929081900390910190a3506001929150505600ddf252ad1be2c89b69c2b068fc378daa952ba7f163c4a11628f55a4df523b3efa165627a7a723058205fea24c7f9691ba1614d4be2cfb3294e73726376b9ca1e9a2cd7ff695fe1c04d0029";

    public static final String FUNC_NAME = "name";

    public static final String FUNC_APPROVE = "approve";

    public static final String FUNC_TOTALSUPPLY = "totalSupply";

    public static final String FUNC_TRANSFERFROM = "transferFrom";

    public static final String FUNC_DECIMALS = "decimals";

    public static final String FUNC_PUBLISHPROJECT = "publishProject";

    public static final String FUNC_ANSWERDEMAND = "answerDemand";

    public static final String FUNC_UNPAUSE = "unpause";

    public static final String FUNC_BURN = "burn";

    public static final String FUNC_PUBLISHPROJECTANDSENDBP = "publishProjectAndSendBP";

    public static final String FUNC_BUYPROJECT = "buyProject";

    public static final String FUNC_PAUSED = "paused";

    public static final String FUNC_DECREASEAPPROVAL = "decreaseApproval";

    public static final String FUNC_BALANCEOF = "balanceOf";

    public static final String FUNC_PAUSE = "pause";

    public static final String FUNC_OWNER = "owner";

    public static final String FUNC_ADMINDELETETOKENFROM = "adminDeleteTokenFrom";

    public static final String FUNC_SYMBOL = "symbol";

    public static final String FUNC_ADMINADDTOKENTO = "adminAddTokenTo";

    public static final String FUNC_TRANSFER = "transfer";

    public static final String FUNC_PUBLISHDEMAND = "publishDemand";

    public static final String FUNC_PETOKEN = "PEToken";

    public static final String FUNC_INCREASEAPPROVAL = "increaseApproval";

    public static final String FUNC_ADMINTRANSFER = "adminTransfer";

    public static final String FUNC_ALLOWANCE = "allowance";

    public static final String FUNC_ADMINSETBALANCEOF = "adminSetBalanceOf";

    public static final String FUNC_TRANSFEROWNERSHIP = "transferOwnership";

    public static final Event PUBLISHPROJECT_EVENT = new Event("PublishProject", 
            Arrays.<TypeReference<?>>asList(),
            Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}, new TypeReference<Utf8String>() {}, new TypeReference<Utf8String>() {}, new TypeReference<Utf8String>() {}));
    ;

    public static final Event BUYPROJECT_EVENT = new Event("BuyProject", 
            Arrays.<TypeReference<?>>asList(),
            Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}, new TypeReference<Utf8String>() {}, new TypeReference<Utf8String>() {}, new TypeReference<Utf8String>() {}));
    ;

    public static final Event PUBLISHDEMAND_EVENT = new Event("PublishDemand", 
            Arrays.<TypeReference<?>>asList(),
            Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}, new TypeReference<Utf8String>() {}, new TypeReference<Utf8String>() {}, new TypeReference<Utf8String>() {}));
    ;

    public static final Event ANSWERDEMAND_EVENT = new Event("AnswerDemand", 
            Arrays.<TypeReference<?>>asList(),
            Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}, new TypeReference<Utf8String>() {}, new TypeReference<Utf8String>() {}, new TypeReference<Utf8String>() {}));
    ;

    public static final Event PUBLISHPROJECTANDSENDBP_EVENT = new Event("PublishProjectAndSendBP", 
            Arrays.<TypeReference<?>>asList(),
            Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}, new TypeReference<Utf8String>() {}, new TypeReference<Utf8String>() {}, new TypeReference<Utf8String>() {}, new TypeReference<DynamicBytes>() {}));
    ;

    public static final Event BURN_EVENT = new Event("Burn", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}),
            Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
    ;

    public static final Event PAUSE_EVENT = new Event("Pause", 
            Arrays.<TypeReference<?>>asList(),
            Arrays.<TypeReference<?>>asList());
    ;

    public static final Event UNPAUSE_EVENT = new Event("Unpause", 
            Arrays.<TypeReference<?>>asList(),
            Arrays.<TypeReference<?>>asList());
    ;

    public static final Event OWNERSHIPTRANSFERRED_EVENT = new Event("OwnershipTransferred", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}, new TypeReference<Address>() {}),
            Arrays.<TypeReference<?>>asList());
    ;

    public static final Event APPROVAL_EVENT = new Event("Approval", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}, new TypeReference<Address>() {}),
            Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
    ;

    public static final Event TRANSFER_EVENT = new Event("Transfer", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}, new TypeReference<Address>() {}),
            Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
    ;

    protected DevToken(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected DevToken(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public RemoteCall<String> name() {
        final Function function = new Function(FUNC_NAME, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<TransactionReceipt> approve(String _spender, BigInteger _value) {
        final Function function = new Function(
                FUNC_APPROVE, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_spender), 
                new org.web3j.abi.datatypes.generated.Uint256(_value)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<BigInteger> totalSupply() {
        final Function function = new Function(FUNC_TOTALSUPPLY, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<TransactionReceipt> transferFrom(String _from, String _to, BigInteger _value) {
        final Function function = new Function(
                FUNC_TRANSFERFROM, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_from), 
                new org.web3j.abi.datatypes.Address(_to), 
                new org.web3j.abi.datatypes.generated.Uint256(_value)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<BigInteger> decimals() {
        final Function function = new Function(FUNC_DECIMALS, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint8>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<TransactionReceipt> publishProject(String _publisher, String _time, String _projectName, String _projectHash) {
        final Function function = new Function(
                FUNC_PUBLISHPROJECT, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_publisher), 
                new org.web3j.abi.datatypes.Utf8String(_time), 
                new org.web3j.abi.datatypes.Utf8String(_projectName), 
                new org.web3j.abi.datatypes.Utf8String(_projectHash)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> answerDemand(String _answerer, String _time, String _demandName, String _answerHash) {
        final Function function = new Function(
                FUNC_ANSWERDEMAND, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_answerer), 
                new org.web3j.abi.datatypes.Utf8String(_time), 
                new org.web3j.abi.datatypes.Utf8String(_demandName), 
                new org.web3j.abi.datatypes.Utf8String(_answerHash)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> unpause() {
        final Function function = new Function(
                FUNC_UNPAUSE, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> burn(BigInteger _value) {
        final Function function = new Function(
                FUNC_BURN, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_value)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> publishProjectAndSendBP(String _publisher, String _time, String _projectName, String _projectHash, byte[] _bp) {
        final Function function = new Function(
                FUNC_PUBLISHPROJECTANDSENDBP, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_publisher), 
                new org.web3j.abi.datatypes.Utf8String(_time), 
                new org.web3j.abi.datatypes.Utf8String(_projectName), 
                new org.web3j.abi.datatypes.Utf8String(_projectHash), 
                new org.web3j.abi.datatypes.DynamicBytes(_bp)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> buyProject(String _buyer, String _time, String _projectName, String _projectHash) {
        final Function function = new Function(
                FUNC_BUYPROJECT, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_buyer), 
                new org.web3j.abi.datatypes.Utf8String(_time), 
                new org.web3j.abi.datatypes.Utf8String(_projectName), 
                new org.web3j.abi.datatypes.Utf8String(_projectHash)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<Boolean> paused() {
        final Function function = new Function(FUNC_PAUSED, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
        return executeRemoteCallSingleValueReturn(function, Boolean.class);
    }

    public RemoteCall<TransactionReceipt> decreaseApproval(String _spender, BigInteger _subtractedValue) {
        final Function function = new Function(
                FUNC_DECREASEAPPROVAL, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_spender), 
                new org.web3j.abi.datatypes.generated.Uint256(_subtractedValue)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<BigInteger> balanceOf(String _owner) {
        final Function function = new Function(FUNC_BALANCEOF, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_owner)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<TransactionReceipt> pause() {
        final Function function = new Function(
                FUNC_PAUSE, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<String> owner() {
        final Function function = new Function(FUNC_OWNER, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<TransactionReceipt> adminDeleteTokenFrom(String _from, BigInteger _value) {
        final Function function = new Function(
                FUNC_ADMINDELETETOKENFROM, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_from), 
                new org.web3j.abi.datatypes.generated.Uint256(_value)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<String> symbol() {
        final Function function = new Function(FUNC_SYMBOL, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<TransactionReceipt> adminAddTokenTo(String _to, BigInteger _value) {
        final Function function = new Function(
                FUNC_ADMINADDTOKENTO, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_to), 
                new org.web3j.abi.datatypes.generated.Uint256(_value)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> transfer(String _to, BigInteger _value) {
        final Function function = new Function(
                FUNC_TRANSFER, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_to), 
                new org.web3j.abi.datatypes.generated.Uint256(_value)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> publishDemand(String _publisher, String _time, String _demandName, String _demandHash) {
        final Function function = new Function(
                FUNC_PUBLISHDEMAND, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_publisher), 
                new org.web3j.abi.datatypes.Utf8String(_time), 
                new org.web3j.abi.datatypes.Utf8String(_demandName), 
                new org.web3j.abi.datatypes.Utf8String(_demandHash)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> PEToken() {
        final Function function = new Function(
                FUNC_PETOKEN, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> increaseApproval(String _spender, BigInteger _addedValue) {
        final Function function = new Function(
                FUNC_INCREASEAPPROVAL, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_spender), 
                new org.web3j.abi.datatypes.generated.Uint256(_addedValue)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> adminTransfer(String _from, String _to, BigInteger _value) {
        final Function function = new Function(
                FUNC_ADMINTRANSFER, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_from), 
                new org.web3j.abi.datatypes.Address(_to), 
                new org.web3j.abi.datatypes.generated.Uint256(_value)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<BigInteger> allowance(String _owner, String _spender) {
        final Function function = new Function(FUNC_ALLOWANCE, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_owner), 
                new org.web3j.abi.datatypes.Address(_spender)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<TransactionReceipt> adminSetBalanceOf(String _who, BigInteger _value) {
        final Function function = new Function(
                FUNC_ADMINSETBALANCEOF, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_who), 
                new org.web3j.abi.datatypes.generated.Uint256(_value)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> transferOwnership(String newOwner) {
        final Function function = new Function(
                FUNC_TRANSFEROWNERSHIP, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(newOwner)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public List<PublishProjectEventResponse> getPublishProjectEvents(TransactionReceipt transactionReceipt) {
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(PUBLISHPROJECT_EVENT, transactionReceipt);
        ArrayList<PublishProjectEventResponse> responses = new ArrayList<PublishProjectEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            PublishProjectEventResponse typedResponse = new PublishProjectEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.publisher = (String) eventValues.getNonIndexedValues().get(0).getValue();
            typedResponse.time = (String) eventValues.getNonIndexedValues().get(1).getValue();
            typedResponse.projectName = (String) eventValues.getNonIndexedValues().get(2).getValue();
            typedResponse.projectHash = (String) eventValues.getNonIndexedValues().get(3).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Observable<PublishProjectEventResponse> publishProjectEventObservable(EthFilter filter) {
        return web3j.ethLogObservable(filter).map(new Func1<Log, PublishProjectEventResponse>() {
            @Override
            public PublishProjectEventResponse call(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(PUBLISHPROJECT_EVENT, log);
                PublishProjectEventResponse typedResponse = new PublishProjectEventResponse();
                typedResponse.log = log;
                typedResponse.publisher = (String) eventValues.getNonIndexedValues().get(0).getValue();
                typedResponse.time = (String) eventValues.getNonIndexedValues().get(1).getValue();
                typedResponse.projectName = (String) eventValues.getNonIndexedValues().get(2).getValue();
                typedResponse.projectHash = (String) eventValues.getNonIndexedValues().get(3).getValue();
                return typedResponse;
            }
        });
    }

    public Observable<PublishProjectEventResponse> publishProjectEventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(PUBLISHPROJECT_EVENT));
        return publishProjectEventObservable(filter);
    }

    public List<BuyProjectEventResponse> getBuyProjectEvents(TransactionReceipt transactionReceipt) {
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(BUYPROJECT_EVENT, transactionReceipt);
        ArrayList<BuyProjectEventResponse> responses = new ArrayList<BuyProjectEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            BuyProjectEventResponse typedResponse = new BuyProjectEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.buyer = (String) eventValues.getNonIndexedValues().get(0).getValue();
            typedResponse.time = (String) eventValues.getNonIndexedValues().get(1).getValue();
            typedResponse.projectName = (String) eventValues.getNonIndexedValues().get(2).getValue();
            typedResponse.projectHash = (String) eventValues.getNonIndexedValues().get(3).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Observable<BuyProjectEventResponse> buyProjectEventObservable(EthFilter filter) {
        return web3j.ethLogObservable(filter).map(new Func1<Log, BuyProjectEventResponse>() {
            @Override
            public BuyProjectEventResponse call(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(BUYPROJECT_EVENT, log);
                BuyProjectEventResponse typedResponse = new BuyProjectEventResponse();
                typedResponse.log = log;
                typedResponse.buyer = (String) eventValues.getNonIndexedValues().get(0).getValue();
                typedResponse.time = (String) eventValues.getNonIndexedValues().get(1).getValue();
                typedResponse.projectName = (String) eventValues.getNonIndexedValues().get(2).getValue();
                typedResponse.projectHash = (String) eventValues.getNonIndexedValues().get(3).getValue();
                return typedResponse;
            }
        });
    }

    public Observable<BuyProjectEventResponse> buyProjectEventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(BUYPROJECT_EVENT));
        return buyProjectEventObservable(filter);
    }

    public List<PublishDemandEventResponse> getPublishDemandEvents(TransactionReceipt transactionReceipt) {
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(PUBLISHDEMAND_EVENT, transactionReceipt);
        ArrayList<PublishDemandEventResponse> responses = new ArrayList<PublishDemandEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            PublishDemandEventResponse typedResponse = new PublishDemandEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.publisher = (String) eventValues.getNonIndexedValues().get(0).getValue();
            typedResponse.time = (String) eventValues.getNonIndexedValues().get(1).getValue();
            typedResponse.demandName = (String) eventValues.getNonIndexedValues().get(2).getValue();
            typedResponse.deamndHash = (String) eventValues.getNonIndexedValues().get(3).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Observable<PublishDemandEventResponse> publishDemandEventObservable(EthFilter filter) {
        return web3j.ethLogObservable(filter).map(new Func1<Log, PublishDemandEventResponse>() {
            @Override
            public PublishDemandEventResponse call(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(PUBLISHDEMAND_EVENT, log);
                PublishDemandEventResponse typedResponse = new PublishDemandEventResponse();
                typedResponse.log = log;
                typedResponse.publisher = (String) eventValues.getNonIndexedValues().get(0).getValue();
                typedResponse.time = (String) eventValues.getNonIndexedValues().get(1).getValue();
                typedResponse.demandName = (String) eventValues.getNonIndexedValues().get(2).getValue();
                typedResponse.deamndHash = (String) eventValues.getNonIndexedValues().get(3).getValue();
                return typedResponse;
            }
        });
    }

    public Observable<PublishDemandEventResponse> publishDemandEventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(PUBLISHDEMAND_EVENT));
        return publishDemandEventObservable(filter);
    }

    public List<AnswerDemandEventResponse> getAnswerDemandEvents(TransactionReceipt transactionReceipt) {
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(ANSWERDEMAND_EVENT, transactionReceipt);
        ArrayList<AnswerDemandEventResponse> responses = new ArrayList<AnswerDemandEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            AnswerDemandEventResponse typedResponse = new AnswerDemandEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse._answerer = (String) eventValues.getNonIndexedValues().get(0).getValue();
            typedResponse._time = (String) eventValues.getNonIndexedValues().get(1).getValue();
            typedResponse._demandName = (String) eventValues.getNonIndexedValues().get(2).getValue();
            typedResponse._answerHash = (String) eventValues.getNonIndexedValues().get(3).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Observable<AnswerDemandEventResponse> answerDemandEventObservable(EthFilter filter) {
        return web3j.ethLogObservable(filter).map(new Func1<Log, AnswerDemandEventResponse>() {
            @Override
            public AnswerDemandEventResponse call(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(ANSWERDEMAND_EVENT, log);
                AnswerDemandEventResponse typedResponse = new AnswerDemandEventResponse();
                typedResponse.log = log;
                typedResponse._answerer = (String) eventValues.getNonIndexedValues().get(0).getValue();
                typedResponse._time = (String) eventValues.getNonIndexedValues().get(1).getValue();
                typedResponse._demandName = (String) eventValues.getNonIndexedValues().get(2).getValue();
                typedResponse._answerHash = (String) eventValues.getNonIndexedValues().get(3).getValue();
                return typedResponse;
            }
        });
    }

    public Observable<AnswerDemandEventResponse> answerDemandEventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(ANSWERDEMAND_EVENT));
        return answerDemandEventObservable(filter);
    }

    public List<PublishProjectAndSendBPEventResponse> getPublishProjectAndSendBPEvents(TransactionReceipt transactionReceipt) {
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(PUBLISHPROJECTANDSENDBP_EVENT, transactionReceipt);
        ArrayList<PublishProjectAndSendBPEventResponse> responses = new ArrayList<PublishProjectAndSendBPEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            PublishProjectAndSendBPEventResponse typedResponse = new PublishProjectAndSendBPEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.publisher = (String) eventValues.getNonIndexedValues().get(0).getValue();
            typedResponse.time = (String) eventValues.getNonIndexedValues().get(1).getValue();
            typedResponse.projectName = (String) eventValues.getNonIndexedValues().get(2).getValue();
            typedResponse.projectHash = (String) eventValues.getNonIndexedValues().get(3).getValue();
            typedResponse.bp = (byte[]) eventValues.getNonIndexedValues().get(4).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Observable<PublishProjectAndSendBPEventResponse> publishProjectAndSendBPEventObservable(EthFilter filter) {
        return web3j.ethLogObservable(filter).map(new Func1<Log, PublishProjectAndSendBPEventResponse>() {
            @Override
            public PublishProjectAndSendBPEventResponse call(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(PUBLISHPROJECTANDSENDBP_EVENT, log);
                PublishProjectAndSendBPEventResponse typedResponse = new PublishProjectAndSendBPEventResponse();
                typedResponse.log = log;
                typedResponse.publisher = (String) eventValues.getNonIndexedValues().get(0).getValue();
                typedResponse.time = (String) eventValues.getNonIndexedValues().get(1).getValue();
                typedResponse.projectName = (String) eventValues.getNonIndexedValues().get(2).getValue();
                typedResponse.projectHash = (String) eventValues.getNonIndexedValues().get(3).getValue();
                typedResponse.bp = (byte[]) eventValues.getNonIndexedValues().get(4).getValue();
                return typedResponse;
            }
        });
    }

    public Observable<PublishProjectAndSendBPEventResponse> publishProjectAndSendBPEventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(PUBLISHPROJECTANDSENDBP_EVENT));
        return publishProjectAndSendBPEventObservable(filter);
    }

    public List<BurnEventResponse> getBurnEvents(TransactionReceipt transactionReceipt) {
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(BURN_EVENT, transactionReceipt);
        ArrayList<BurnEventResponse> responses = new ArrayList<BurnEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            BurnEventResponse typedResponse = new BurnEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.burner = (String) eventValues.getIndexedValues().get(0).getValue();
            typedResponse.value = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Observable<BurnEventResponse> burnEventObservable(EthFilter filter) {
        return web3j.ethLogObservable(filter).map(new Func1<Log, BurnEventResponse>() {
            @Override
            public BurnEventResponse call(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(BURN_EVENT, log);
                BurnEventResponse typedResponse = new BurnEventResponse();
                typedResponse.log = log;
                typedResponse.burner = (String) eventValues.getIndexedValues().get(0).getValue();
                typedResponse.value = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
                return typedResponse;
            }
        });
    }

    public Observable<BurnEventResponse> burnEventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(BURN_EVENT));
        return burnEventObservable(filter);
    }

    public List<PauseEventResponse> getPauseEvents(TransactionReceipt transactionReceipt) {
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(PAUSE_EVENT, transactionReceipt);
        ArrayList<PauseEventResponse> responses = new ArrayList<PauseEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            PauseEventResponse typedResponse = new PauseEventResponse();
            typedResponse.log = eventValues.getLog();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Observable<PauseEventResponse> pauseEventObservable(EthFilter filter) {
        return web3j.ethLogObservable(filter).map(new Func1<Log, PauseEventResponse>() {
            @Override
            public PauseEventResponse call(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(PAUSE_EVENT, log);
                PauseEventResponse typedResponse = new PauseEventResponse();
                typedResponse.log = log;
                return typedResponse;
            }
        });
    }

    public Observable<PauseEventResponse> pauseEventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(PAUSE_EVENT));
        return pauseEventObservable(filter);
    }

    public List<UnpauseEventResponse> getUnpauseEvents(TransactionReceipt transactionReceipt) {
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(UNPAUSE_EVENT, transactionReceipt);
        ArrayList<UnpauseEventResponse> responses = new ArrayList<UnpauseEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            UnpauseEventResponse typedResponse = new UnpauseEventResponse();
            typedResponse.log = eventValues.getLog();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Observable<UnpauseEventResponse> unpauseEventObservable(EthFilter filter) {
        return web3j.ethLogObservable(filter).map(new Func1<Log, UnpauseEventResponse>() {
            @Override
            public UnpauseEventResponse call(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(UNPAUSE_EVENT, log);
                UnpauseEventResponse typedResponse = new UnpauseEventResponse();
                typedResponse.log = log;
                return typedResponse;
            }
        });
    }

    public Observable<UnpauseEventResponse> unpauseEventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(UNPAUSE_EVENT));
        return unpauseEventObservable(filter);
    }

    public List<OwnershipTransferredEventResponse> getOwnershipTransferredEvents(TransactionReceipt transactionReceipt) {
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(OWNERSHIPTRANSFERRED_EVENT, transactionReceipt);
        ArrayList<OwnershipTransferredEventResponse> responses = new ArrayList<OwnershipTransferredEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            OwnershipTransferredEventResponse typedResponse = new OwnershipTransferredEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.previousOwner = (String) eventValues.getIndexedValues().get(0).getValue();
            typedResponse.newOwner = (String) eventValues.getIndexedValues().get(1).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Observable<OwnershipTransferredEventResponse> ownershipTransferredEventObservable(EthFilter filter) {
        return web3j.ethLogObservable(filter).map(new Func1<Log, OwnershipTransferredEventResponse>() {
            @Override
            public OwnershipTransferredEventResponse call(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(OWNERSHIPTRANSFERRED_EVENT, log);
                OwnershipTransferredEventResponse typedResponse = new OwnershipTransferredEventResponse();
                typedResponse.log = log;
                typedResponse.previousOwner = (String) eventValues.getIndexedValues().get(0).getValue();
                typedResponse.newOwner = (String) eventValues.getIndexedValues().get(1).getValue();
                return typedResponse;
            }
        });
    }

    public Observable<OwnershipTransferredEventResponse> ownershipTransferredEventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(OWNERSHIPTRANSFERRED_EVENT));
        return ownershipTransferredEventObservable(filter);
    }

    public List<ApprovalEventResponse> getApprovalEvents(TransactionReceipt transactionReceipt) {
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(APPROVAL_EVENT, transactionReceipt);
        ArrayList<ApprovalEventResponse> responses = new ArrayList<ApprovalEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            ApprovalEventResponse typedResponse = new ApprovalEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.owner = (String) eventValues.getIndexedValues().get(0).getValue();
            typedResponse.spender = (String) eventValues.getIndexedValues().get(1).getValue();
            typedResponse.value = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Observable<ApprovalEventResponse> approvalEventObservable(EthFilter filter) {
        return web3j.ethLogObservable(filter).map(new Func1<Log, ApprovalEventResponse>() {
            @Override
            public ApprovalEventResponse call(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(APPROVAL_EVENT, log);
                ApprovalEventResponse typedResponse = new ApprovalEventResponse();
                typedResponse.log = log;
                typedResponse.owner = (String) eventValues.getIndexedValues().get(0).getValue();
                typedResponse.spender = (String) eventValues.getIndexedValues().get(1).getValue();
                typedResponse.value = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
                return typedResponse;
            }
        });
    }

    public Observable<ApprovalEventResponse> approvalEventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(APPROVAL_EVENT));
        return approvalEventObservable(filter);
    }

    public List<TransferEventResponse> getTransferEvents(TransactionReceipt transactionReceipt) {
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(TRANSFER_EVENT, transactionReceipt);
        ArrayList<TransferEventResponse> responses = new ArrayList<TransferEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            TransferEventResponse typedResponse = new TransferEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.from = (String) eventValues.getIndexedValues().get(0).getValue();
            typedResponse.to = (String) eventValues.getIndexedValues().get(1).getValue();
            typedResponse.value = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Observable<TransferEventResponse> transferEventObservable(EthFilter filter) {
        return web3j.ethLogObservable(filter).map(new Func1<Log, TransferEventResponse>() {
            @Override
            public TransferEventResponse call(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(TRANSFER_EVENT, log);
                TransferEventResponse typedResponse = new TransferEventResponse();
                typedResponse.log = log;
                typedResponse.from = (String) eventValues.getIndexedValues().get(0).getValue();
                typedResponse.to = (String) eventValues.getIndexedValues().get(1).getValue();
                typedResponse.value = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
                return typedResponse;
            }
        });
    }

    public Observable<TransferEventResponse> transferEventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(TRANSFER_EVENT));
        return transferEventObservable(filter);
    }

    public static RemoteCall<DevToken> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(DevToken.class, web3j, credentials, gasPrice, gasLimit, BINARY, "");
    }

    public static RemoteCall<DevToken> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(DevToken.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "");
    }

    public static DevToken load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new DevToken(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    public static DevToken load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new DevToken(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static class PublishProjectEventResponse {
        public Log log;

        public String publisher;

        public String time;

        public String projectName;

        public String projectHash;
    }

    public static class BuyProjectEventResponse {
        public Log log;

        public String buyer;

        public String time;

        public String projectName;

        public String projectHash;
    }

    public static class PublishDemandEventResponse {
        public Log log;

        public String publisher;

        public String time;

        public String demandName;

        public String deamndHash;
    }

    public static class AnswerDemandEventResponse {
        public Log log;

        public String _answerer;

        public String _time;

        public String _demandName;

        public String _answerHash;
    }

    public static class PublishProjectAndSendBPEventResponse {
        public Log log;

        public String publisher;

        public String time;

        public String projectName;

        public String projectHash;

        public byte[] bp;
    }

    public static class BurnEventResponse {
        public Log log;

        public String burner;

        public BigInteger value;
    }

    public static class PauseEventResponse {
        public Log log;
    }

    public static class UnpauseEventResponse {
        public Log log;
    }

    public static class OwnershipTransferredEventResponse {
        public Log log;

        public String previousOwner;

        public String newOwner;
    }

    public static class ApprovalEventResponse {
        public Log log;

        public String owner;

        public String spender;

        public BigInteger value;
    }

    public static class TransferEventResponse {
        public Log log;

        public String from;

        public String to;

        public BigInteger value;
    }
}
