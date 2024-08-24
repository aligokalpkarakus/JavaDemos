
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    
    public static void listeyiBastir(LinkedList<String> gidilecekYerler){
        /*
        for (String s : gidilecekYerler) {
            System.out.println(s);
        }
        */
        
        ListIterator<String> iterator = gidilecekYerler.listIterator();
        
        // her next de objeden objeye geçeriz
        
        while(iterator.hasNext()){ // obje varsa devam
            System.out.println(iterator.next()); // bir sonraki objeye geçer ve yazdırır
        }
        
    }
    
    public static void siraliEkle(LinkedList<String> gidilecekYerler, String yeni){
        ListIterator<String> iterator = gidilecekYerler.listIterator();
        
        while(iterator.hasNext()){
            
            int karsilastir = iterator.next().compareTo(yeni);//bulunulan objeyle yeni obje karışlaştırılıyor yeni daha küçükse 0dan büyük küçükse -1 eşitse 0 döndürür
            
            if(karsilastir == 0){
                // iki değer eşit
                System.out.println("Listenizde bu eleman zaten var...");
                return; // metodu sonlandırmak için kullandık
            }
            else if(karsilastir < 0){
                // yeni değer iterator.nextten daha büyük
                
            }
            else if(karsilastir > 0){
                iterator.previous();
                iterator.add(yeni);
                return;
            }
        }
        iterator.add(yeni);
    }
    
    
    
    
    
    public static void main(String[] args) {
        
        LinkedList<String> gidilecekYerler = new LinkedList<String>();
        /*
        gidilecekYerler.add("Postane");
        gidilecekYerler.add("Market");
        gidilecekYerler.add("Okul");
        gidilecekYerler.add("Kutuphane");
        gidilecekYerler.add("Spor Salonu");
        gidilecekYerler.add("Ev");
        
        listeyiBastir(gidilecekYerler);
        
        System.out.println("------------------------------------");
        gidilecekYerler.add(4, "Alisveris Merkezi");
        
        listeyiBastir(gidilecekYerler);
        
        System.out.println("****************");
        gidilecekYerler.remove(3);
        listeyiBastir(gidilecekYerler);
        */
        
        siraliEkle(gidilecekYerler, "Postane");
        siraliEkle(gidilecekYerler, "Market");
        siraliEkle(gidilecekYerler, "Ev");
        
        listeyiBastir(gidilecekYerler);
        
        /*
        Ev
        Market
        Postane
        şeklinde küçükten büyüğe bastırıyor
        */
        
    }
}
