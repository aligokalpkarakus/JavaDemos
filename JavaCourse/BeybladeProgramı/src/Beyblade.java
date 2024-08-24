public class Beyblade {
    private String beybladeKullanici;
    private int donusHizi;
    private int saldiriGucu;

    public Beyblade(String beybladeKullanici, int donusHizi, int saldiriGucu) {
        this.beybladeKullanici = beybladeKullanici;
        this.donusHizi = donusHizi;
        this.saldiriGucu = saldiriGucu;
    }

    /**
     * @return the beybladeKullanici
     */
    public String getBeybladeKullanici() {
        return beybladeKullanici;
    }

    /**
     * @param beybladeKullanici the beybladeKullanici to set
     */
    public void setBeybladeKullanici(String beybladeKullanici) {
        this.beybladeKullanici = beybladeKullanici;
    }

    /**
     * @return the donusHizi
     */
    public int getDonusHizi() {
        return donusHizi;
    }

    /**
     * @param donusHizi the donusHizi to set
     */
    public void setDonusHizi(int donusHizi) {
        this.donusHizi = donusHizi;
    }

    /**
     * @return the saldiriGucu
     */
    public int getSaldiriGucu() {
        return saldiriGucu;
    }

    /**
     * @param saldiriGucu the saldiriGucu to set
     */
    public void setSaldiriGucu(int saldiriGucu) {
        this.saldiriGucu = saldiriGucu;
    }
    
    public void saldir(){
        System.out.println(beybladeKullanici + " " + saldiriGucu + " ve " + donusHizi + " ile saldiriyor...");

    }
    
    public void kutsalCanavarOrtayaCikar(){
    System.out.println("Bu beyblade'in kutsal canavarı bulunmuyor...");
    }
    
    public void bilgileriGoster(){
        System.out.println("Beyblade kullanicisi: " + beybladeKullanici);
        System.out.println("Saldiri gucu: " + saldiriGucu);
        System.out.println("Donus hizi: " + donusHizi);
    }
    
    
    
}
