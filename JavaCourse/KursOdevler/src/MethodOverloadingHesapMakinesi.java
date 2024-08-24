
import java.util.Scanner;

public class MethodOverloadingHesapMakinesi {
    
    public static int cikarma(int a, int b){
        return a - b;
    }
    
    public static double bolme(int a, int b){
        return (double)a / b;
    }
    
    public static int toplama(int a, int b){
        return a + b;
    }
    
    public static int toplama(int a, int b, int c){
        return a + b + c;
    }
    
    public static int carpma(int a, int b){
        return a * b;
    }
    
    public static int carpma(int a, int b, int c){
        return a * b * c;
    }
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        String islemler = "1. Toplama İşlemi\n"
                + "2. Çıkarma İşlemi\n"
                + "3. Çarpma İşlemi\n"
                + "4. Bölme İşlemi\n"
                + "Çıkış için q'ya basınız.";
        
        System.out.println("***************");
        System.out.println(islemler);
        System.out.println("***************");
        
        while (true) {
            System.out.print("İşlemi seçiniz: ");
            String islem = scanner.nextLine();
            
            if (islem.equals("q")){
                System.out.println("Hesap Makinesi Sonlandırılıyor...");
                break;
            }
            else if (islem.equals("1")){
                System.out.println("Toplama işlemi seçildi. Kaç değer girilecek? :");
                
                int kacsayi = scanner.nextInt();
                
                if (kacsayi == 2){
                    System.out.print("a: ");
                    int a = scanner.nextInt();
                    
                    System.out.print("b: ");
                    int b = scanner.nextInt();
                    
                    scanner.nextLine();
                    
                    System.out.println("Girilen sayıların toplamı: " + toplama(a, b));
                    
                }
                else if (kacsayi == 3){
                    System.out.print("a: ");
                    int a = scanner.nextInt();
                    
                    System.out.print("b: ");
                    int b = scanner.nextInt();
                    
                    System.out.print("c: ");
                    int c = scanner.nextInt();
                    
                    scanner.nextLine();
                    
                    System.out.println("Girilen sayıların toplamı: " + toplama(a, b, c));
                    
                }
                else {
                    System.out.println("Bunun için uygun metod bulunmuyor.");
                }
           
            }
            else if (islem.equals("2")){
                System.out.print("a: ");
                int a = scanner.nextInt();
                    
                System.out.print("b: ");
                int b = scanner.nextInt();

                scanner.nextLine();

                System.out.println("Girilen sayıların farkı: " + cikarma(a, b));
                
            }
            else if (islem.equals("3")){
                System.out.println("Çarpma işlemi seçildi. Kaç değer girilecek? :");
                
                int kacsayi = scanner.nextInt();
                
                if (kacsayi == 2){
                    System.out.print("a: ");
                    int a = scanner.nextInt();
                    
                    System.out.print("b: ");
                    int b = scanner.nextInt();
                    
                    scanner.nextLine();
                    
                    System.out.println("Girilen sayıların çarpımı: " + carpma(a, b));
                    
                }
                else if (kacsayi == 3){
                    System.out.print("a: ");
                    int a = scanner.nextInt();
                    
                    System.out.print("b: ");
                    int b = scanner.nextInt();
                    
                    System.out.print("c: ");
                    int c = scanner.nextInt();
                    
                    scanner.nextLine();
                    
                    System.out.println("Girilen sayıların çarpımı: " + carpma(a, b, c));
                    
                }
                else {
                    System.out.println("Bunun için uygun metod bulunmuyor.");
                }

            }
            else if (islem.equals("4")){
                System.out.print("a: ");
                int a = scanner.nextInt();

                System.out.print("b: ");
                int b = scanner.nextInt();

                scanner.nextLine();

                System.out.println("Girilen sayıların çarpımı: " + bolme(a, b));
                
            }
            else {
                System.out.println("Geçersiz İşlem..");
            }
        }
    }
}
