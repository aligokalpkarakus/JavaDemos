public class Drayga extends Beyblade{
    
    private String kutsalCanavar;

    public Drayga(String beybladeKullanici, int donusHizi, int saldiriGucu, String kutsalCanavar) {
        super(beybladeKullanici, donusHizi, saldiriGucu);
        this.kutsalCanavar = kutsalCanavar;
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Kutsal Canavar Adi: " + kutsalCanavar);
    }

    @Override
    public void kutsalCanavarOrtayaCikar() {
        super.kutsalCanavarOrtayaCikar();
        System.out.println(getBeybladeKullanici() + ", " + kutsalCanavar + " 'ı ortaya çıkarıyor...");
        System.out.println(getBeybladeKullanici() + " 'ın Saldirisi: Kaplan Pencesi");
    }
    
    
    
    
    
    
    
    
}
