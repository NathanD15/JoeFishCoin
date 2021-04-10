package JoeFishCoin;

import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

class Block {
   private byte[] hash;
   private byte[] previousBlockHash;
   private int MiningNum;

   private ArrayList<Transaction> transactions;
   
   Block(byte[] p, ArrayList<Transaction>  f, int m) throws NoSuchAlgorithmException {
      try{
         transactions = (ArrayList<Transaction>)f.clone();
      }catch(Exception e){
         transactions = new ArrayList<Transaction>(0);
      }
      previousBlockHash = p;
      MiningNum = m;
      hash = this.CreateBlockHash();
   }

   /*Block(String p, ArrayList<Transaction>  f) throws NoSuchAlgorithmException {
      try{
         transactions.addAll(f);
         System.out.print("1");
      }catch(NullPointerException e){
         System.out.print("Null");
         transactions = new ArrayList<Transaction>(0);
      }
      previousBlockHash = Hash.SHA256(p);
      hash = this.CreateBlockHash();
   }*/



   public byte[] CreateBlockHash(){
      try {
         return Hash.SHA256( this.getPreviousBlockHashString() +String.valueOf(transactions.toString() ) + MiningNum);
      } catch (NoSuchAlgorithmException e) {
         e.printStackTrace();
         return new byte[0] ;
      }
   }

   public byte[] getPreviousBlockHash(){
      return previousBlockHash;
   }

   public String getPreviousBlockHashString(){
      return Hash.toString(previousBlockHash);
   }


   public byte[] getHash(){
      return hash;
   }
   
   public String getHashString(){
      return Hash.toString(hash);
   }

   public String getTransactions(){
      //return transactions.toString();
      String str = "";
      for(int i = 0; i < transactions.size(); i++){
         str += transactions.get(i).getSender() +" pays " + transactions.get(i).getReciever() +" $"+ transactions.get(i).getAmount() +"\n";
      }

      return str;
   }

}

