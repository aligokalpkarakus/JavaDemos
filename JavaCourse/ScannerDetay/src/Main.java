
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       /* int yas = scanner.nextInt();
        String isim = scanner.nextLine();
        System.out.println("Yaş:" + yas);
        System.out.println("İsim:" + isim); */
       /* çözüm 1
        int yas = scanner.nextInt();
        scanner.nextLine();
        String isim = scanner.nextLine();
        System.out.println("Yaş:" + yas);
        System.out.println("İsim:" + isim);*/
       
       /* çözüm 2
        String isim = scanner.nextLine();
        int yas = scanner.nextInt();
        System.out.println("Yaş:" + yas);
        System.out.println("İsim:" + isim); */
       
       int yas1 = scanner.nextInt();
       int yas2 = scanner.nextInt();
       int yas3 = scanner.nextInt();
       System.out.println("Yas1:"+yas1 + " Yas2:"+yas2 + " Yas3:" + yas3);
    
    }
    
}
