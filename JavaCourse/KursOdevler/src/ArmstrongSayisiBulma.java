
import java.util.Scanner;

public class ArmstrongSayisiBulma {
    public static void main(String[] args) {
        /*
        1634 = 1^4 + 6^4 + 3^4 + 4^4  4 basamak sayısı
        */
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Sayı giriniz: ");
        int sayi = scanner.nextInt();
        System.out.print("Basamak sayısını giriniz: ");
        int basamak = scanner.nextInt();
        
        int gecici_sayi = sayi;
        int toplam = 0;
        
        do {
            int basamak_degeri = gecici_sayi % 10;
            gecici_sayi = gecici_sayi / 10;
            
            toplam += Math.pow(basamak_degeri,basamak);
        } while (gecici_sayi > 0);
        if (toplam == sayi){
            System.out.println(sayi + " sayısı bir armstrong sayısıdır.");
        }
        else {
            System.out.println(sayi + " sayısı bir armstrong sayısı değil.");
        }
        
    }
}
