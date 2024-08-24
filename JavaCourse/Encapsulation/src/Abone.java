public class Abone {
    
    public String isim;
    public int bakiye;
    public String sehir;
    
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
