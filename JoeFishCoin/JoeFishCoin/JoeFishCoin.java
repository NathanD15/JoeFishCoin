package JoeFishCoin;


class JoeFishCoin { 
    public static void main(String args[]) throws Exception { 
        Blockchain JoeFishCoin = new Blockchain();
        Account Nathan = new Account();
        Account Joseph = new Account();
        Account Connor = new Account();

        /*JoeFishCoin.addTransaction(Nathan.getPublicKey(), Nathan.privateKey, Joseph.getPublicKey(), 15);
        JoeFishCoin.mine();
        JoeFishCoin.addTransaction(Connor.getPublicKey(), Connor.privateKey, Nathan.getPublicKey(), 20);
        JoeFishCoin.mine();
        JoeFishCoin.addTransaction(Joseph.getPublicKey(), Joseph.privateKey, Connor.getPublicKey(), 115);
        JoeFishCoin.mine();

        System.out.println("\n"+ "IsValid :  "+ JoeFishCoin.isValid() + "\n\n");
        System.out.println("\n"+"Nathan :  "+ JoeFishCoin.getBalance(Nathan.getPublicKey(), Nathan.privateKey) );
        System.out.println(     "Joseph :  "+ JoeFishCoin.getBalance(Joseph.getPublicKey(), Joseph.privateKey) );
        System.out.println(     "Connor :  "+ JoeFishCoin.getBalance(Connor.getPublicKey(), Connor.privateKey) + "\n\n");
        */



        String str = new String(asymmetric_encryption.descrypt(asymmetric_encryption.encrypt("Valid Key".getBytes(), Nathan.getPublicKey()), Nathan.privateKey));

        String str2 = new String(asymmetric_encryption.descrypt(asymmetric_encryption.encrypt("Valid Key".getBytes(), Connor.getPublicKey()), Connor.privateKey));

        System.out.println( str.equals(str2)  );

        //.equals("Valid Key")
    } 
    
}