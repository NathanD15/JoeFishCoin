package JoeFishCoin;

import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

class Block {
   private byte[] hash;
   private byte[] previousBlockHash;
   
   private ArrayList<Transaction> transactions;
   
   Block(String p) throws NoSuchAlgorithmException {
      transactions = new ArrayList<Transaction>(0);
      previousBlockHash = Hash.SHA256(p);
      hash = this.CreateBlockHash();
   }

   Block(byte[] p) throws NoSuchAlgorithmException {
      transactions = new ArrayList<Transaction>(0);
      previousBlockHash = p;
      hash = this.CreateBlockHash();
   }
   
   Block(byte[] p, ArrayList<Transaction>  f) throws NoSuchAlgorithmException {
      transactions = f;
      previousBlockHash = p;
      hash = this.CreateBlockHash();
   }

   public byte[] CreateBlockHash(){
      try {
         return Hash.SHA256( this.getPreviousBlockHashString() +String.valueOf(transactions.toString() ) );
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
      return transactions.toString();
   }

}

