
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       
       System.out.println("Çalışanlar Programına Hoşgeldiniz..");
        
       String islemler = "İşelmler..\n"
                + "1. Yazılımcı İşlemleri\n"
                + "2. Yönetici İşemleri\n"
                + "Çıkış için q'ya basınız.";
        
        System.out.println(islemler);
        
        while (true){
            System.out.print("İşlemi seçiniz: ");
            String islem = scanner.nextLine();

            if (islem.equals("q")){
                System.out.println("Programdan Çıkılıyor..");
                break;
            }
            else if (islem.equals("1")){
                Yazilimci yazilimci = new Yazilimci("Gökalp", "Karakuş", 567, "İngilizce");
                String yazilimci_islem = "1. Format\n"
                        + "2. Bilgileri Göster\n"
                        + "Çıkış için q'ya basın.";
                while (true){
                    System.out.print("İşlemi seçiniz: ");
                    String y_islem = scanner.nextLine();
                    if (y_islem.equals("q")){
                        System.out.println("Yazılımcı İşelmlerinden Çıkılıyor..");
                        break;
                    }
                    else if (y_islem.equals("1")){
                        System.out.println("İşletim Sistemi: ");
                        String isletim_sistemi = scanner.nextLine();
                        yazilimci.formatAt(isletim_sistemi);
                    }
                    else if (y_islem.equals("2")){
                        yazilimci.bilgileriGoster();
                    }
                    else{
                        System.out.println("Geçersiz Yazılımcı İşlemi.");
                    }

                }
            }
            
            else if (islem.equals("1")){
                Yonetici yonetici = new Yonetici("Fonye", "Karakuş", 123, 10);

                String yonetici_islem = "Yönetici İşemleri\n"
                        + "1. Zam Yap\n"
                        + "2. Bilgileri Göster\n"
                        + "Çıkış için q'ya basınız.";

                System.out.println(yonetici_islem);

                while (true){
                    System.out.println("İşlem seçiniz: ");
                    String y_islem = scanner.nextLine();

                    if (islem.equals("q")){
                        System.out.println("Programdan Çıkılıyor..");
                        break;
                    }
                    else if (islem.equals("1")){
                        Yazilimci yazilimci = new Yazilimci("Gökalp", "Karakuş", 567, "İngilizce");
                        String yazilimci_islem = "1. Format\n"
                                + "2. Bilgileri Göster\n"
                                + "Çıkış için q'ya basın.";
                        while (true){
                            System.out.print("İşlemi seçiniz: ");
                            String x_islem = scanner.nextLine();
                            if (x_islem.equals("q")){
                                System.out.println("Yönetici İşelmlerinden Çıkılıyor..");
                                break;
                            }
                            else if (x_islem.equals("1")){
                                System.out.println("Ne kadar zam isteniyor: ");
                                int zamMiktari = scanner.nextInt();
                                scanner.nextLine();
                                yonetici.zamYap(zamMiktari);

                            }
                            else if (x_islem.equals("2")){
                                yonetici.bilgileriGoster();
                            }
                            else{
                                System.out.println("Geçersiz Yönetici İşlemi.");
                            }
                        }

                    }
                    else {
                        System.out.println("Geçersiz İşlem.");
                    }
        }
    
    }
}