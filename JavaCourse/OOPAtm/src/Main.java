public class Main {
    public static void main(String[] args) {
        
        /*
        OOP ATM PROGRAMI
        LOGİN CLASSI KULLANICI GİRİŞİNİ KONTROL EDECEK
        HESAP CLASSI HESAP İŞLEMLERİNİ YAPACAK
        ATM İSE ATMİMİZİ ÇALIŞTIRACAK
        */
        
        ATM atm = new ATM();
        
        Hesap hesap = new Hesap("Ali Gökalp", "fonye", 500);
    
        atm.calis(hesap);
        System.out.println("Programdan Çıkılıyor..");
        
    }
    
    
    
}
