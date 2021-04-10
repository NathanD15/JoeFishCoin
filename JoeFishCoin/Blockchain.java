package JoeFishCoin;

import java.util.ArrayList;
import java.util.LinkedList;
import java.security.NoSuchAlgorithmException; 

class Blockchain {
   private LinkedList<Block> chain;
   private ArrayList<Transaction> PindingTransactions;
   private int difficulty;


   Blockchain() throws NoSuchAlgorithmException{
      difficulty = 3;
      PindingTransactions = new ArrayList<Transaction>(0);
      chain = new LinkedList<Block>();
      chain.add( createFirstBlock() );
   }
   
   private Block createFirstBlock() throws NoSuchAlgorithmException {
      return new Block(new byte[0], new ArrayList<Transaction>(0), 0 );
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
   
   public void addBlock(int MiningNum ) throws NoSuchAlgorithmException{
      chain.add( new Block(getLatestBlock().getHash(), PindingTransactions, MiningNum) );
      PindingTransactions.clear();
   }



   public void addTransaction(String sender, String reciever, double amount ) throws NoSuchAlgorithmException{
      PindingTransactions.add( new Transaction(sender, reciever, amount) );
   }


   public void mine( ) throws NoSuchAlgorithmException{
      String testHash ="";
      String key = "0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000";
      int MiningNum =0;
      while(true){
         try {
            testHash = Hash.toString(Hash.SHA256( chain.getLast().getPreviousBlockHashString() + PindingTransactions.toString() + MiningNum));
         } catch (NoSuchAlgorithmException e) {}
         MiningNum++;

         if(testHash.substring(0, difficulty).equals(key.substring(0, difficulty)) ){
            //System.out.println(MiningNum);
            addBlock(MiningNum);
            break;
         }
      }
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

   public double getBalance(String address){
      double amount = 0;
      for(int i = 0; i < chain.size(); i++){
         for(int j = 0; j < chain.get(i).getTransactionLength(); j++){
            if(chain.get(i).getTransaction(j).getReciever().equals(address)){
               amount+=chain.get(i).getTransaction(j).getAmount();
            }
            if(chain.get(i).getTransaction(j).getSender().equals(address)){
               amount-=chain.get(i).getTransaction(j).getAmount();
            }
            
         }
      }
         return amount;
      
   }
}

