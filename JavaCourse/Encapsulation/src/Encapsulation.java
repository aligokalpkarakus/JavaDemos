public class Encapsulation {
    public static void main(String[] args) {
        // private public olayı
        
        /*Abone abone = new Abone();
        
        abone.isim = "Gokalp";
        abone.bakiye = 200;
        abone.sehir = "Osmaniye";
        
        abone.dogalGazKullan(200);*/
        
        GelismisAbone abone = new GelismisAbone("Gokalp", 200, "Ankara");
        
        abone.bakiyeOgren();
    }  
}
