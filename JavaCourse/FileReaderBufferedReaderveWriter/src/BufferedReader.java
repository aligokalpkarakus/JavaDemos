
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class BufferedReader {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(new java.io.BufferedReader(new FileReader("ogrenci.txt")) )){
            
            /*while(scanner.hasNextLine()){
                System.out.println("Okunan Satir: " + scanner.nextLine());*/
            
            while(scanner.hasNextLine()){
                String ogrenci_bilgisi = scanner.nextLine();
            
                String[] array = ogrenci_bilgisi.split(",");

                if(array[1].equals("Bilgisayar Mühendisliği")){
                    System.out.println("Ogrenci Bilgisi: " + ogrenci_bilgisi);
                
                }

            }
  
        } catch (FileNotFoundException ex) {
            System.out.println("Dosya bulunamadi");
        } catch (IOException ex) {
            System.out.println("Dosya acilirken bir hata olustu");
        }
    }
}
