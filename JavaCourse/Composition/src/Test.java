public class Test {
    public static void main(String[] args) {
        Resolution resolution = new Resolution(1920, 1080);
        Monitor monitor = new Monitor("VS197DE", "ASUS", "18.5", resolution);
        Kasa kasa = new Kasa("Shadow Blade", "Shadow", "Temperli Cam");
        Anakart anakart = new Anakart("B250-PRO", "ASUS", 10, "Windows 10");
        Bilgisayar pc = new Bilgisayar(monitor, anakart, kasa);
        
        pc.getKasa().bilgisiyariAc();
        pc.getMonitor().monitoruKapa();
        pc.getAnakart().isletimSistemiYukle("Ubuntu 16.04");
    }
}
