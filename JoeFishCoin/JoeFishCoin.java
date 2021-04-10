package JoeFishCoin;

import java.security.NoSuchAlgorithmException; 


class JoeFishCoin { 
    public static void main(String args[]) throws NoSuchAlgorithmException { 
        Blockchain JoeFishCoin = new Blockchain();
        JoeFishCoin.addTransaction("Nathan", "Joseph", 15);
        JoeFishCoin.mine();
        JoeFishCoin.addTransaction("Connor", "Nathan", 20);
        JoeFishCoin.mine();
        JoeFishCoin.addTransaction("Joseph", "Connor", 115);
        JoeFishCoin.mine();

        //System.out.println("\n\n"+ JoeFishCoin.getBlockAtIndex(1).getTransactions());
        System.out.println("\n"+ "IsValid :  "+ JoeFishCoin.isValid() + "\n\n");
        System.out.println("\n"+"Nathan :  "+ JoeFishCoin.getBalance("Nathan") );
        System.out.println("Joseph :  "+ JoeFishCoin.getBalance("Joseph"));
        System.out.println("Connor :  "+ JoeFishCoin.getBalance("Connor") + "\n\n");

    } 
    
}