
import java.util.Scanner;

public class GelişmişBirNotHesaplama {
    public static void main(String[] args) {
        /*
        Kullanıcıdan vize 1 ve2 ve final notu alınack harf sistemi oluşturulacak
        vize1 yüzde 30, vize2 yüzde 30 final yüzde 40 etki edecek
        DD alma ce 2.50 altında olma koşuluna göre tavsiye yazdırılacak
        */
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("1. vize notu: ");
        int vize1 = scanner.nextInt();
        System.out.print("2. vize notu: ");
        int vize2 = scanner.nextInt();
        System.out.print("Final notu: ");
        int finito = scanner.nextInt();
        
        System.out.print("Ortalamanızı giriniz: ");
        double yillik = scanner.nextDouble();
        
        double ort = vize1 * 0.3 + vize2 * 0.3 + finito * 0.4;
        
        if (ort >= 90) {
            System.out.println("Harf notunuz AA");
            
        }
        else if (ort < 90 && ort >= 85 ) {
            System.out.println("Harf notunuz BA");
            
        }
        else if (ort < 85 && ort >= 80) {
            System.out.println("Harf notunuz BB");
        }
        else if (ort < 80 && ort >= 75 ) {
            System.out.println("Harf notunuz CB");
            
        }
        else if (ort < 75 && ort >= 70 ) {
            System.out.println("Harf notunuz CC");
            
        }
        else if (ort < 70 && ort >= 65 ) {
            System.out.println("Harf notunuz DC");
            
        }
        else if (ort < 65 && ort >= 60 ) {
            System.out.println("Harf notunuz DD");
            
        }
        else if (ort < 60 && ort >= 55 ) {
            System.out.println("Harf notunuz FD, kaldınız");
            
        }
        else {
            System.out.print("Harf notunuz FF, kaldınız");
        }
        
        if (yillik < 2.5 || ort < 65){
            System.out.print("Daha çok çalışınız.");
        }
        
    }
}
