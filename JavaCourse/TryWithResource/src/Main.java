
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(FileWriter writer = new FileWriter("diller.txt")){
            Scanner scanner = new Scanner(System.in);
            
            String dil;
            
            while(true){
                System.out.println("Bir dil giriniz:");
                dil = scanner.nextLine();
               
                if(dil.equals("-1")){
                    System.out.println("Programdan çıkılıyor..");
                    System.out.println("Dosyayı Kontrol edin....");
                    break;
                }
                
                writer.write(dil + "\n");

            }
                 
                       
        } catch (IOException ex) {
            System.out.println("Dosya Olusturulurken Hata Olustu..");
        }
    }
}
