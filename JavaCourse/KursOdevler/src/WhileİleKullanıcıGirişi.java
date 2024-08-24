
import java.util.Scanner;

public class WhileİleKullanıcıGirişi {
    public static void main(String[] args) {
        // while döngüsü yardımıyla bir kullanıcı girişi yazmaya çalışın.
        
        Scanner scanner = new Scanner(System.in);
        
        int giris_hakki = 3;
        
        String sys_kullanici_adi = "Ali Gökalp";
        String sys_parola = "12345";
        
        System.out.println("********************************");
        System.out.println("Kullanıcı Girişine Hoşgeldiniz..");
        System.out.println("********************************");
        
        while (true){
            System.out.print("Kullanıcı Adı: ");
            String kullanici = scanner.nextLine();
            System.out.print("Parola: ");
            String parola = scanner.nextLine();
            
            if (parola.equals(sys_parola) && kullanici.equals(sys_kullanici_adi) ) {
                System.out.println("Hoşgeldiniz," + kullanici);
                break;
                
            }
            else if (kullanici.equals(sys_kullanici_adi) && !parola.equals(sys_parola)){
                System.out.println("Parola Yanlış.");
                giris_hakki--;
                System.out.println("Kalan Giriş Hakkı: " + giris_hakki);
            }
            else if (!kullanici.equals(sys_kullanici_adi) && parola.equals(sys_parola)){
                System.out.println("Kullanıcı Adı Yanlış.");
                giris_hakki--;
                System.out.println("Kalan Giriş Hakkı: " + giris_hakki);
            }
            else {
                System.out.println("Kullanıcı Adı ve Parola Yanlış.");
                giris_hakki--;
                System.out.println("Kalan Giriş Hakkı: " + giris_hakki);
            }
            
            if (giris_hakki == 0){
                System.out.println("Giriş Hakkınız Bitti. Tekrar Bekleriz.");
                break;
            }
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
