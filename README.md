# EthereumConnector
connect to ethereum using web3j

# usage
## deploy contract
deploy  the contract [pettoken.sol](https://github.com/gunslingeratlarge/EthereumConnector/blob/master/src/main/resources/petoken.sol) to rinkeby testnet. To deploy a contract you need to have metamask installed and a few ether in your test account. If you don't have an ethereum account [MyEtherWallet](https://MyEtherWallet.com) is a good place to get one.  
You can get some ether in Rinkeby testnet just [here](https://www.rinkeby.io/#faucet).  
## configure blockchain.properties
Modify [blockchain.properties](https://github.com/gunslingeratlarge/EthereumConnector/blob/master/src/main/resources/blockchain.properties) before conduct any transaction. You have to change at least contract address, owner address, password and keyfile to your own information. If you don't prefer having an Ethereum client runing locally, an infura cloud client may come in handy. However, infura doesn't support account creation so `addUser` will throw an error if you are using infura client.
``` 
#where contract is deployed
contract.address=0xc41Cc72eA84d117A096F938B807657722bD7738C

#owner of above contract, not used explicitly
owner.address=0xb6060daeb3a0fD0AfEe80aED0e64126F3528150b
#contract owner password
owner.password=123456789
#owner keyfile location
owner.keyfile=F:/keyfile

#network
# http endpoint(To enable user creation must use local geth client and http://127.0.0.1:8545)
web3j.url=https://rinkeby.infura.io/<YOUR TOKEN>
#web3j.url=http://127.0.0.1:8545

#gas configuration
gas.price=3000000000
gas.limit=300000
```
## interact with contract
``` java
BlockChain bc = new BlockChainImpl();
bc.getBalaceOf("0xb6060daeb3a0fD0AfEe80aED0e64126F3528150b");
```
just as simple as that.  
