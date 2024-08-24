
import java.util.Scanner;

public class Main {
    public static void selamlama() {
        System.out.println("Merhaba nasılsınız?");
        System.out.println("Selamlar");
    }
    
    public static void faktoriyel(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int sayi = scanner.nextInt();
        int fakto = 1;
        
        for (int i = 1; i <= sayi; i++){
            fakto *= i;
          
        }
        System.out.println("Faktoriyel = " + fakto);
    } 
    public static void main(String[] args) {
        /*
        Erişim_Belirleyici(opsiyonel) Ekstra_Özellikler Dönüş_Tipi Fonksiyon_Adı(parametreler) {
            fonksiyon bloğu
        }
        */
        selamlama();
        faktoriyel();
        
    }
}
