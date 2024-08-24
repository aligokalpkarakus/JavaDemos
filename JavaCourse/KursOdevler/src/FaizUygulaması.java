
import java.util.Scanner;

public class FaizUygulaması {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Anaparayı giriniz: ");
        int anapara = scanner.nextInt();
        System.out.print("Kaç yıl vadeli yatırılacak: ");
        int yıl = scanner.nextInt();
        
        double faiz = 0.06;
        double toplam_para = anapara;
        
        for (int i = 1; yıl >= i; i++) {
            toplam_para += toplam_para * faiz;
            System.out.println(i+ ". yılın sonunda toplam para: " + (int)toplam_para);
            
            
        }
    }
}
