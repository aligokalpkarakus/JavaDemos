
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // Polymorphism kullanarak Beyblade programı
        
        System.out.println("Beyblade Programina Hosgeldiniz...");
        System.out.println("Cikis icin q'ya basiniz...");
        
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            System.out.println("Beyblade seciniz: ");
            String islem = scanner.nextLine();
            
            if(islem.equals("q")){
                System.out.println("Programdan cikiliyor...");
                break;
            }
            else{
                BeybladeFabrikasi fabrika = new BeybladeFabrikasi();
                Beyblade beyblade = fabrika.beybladeUret(islem);
                
                if(beyblade == null){
                    System.out.println("Lutfen gecerli bir beyblade ismi giriniz...");
                }
                else{
                    beyblade.bilgileriGoster();
                    beyblade.saldir();
                    beyblade.kutsalCanavarOrtayaCikar();
                            
                }
  
            }
   
        }
   
    }
}
