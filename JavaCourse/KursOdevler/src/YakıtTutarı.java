
import java.util.Scanner;

public class YakıtTutarı {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Kilometrede ne kadar yakıyor: ");
        double yakma = scanner.nextDouble();
        
        System.out.print("Kaç kilometre gidildi: ");
        double yol = scanner.nextDouble();
        
        double maliyet = yol * yakma;
        
        System.out.print("Maliyet: "+maliyet);
                
       
    }
    
}
