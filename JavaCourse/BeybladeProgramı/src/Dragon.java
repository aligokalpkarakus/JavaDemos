public class Dragon extends Beyblade{
    
    private String kutsalCanavar;
    private String gizliYetenek;

    public Dragon(String beybladeKullanici, int donusHizi, int saldiriGucu, String kutsalCanavar, String gizliYetenek) {
        super(beybladeKullanici, donusHizi, saldiriGucu);
        this.kutsalCanavar = kutsalCanavar;
        this.gizliYetenek = gizliYetenek;
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster(); 
        System.out.println("Kutsal Canavar Adi: " + kutsalCanavar);
        System.out.println("Gizli Yetenek: " + gizliYetenek);
    }

    @Override
    public void kutsalCanavarOrtayaCikar() {
        super.kutsalCanavarOrtayaCikar();
        System.out.println(getBeybladeKullanici() + ", " + kutsalCanavar + " 'ı ortaya çıkarıyor...");
        System.out.println(getBeybladeKullanici() + " 'ın Saldirisi: Hayalet Kasirgasi");
    
    }
}
