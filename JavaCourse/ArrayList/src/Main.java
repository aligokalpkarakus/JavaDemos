
import java.util.ArrayList;

public class Main {
    
    public static void yazdir(ArrayList<String> a){
        for (int i = 0; i < a.size(); i++) {
            System.out.println("Elenent " + (i+1) + ": " + a.get(i));
        }
    }
    
    
    public static void main(String[] args) {
        
        ArrayList<String> arraylist = new ArrayList<String>();
        
        arraylist.add("Metallica");
        arraylist.add("Guns'n Roses");
        arraylist.add("Black Sabbath");
        arraylist.add("Iron Maiden");
        
        System.out.println(arraylist.get(0));
        System.out.println(arraylist.get(1));
        System.out.println(arraylist.get(2));
        System.out.println(arraylist.get(3));
        //System.out.println(arraylist.get(5)); hata verir 
        
        System.out.println(arraylist.size()); // uzunluğunu verir
        
        for(int i = 0; i < arraylist.size(); i++){
            System.out.println(arraylist.get(i));
        }
        
        //arraylist.remove("Metallica"); // metallicayı siler
        //arraylist.remove(1); // 1. indexteki gider gunsandroses gider
        
        System.out.println(arraylist.indexOf("Metallica")); // metalicanın indexini döndürür
        // birden fazla metallica olsaydı ilk gördüğü metallicanın indexini dönderir
        
        arraylist.add("Metallica");
        System.out.println(arraylist.lastIndexOf("Metallica"));// sondan başlayarak metallicayı aradı ve buldu
        
        System.out.println(arraylist.lastIndexOf("Dream Theater"));//aratılan değer listede yoksa -1 döner
        
        arraylist.set(4, "Megadeth"); // index verilecek ve yerine geçecek olan değer girilecek
        //Metalica yerine megadeth yazıldı
        
        for(int i = 0; i < arraylist.size(); i++){
            System.out.println(arraylist.get(i));
        }
        
        yazdir(arraylist);
        
    }
}
