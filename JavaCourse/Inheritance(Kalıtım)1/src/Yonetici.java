public class Yonetici extends Calisan {  // subclass
    // extend ile çalışan classının bütün özelliklerini ve metodlarını miras almak istiyor
   
    private int sorumluKisi; //ekstra özellik
    
    
    
    public Yonetici(String isim, int maas, String departman, int sorumluKisi){
       /*
       this.isim = isim;
       this.maas = maas;
       this.departman = departman;
       */
       
       super(isim, maas, departman); // miras aldığım constructorları kullanmak istiyrorum
     
       this.sorumluKisi = sorumluKisi;
   } 
    
    public void zamYap(int zamMiktari){
        System.out.println("Çalışanlara " + zamMiktari + " TL zam yapıldı.");
    }
    
    public void bilgileriGoster(){
       /* System.out.println("İsim: " + getIsim());
        System.out.println("Maas: " + getMaas());
        System.out.println("Departman: " + getDepartman());
       */
        
       super.bilgileriGoster();
       
       System.out.println("Sorumlu Kişi Sayısı: " + this.sorumluKisi);
    }
}
