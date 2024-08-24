
import java.util.Scanner;

public class WhileAtmProgramı {
    public static void main(String[] args) {
        /*
        While döngüsü yardımıyla bir tane ATM  programı yapmaya çalışın.
        
        İşlemler
        1. İşlem: Bakiye Öğrenme
        2. İşlem: Para Çekme
        3. İşlem Para Yatırma
        Çıkış : q
        */
        
        Scanner scanner = new Scanner(System.in);
        
        int bakiye = 1000;
        System.out.println("           ATM");
        
        String islemler = "1. İşlem: Bakiye Öğrenme\n"
                + "2. İşlem: Para Çekme\n"
                + "3. İşlem: Para Yatırma\n"
                + "4. Çıkış: q";
        System.out.println("***************************");
        System.out.println(islemler);
        System.out.println("***************************");
        
        while (true) {
            System.out.print("İşlemi Seçiniz: ");
            String islem = scanner.nextLine();
            
            if (islem.equals("q")) {
                System.out.println("Yine Bekleriz...");
                break;
            }
            else if (islem.equals("1")) {
                System.out.println("Bakiyeniz: " + bakiye);
            }
            else if (islem.equals("2")) {
                System.out.println("Para Çekme İşlemi Seçildi");
                System.out.print("Çekilecek Miktarı Giriniz:");
                int miktar = scanner.nextInt();
                scanner.nextLine();
                if (bakiye - miktar < 0) {
                    System.out.println("Yeterli Bakiye Yok. Bakiyeniz: " + bakiye);
                }
                else {
                    System.out.println("Çekilen Para: " + miktar);
                    bakiye -= miktar;
                    System.out.println("Kalan Para: " + bakiye);
                    
                }      
            }
            else if (islem.equals("3")) {
                System.out.println("Para Yatırma İşlemi Seçildi");
                System.out.print("Yatırılacak Miktarı Giriniz:");
                int miktar = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Yatırılan Para: " + miktar);
                bakiye += miktar;
                System.out.println("Güncel Para: " + bakiye);
                
            }
            else {
                System.out.println("Geçersiz İşlem...");
            }
        } 
    }
}
 