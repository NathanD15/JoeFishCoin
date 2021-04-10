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
      return new Block("0");
   }
   
   public Block getBlockAtIndex(int i){
      if(i<chain.size() ){
         return chain.get(i);
      }
      return chain.getLast();

   }

   public Block getLatestBlock(){
      return chain.getLast();
   }
   
   public void addBlock( ) throws NoSuchAlgorithmException{
      chain.add( new Block(getLatestBlock().getHash()) );
   }

   public boolean isValid(){
      for(int i = 0; i < chain.size()-1; i++){
         if(!chain.get(i).getHashString().equals(Hash.toString(chain.get(i).CreateBlockHash()) ) ){
            return false;
         }

         if(!chain.get(i).getHashString().equals(chain.get(i+1).getPreviousBlockHashString() ) ){
            return false;
         }
      }

      return true;
   }
}

