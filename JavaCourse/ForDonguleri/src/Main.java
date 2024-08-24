
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        for (baslatma ; kosul ; artırma veya azaltma) {
        
        }
        */
        
        /*
        int i;
        
        for (i = 0; i < 5; i++) {
            System.out.println("i = " +i);
        }
        */
        
        /*
        for (int i = 0; i < 5; i++) {
            System.out.println("i = "+i);
        }
        */
        
        /*
        for (int i = 10; i >= 0; i--) {
            System.out.println("i = "+i);
        }
        */
        
        /*
        int i = 0;
        
        for (; i < 5; i++) {
            System.out.println("Java Öğreniyom");
        }
        */
        
        /*
        int i = 0;
        int j = 0;
        
        for (; i<10 && j > 0; i++, j--) {
            System.out.println("i = " + i);
            System.out.println("j = " + j);
                    
        }
        */
        
        /*
        for (int i = 2; i < 100; i *= 2){
            System.out.println("i = " + i);
            
        }
        */
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Faktöriyeli istenen sayı: ");
        int sayi = scanner.nextInt();
        int faktoriyel = 1;
        
        for (int i = 1; i <= sayi; i++) {
            faktoriyel *= i;
            
        }
            System.out.println("Faktöriyel : " + faktoriyel);
            
    }
}
