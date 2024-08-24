public class Main {
    public static void main(String[] args) {
        
        //IMuhendis muhendis1 = new IMuhendis(); interfaceden obje oluşamaz
        IMuhendis muhendisi2 = new PcMuhendisi(false,false); // bu olabiliyor
        PcMuhendisi muhendisi1 = new PcMuhendisi(false,false);
        
        muhendisi1.askerlikDurumuSorgula();
        muhendisi1.adliSicilSorgula();
        System.out.println(muhendisi1.mezuniyetOrtalamasi(3.07));
        String[] tecrube = {"Vestel", "Havelsan", "Turksat"};
        muhendisi1.isTecrubesi(tecrube);
        
        MakineMuhendisi muhendisi3 = new MakineMuhendisi(true, false);
        IMuhendis muhendisi4 = new MakineMuhendisi(true, false); // bu olamıyor
        String[] tecrube1 = {};
        String[] referans = {"Ali Karakus", "Gokalp Karakus"};
        muhendisi3.askerlikDurumuSorgula();
        muhendisi3.adliSicilSorgula();
        System.out.println(muhendisi3.mezuniyetOrtalamasi(2.31));
        muhendisi3.referansGetir(referans);
        /*
        IMuhendis muhendisi4 = new MakineMuhendisi(true, false); // bu olamıyor
        String[] referans1 = {};
        muhendisi4.referansGetir(referans1); // hata veriyor çünkü referans methodu interfacede değil de makine muh classının kendisinde bulunuyor
        */
        
        muhendisi3.calis();
        
    }
}
