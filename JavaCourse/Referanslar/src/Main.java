public class Main {
    public static void main(String[] args) {
        
        Account account1 = new Account("Ali Gökalp Karakuş", "gokalp@gmail.com", "124214");
                
        // account1 obje oluyor.
                /* account sınıfı oluşturuyoruz new account ile account objesi oluşturuyoruz
                new account şeklindeki ifade bize account classından bir referans çıktısı veriyor
                        biz de bu çıktıyı bir rreferansla eşitliyoruz (account1)
                */
        
                /*
        Account account2 = account1;
        // iki referans da aynı şeyi gösteriyor.
        
        Account account3 = new Account();
        
        if (account1 == account2){
            System.out.println("Aynı");
        }
        
        if (account1 == account3){
            System.out.println("Aynı");
        }
        else {
            System.out.println("değil"); 
        } */
                
        new Account("Gökalp", "gökalpgmail.com","325232").bilgileriGonder();
        
        





        
    }
}
