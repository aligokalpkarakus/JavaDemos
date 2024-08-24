public class GelismisAbone {
    
    private String isim;
    private int bakiye = 120;
    private String sehir;

    public GelismisAbone(String isim, int bakiye, String sehir) {
        this.isim = isim;
        this.sehir = sehir;
        
        if(bakiye >= 0 && bakiye <= 120){
            this.bakiye = bakiye;
        }
    }
    
    public void dogalGazKullan(int miktar){
        if(this.bakiye - miktar < 0){
            System.out.println("Yeterli Bakiye Yok");
        }
        else{
            this.bakiye -= miktar;
            
            if(this.bakiye <= 0){
                System.out.println("Bakiyeniz bitmistir. Lutfen en yakin abone merkezine giederek kredi yukleyiniz."
                + " Kredi limiti: 120 TL");
            }
            else{
                System.out.println("Yeni bakiye:" + bakiye);
            }
        }
    }
    
    public void bakiyeOgren(){
        System.out.println("Bakiye = " + bakiye);
    }

}
