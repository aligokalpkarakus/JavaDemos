public class Main {
    
    public static void skor_hesapla(String isim, int puan){
        System.out.println(isim+ " adlı kullanıcının" + puan +" puanı var");
    }
    
    public static void skor_hesapla(int puan){
        System.out.println("İsimsiz oyuncunun " + puan + " puanı var");
        
    }
    
    public static void skor_hesapla(String isim){
        System.out.println(isim+ " isimli oyuncunun hiç puanı yok");
    }
            
    public static void toplama(String a, String b) {
        System.out.println(a + " " + b);
    }
    
    public static void toplama(int a, int b) {
        System.out.println("Toplam" + (a + b));
    }
    
    public static void toplama(int a, int b, int c){
        System.out.println("Toplam:" + (a + b + c));
    }
    
    public static void main(String[] args) {
        toplama(3, 4, 5);
        toplama(2, 5);
        toplama("gökalp", "karakuş");
        
        skor_hesapla("Gökalp", 100);
        skor_hesapla("Gökalp");
        skor_hesapla(1000000);
        
    }
}
