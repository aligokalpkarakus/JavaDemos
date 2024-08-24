
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FileWriter writer = null;
        
        try {
            //writer = new FileWriter("dosya.txt");
            
            //writer.write("Gökalpppp\n");
            //writer.write("Aliiii\n");
            
            writer = new FileWriter("dosya.txt", true); // true şeklinde açılınca direkt dosyanın sonuna yazıyor \n'e gerek kalmıyor
            
            writer.write("fonyeeeee");
            
            
            
        } catch (IOException ex) {
            System.out.println("Dosya acilirken IOException oluştu..");
        }
        finally{
            if(writer != null){
                try {
                    writer.close();
                } catch (IOException ex) {
                    System.out.println("Dosya kapatılırken hata oluştu");
                }
            }
        }
        
        
        
        
        
        
    }
}
