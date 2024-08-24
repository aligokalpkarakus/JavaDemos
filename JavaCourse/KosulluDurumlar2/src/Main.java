
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        if (kosul) {
        
        }
        
        else if (baska bir kosul) {
        
        }
        
        else if (baska bir kosul {
        
        }
        
        else {
        
        }
        */
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("İşlem giriniz: ");
        int islem = scanner.nextInt();
        
        if (islem == 1){
            System.out.print("1. işlem");
            
        }
        else if (islem == 2){
            System.out.print("2. işlem");
            
        }
        else if (islem == 3) {
            System.out.print("3. işlem");
            
        }
        else if (islem == 4) {
            System.out.print("4. işlem");
            
        }
        else {
            System.out.print("Hatalı giriş");
        }
    }
        
}
