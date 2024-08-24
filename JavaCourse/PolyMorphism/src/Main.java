class Hayvan {
    private String isim;

    public Hayvan(String isim) {
        this.isim = isim;
    }

    /**
     * @return the isim
     */
    public String getIsim() {
        return isim;
    }

    /**
     * @param isim the isim to set
     */
    public void setIsim(String isim) {
        this.isim = isim;
    }
    
    public String konus(){
        return "Hayvan konusuyor..";
    }

}

class Kedi extends Hayvan{

    public Kedi(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim() + " miyavliyor...";
    }
    
}

class Kopek extends Hayvan{

    public Kopek(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim() + " havliyor..";
    
    }
}

class At extends Hayvan{

    public At(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim() + " kisniyor..";
    }
    
}


public class Main {
    
    public static void konustur(Hayvan hayvan){
        System.out.println(hayvan.konus());
    }
    
    public static void main(String[] args) {
        /*
        Çok biçimlilik demektir
        Bir nesnenin birden farklı nesne gibi davranması demektir
        */
        
        Hayvan hayvan = new Kedi("Tekir");
        System.out.println(hayvan.konus());
        
        
        
        /*
        bir tane ana class olacak, geri kalanlar alt sınıf olacak
        hayvan referansı kedi referansı gibi davrandı
        */

        Hayvan hayvan1 = new Kopek("Karabas");
        System.out.println(hayvan1.konus());
        
        // nesne köpek referansı gibi davrandı
        
        Hayvan hayvan2 = new At("Sahbatur");
        System.out.println(hayvan2.konus());
        
        // konustur metodu ile 
        
        konustur(new Kedi("Batman"));
        konustur(new Kopek("Boncuk"));
        konustur(new At("Deccal"));
    }
}
