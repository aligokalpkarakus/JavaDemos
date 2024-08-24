
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    
    public static void islemleriBastir(){
        
        System.out.println("0 - Islemleri Goruntule");
        System.out.println("1 - Bir Sonraki Sehre Git");
        System.out.println("2 - Bir Onceki Sehre Git");
        System.out.println("3 - Uygulamadan Cik");
        
    }
    
    public static void sehirleriTurla(LinkedList<String> sehirler){
        
        ListIterator<String> iterator = sehirler.listIterator();
        
        int islem;
        
        islemleriBastir();
        
        Scanner scanner = new Scanner(System.in);
        
        if(!iterator.hasNext()){
            System.out.println("Herhangi Bir Sehir Bulunmuyor...");
        }
        
        boolean cikis = false;
        
        boolean ileri = true;
        
        while(!cikis){
            System.out.print("Bir Islem Seciniz: ");
            islem = scanner.nextInt();
            
            switch (islem) {
                case 0:
                    islemleriBastir();
                    break;
                    
                case 1:
                    if(!ileri){
                        if(iterator.hasNext()){
                            iterator.next();
                        }
                        ileri = true;
                    }
                    if(iterator.hasNext()){
                        System.out.println("Sehre Gidiliyor: " + iterator.next());
                    }
                    else{
                        ileri = true;
                        System.out.println("Gidilecek Sehir Kalmadi..");
                    }
                    break;
                    
                case 2:
                    if(ileri){
                        if(iterator.hasPrevious()){
                            iterator.previous();
                        }
                    }
                    if(iterator.hasPrevious()){
                        System.out.println("Sehre Gidiliyor: " + iterator.previous());
                    }
                    else{
                        System.out.println("Sehir Turu Basladi...");
                    }
                    break;
                    
                case 3:
                    cikis = true;
                    System.out.println("Uygulamadan Cikiliyor..");
                    break;  
            }   
        }
    }
    
    public static void main(String[] args) {
        
        LinkedList<String> sehirler = new LinkedList<String>();
        
        sehirler.add("Ankara");
        sehirler.add("Eskisehir");
        sehirler.add("Afyon");
        
        sehirleriTurla(sehirler);
        
    }
}
