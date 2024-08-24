
import java.util.Scanner;

public class SwitchCaseHesapMakinesi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("*******************");
        String islemler = "1. Toplama İşlemi\n"
                + "2. Çıkarma İşlemi\n"
                + "3. Çarpma İşlemi\n"
                + "4. Bölme İşlemi";
        System.out.println(islemler);
        System.out.println("*******************");
        
        System.out.print("İşemi seçiniz: ");
        String islem = scanner.nextLine();
        
        int a;
        int b; 
        
        switch(islem) {
            case "1":
                System.out.print("1. sayı: ");
                a = scanner.nextInt();
                System.out.print("2. sayı: ");
                b = scanner.nextInt();
                System.out.println("Toplam: "+ ( a + b));
                break;
            case "2":
                System.out.print("1. sayı: ");
                a = scanner.nextInt();
                System.out.print("2. sayı: ");
                b = scanner.nextInt();
                System.out.println("Fark: "+ ( a - b));
                break;
            case "3":
                System.out.print("1. sayı: ");
                a = scanner.nextInt();
                System.out.print("2. sayı: ");
                b = scanner.nextInt();
                System.out.println("Çarpım: "+ ( a * b));
                break;
            case "4":
                System.out.print("1. sayı: ");
                a = scanner.nextInt();
                System.out.print("2. sayı: ");
                b = scanner.nextInt();
                System.out.print("Bölüm: "+ (double)( a / b));
                break;
            default:
                System.out.print("Hatalı giriş.");
                break;
                
                   
        }            
    }
}
