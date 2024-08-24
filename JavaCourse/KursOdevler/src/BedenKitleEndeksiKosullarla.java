
import java.util.Scanner;

public class BedenKitleEndeksiKosullarla {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Kilonuz: ");
        int kilo = scanner.nextInt();
        
        System.out.print("Boyunuz: ");
        double boy = scanner.nextDouble();
        
        double indeks = kilo / (boy * boy);
                
        if (indeks < 18.5) {
            System.out.print("Zayıf.");
        }
        else if (indeks >= 18.5 && indeks < 25) {
            System.out.print("Normal.");
        }
        else if (indeks >= 25 && indeks < 30) {
            System.out.print("Fazla Kilolu.");
        }
        else {
            System.out.print("Obez.");
        }
    }
}
