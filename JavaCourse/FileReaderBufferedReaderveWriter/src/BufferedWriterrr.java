
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BufferedWriterrr {
    public static void main(String[] args) {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("ogrenciler.txt", true))){
            
            writer.write("Ali Ozan, İnşaat Mühendisliği\n");
            
            
            
            
        } catch (IOException ex) {
            Logger.getLogger(BufferedWriterrr.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
