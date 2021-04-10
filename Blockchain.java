package JoeFishCoin;

import java.util.LinkedList;


class Blockchain {
   private LinkedList<Block> chain;
   
   Blockchain(){
      chain = new LinkedList<Block>();
      chain.add( createFirstBlock() );
   }
   
   private Block createFirstBlock(){
      return new Block("1", "0", 1);
   }
   
   
   public Block getLatestBlock(){
      return chain.getLast();
   }
   
   public void addBlock(String hast, int data ){
      chain.add( new Block("2", getLatestBlock().getHash() , 2) );
   }

}

