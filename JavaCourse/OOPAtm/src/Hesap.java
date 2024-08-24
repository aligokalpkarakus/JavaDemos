public class Hesap {
    private String kullanıcıAdi;
    private String parola;
    private double bakiye;

    public Hesap(String kullanıcıAdi, String parola, double bakiye) {
        this.kullanıcıAdi = kullanıcıAdi;
        this.parola = parola;
        this.bakiye = bakiye;
    }

    public String getKullanıcıAdi() {
        return kullanıcıAdi;
    }

    public void setKullanıcıAdi(String kullanıcıAdi) {
        this.kullanıcıAdi = kullanıcıAdi;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public double getBakiye() {
        return bakiye;
    }

    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }
    
    public void paraYatir(int tutar){
        bakiye += tutar;
        System.out.println("Yeni Bakiye: " + bakiye);
        
    }
    
    public void paraCek(int tutar){
        if (bakiye - tutar < 0){
            System.out.println("Yeterli Bakiye Yok..");
        }
        else {
            bakiye -= tutar;
            System.out.println("Yeni Bakiye: " + bakiye);
        }
        
    }
}
