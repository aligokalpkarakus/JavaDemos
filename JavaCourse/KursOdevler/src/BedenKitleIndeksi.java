
import java.util.Scanner;

public class BedenKitleIndeksi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Kilonuzu giriniz (kg):");
        double kilo = scanner.nextDouble();
        
        System.out.println("Boyunuzu giriniz (m):");
        double boy = scanner.nextDouble();
        
        double indeks = kilo / (boy * boy);
        
        System.out.println("Beden kütle indeksiniz: " + indeks);
    }
    
}
