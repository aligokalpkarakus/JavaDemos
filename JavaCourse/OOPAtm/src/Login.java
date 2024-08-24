
import java.util.Scanner;

public class Login {
    public boolean login(Hesap hesap){
        
        Scanner scanner = new Scanner(System.in);
        
        String kullaniciAdi;
        String parola;
        
        System.out.print("Kullanıcı Adı: ");
        kullaniciAdi = scanner.nextLine();
        System.out.print("Parola: ");
        parola = scanner.nextLine();
        
        if (hesap.getKullanıcıAdi().equals(kullaniciAdi) && hesap.getParola().equals(parola)){
            return true;
        }
        else {
            return false;
        }
    }
}
