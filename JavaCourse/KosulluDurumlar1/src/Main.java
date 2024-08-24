
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        if (kosul) {
            koşul sağlanırsa (true) bu blok çalışır
        }
        
        else {
            bu bloğun üstündeki herhangi bir koşul sağlanmaığında çalışır
        }
        */
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Yaşınızı giriniz: ");
        int yas = scanner.nextInt();
        
        if (yas >= 10) {
            System.out.print("Yaş 10'dan büyük");
        }
        
        else {
            System.out.print("Yaş 10'dan küçük");
        }
    }
}
