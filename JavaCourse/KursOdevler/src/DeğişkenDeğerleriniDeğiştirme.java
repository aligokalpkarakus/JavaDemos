
import java.util.Scanner;

public class DeğişkenDeğerleriniDeğiştirme {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int birinci_sayi;
        int ikinci_sayi;
        
        System.out.print("Birinci sayı: ");
        birinci_sayi = scanner.nextInt();
        
        System.out.print("İkinci sayı:");
        ikinci_sayi = scanner.nextInt();
        
        System.out.print("Değişmeden önce..");
        System.out.print("Birinci sayı: "+birinci_sayi+ " İkinci sayı: "+ ikinci_sayi);
        
        int gecici = birinci_sayi;
        birinci_sayi = ikinci_sayi;
        ikinci_sayi = gecici;
        
        System.out.print("Değiştikten sonra..");
        System.out.print("Birinci sayı: " + birinci_sayi + " İkinci sayı: " + ikinci_sayi);
    } 
    
}
