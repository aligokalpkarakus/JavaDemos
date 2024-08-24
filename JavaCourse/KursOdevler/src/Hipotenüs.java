
import java.util.Scanner;

public class Hipotenüs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("İlk kenarı giriniz: ");
        int kenar1 = scanner.nextInt();
        
        System.out.print("İkinci kenarı giriniz: ");
        int kenar2 = scanner.nextInt();
        
        double hipotenus = Math.sqrt(kenar1 * kenar1 + kenar2 * kenar2);
                
        System.out.println("Girilen kenarlı olan üçgenin hipotenüsü: "+hipotenus);
    }
    
}
