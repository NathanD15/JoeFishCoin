package JoeFishCoin;

import java.util.LinkedList;
import java.security.NoSuchAlgorithmException; 

class Blockchain {
   private LinkedList<Block> chain;
   

   Blockchain() throws NoSuchAlgorithmException{
      chain = new LinkedList<Block>();
      chain.add( createFirstBlock() );
   }
   
   private Block createFirstBlock() throws NoSuchAlgorithmException {
      return new Block("1", "0", 1);
   }
   
   public Block getBlockAtIndex(int i){
      return chain.get(i);
   }

   public Block getLatestBlock(){
      return chain.getLast();
   }
   
   public void addBlock(String hash, int data ) throws NoSuchAlgorithmException{
      chain.add( new Block(hash, getLatestBlock().getHash() , data) );
   }

   public boolean isValid(){
      for(int i = 1; i < chain.size(); i++){
         if(!chain.get(i-1).getHashString().equals(chain.get(i).getPreviousBlockHashString() ) ){
            return false;
         }
      }

      return true;
   }
}

