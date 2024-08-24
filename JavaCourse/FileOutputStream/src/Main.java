
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        
        try {
            //File file = new File("dosya.txt");  alttakiyle aynı işlev
            fos = new FileOutputStream("dosya.txt");
            
            fos.write(65);
            fos.write(74); // bunu buradan silersek not defterinden de silinir. write metodu dosyayı oluşturur ve 0dan yazar
            
           // fos new FileOutputStream("dosya.txt", true); // böyle yaparak açılan dosyada bir şey varsa silinmesi önleniyor ve sona eklenioyr
            
            byte[] array = {101,75,66,68};
            fos.write(array);
            
            String a = "Gökalp Karakuş";
            byte[ ] s_array = a.getBytes();
            fos.write(s_array);
            
        } catch (FileNotFoundException ex) {
            System.out.println("Dosya bulunamadi..");
        } catch (IOException ex) {
            System.out.println("Dosyaya yazilirken bir hata olustu..");
        }
        finally{
            try {
                fos.close();
            } catch (IOException ex) {
                System.out.println("Dosya kapatilirken bir hata olustu..");
            }
        }
    }
}
