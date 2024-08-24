public class Hayvan {
    
    private String isim;
    private int kilo;
    private int boy;
    private int bacakSayisi;
    
    public Hayvan(String isim, int kilo, int boy, int bacakSayisi){
        this.isim = isim;
        this.kilo = kilo;
        this.boy = boy;
        this.bacakSayisi = bacakSayisi;
    }
    
    public void yemekYe(){
        System.out.println("Hayvan şu anda yemek yiyor...");
    }
    
    public void hareketeGec(int hiz){
        System.out.println("Hayvan " + hiz + " ile hareket ediyor.");
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

    /**
     * @return the kilo
     */
    public int getKilo() {
        return kilo;
    }

    /**
     * @param kilo the kilo to set
     */
    public void setKilo(int kilo) {
        this.kilo = kilo;
    }

    /**
     * @return the boy
     */
    public int getBoy() {
        return boy;
    }

    /**
     * @param boy the boy to set
     */
    public void setBoy(int boy) {
        this.boy = boy;
    }

    /**
     * @return the bacakSayisi
     */
    public int getBacakSayisi() {
        return bacakSayisi;
    }

    /**
     * @param bacakSayisi the bacakSayisi to set
     */
    public void setBacakSayisi(int bacakSayisi) {
        this.bacakSayisi = bacakSayisi;
    }
    
    
}
