
import java.util.Scanner;

public class Test {
    
    private static Sarkicilar sarkicilar = new Sarkicilar();
    private static Scanner scanner = new Scanner(System.in);
    
    public static void islemleriBastir(){
        
        System.out.println("\t 0-Islemleri Goruntule");
        System.out.println("\t 1-Sarkicilari Goruntule");
        System.out.println("\t 2-Sarkici Ekle");
        System.out.println("\t 3-Sarkici Guncelle");
        System.out.println("\t 4-Sarkici Sil");
        System.out.println("\t 5-Sarkici Ara");
        System.out.println("\t 6-Uygulamadan Cik");

    }
    
    public static void sarkiciGoruntule(){
        
        sarkicilar.sarkicilariBastir();
        
    }
    
    public static void sarkiciEkle(){
        
        System.out.print("Eklemek istediginiz sarkicinin ismi: ");
        String isim = scanner.nextLine();
        sarkicilar.sarkiciEkle(isim);
        
    }
    
    public static void sarkiciGuncelle(){
        
        System.out.print("Guncellemek istediginiz pozisyon: ");
        int pozisyon = scanner.nextInt();
        scanner.nextLine();
        String yeniIsim = scanner.nextLine();
        sarkicilar.sarkiciGuncelle(yeniIsim, pozisyon-1);

    }
    
    public static void sil(){
        
        System.out.print("Silmek istediginiz pozisyon: ");
        int pozisyon = scanner.nextInt();
        sarkicilar.sarkiciSil(pozisyon - 1);

    }
    
    public static void ara(){
        
        System.out.print("Aramak istediginiz sarkici: ");
        String isim = scanner.nextLine();
        sarkicilar.sarkiciAra(isim);
        
    }
    
    public static void main(String[] args) {
        
        System.out.println("\t Sarkici Uygulamasina Hosgeldiniz...");
        
        islemleriBastir();
        
        boolean cikis = false;
        
        int islem;
        
        while (!cikis){
            
            System.out.print("Bir islem seciniz: ");
            islem = scanner.nextInt();
            scanner.nextLine();
            
            switch (islem) {
                case 0:
                   islemleriBastir();
                    break;
                case 1:
                    sarkiciGoruntule();
                    break;
                case 2:
                    sarkiciEkle();
                    break;
                case 3:
                    sarkiciGuncelle();
                    break;
                case 4:
                    sil();
                    break;
                case 5:
                    ara();
                    break;
                case 6:
                    cikis = true;
                    System.out.println("Uygulamadan cikiliyor..");
                    break;
            }
            
            
        }
        
        
        
    }
}
