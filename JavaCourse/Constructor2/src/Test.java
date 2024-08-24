public class Test {
    public static void main(String[] args) {
        
        Account account1 = new Account();
        
        //System.out.println(account1.getEmail());
        
        Account account2 = new Account("Ahmet", "example@gmail.com", "58429523");
        
        /*System.out.println("İsim: " + account2.getIsim());
        System.out.println("Email: " + account2.getEmail() );
        System.out.println("Bakiye: " + account2.getBakiye());
        */
        account2.bilgileriGonder();
    }
}
