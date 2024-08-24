public class PcMuhendisi implements IMuhendis{

    private boolean askerlik;
    private boolean adliSicil;

    public PcMuhendisi(boolean askerlik, boolean adliSicil) {
        this.askerlik = askerlik;
        this.adliSicil = adliSicil;
    }
    
    
    
    @Override
    public void askerlikDurumuSorgula() {
        if(askerlik){
            System.out.println("Askerligimi Yaptim.");
        }
        else{
            System.out.println("Askerligimi Henuz Yapmadim.");
        }
    }

    @Override
    public String mezuniyetOrtalamasi(double derece) {
        return "Ortalamam: " + derece;
    }

    @Override
    public void adliSicilSorgula() {
        if(adliSicil){
            System.out.println("Adli Sicil Kaydim Bulunuyor.");
        }
        else{
            System.out.println("Herhangi bir adli sicil kaydım bulunmuyor.");
        }
    }

    @Override
    public void isTecrubesi(String[] array) {
        System.out.println("Bilgisayar Muhendisi olarak su sirketlerde calistim: ");
        
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    
}
