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
   
   public void addBlock(String hast, int data ) throws NoSuchAlgorithmException{
      chain.add( new Block("2", getLatestBlock().getHash() , 2) );
   }

}

