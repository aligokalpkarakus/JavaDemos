
import java.util.Scanner;

public class Main {
    
    public static void arrayiBastir(int [] array){
        for(int i = 0; i < array.length ; i++){
            System.out.println("Element " + (i+1) + ":" + array[i]);
        }
    }
    
    public static double ortalamaBul(int[] array){
        int toplam = 0;
        
        for(int i = 0; i < array.length ; i++){
            toplam += array[i];
                     
        }
        return ((double)toplam / array.length);
        
    }
    
    
    public static void main(String[] args) {
        
        /*
        int[] a;
        double[] b;
        
        int[] c = new int[10]; //bellekte 10 yer açılıyor
        c[5] = 32; // 5. indexe 32 değerini eklemek
        c[9] = 50; // 9. indexe 50 değerini eklemek
        
        int[] d = {30,40,50,60,70};
        
        System.out.println(d[0]);
        System.out.println(d[2]);
        //System.out.println(d[6]); // hata verir çünkü 6. index yok
        */
        
        Scanner scanner = new Scanner(System.in);
        /*
        //liste oluşturma ve yazdırma 
        int[] a = new int[5];
        /*
        for(int i = 0; i < 5; i++){
            a[i] = i * 4 + 2;
        }
        */
        /*
        int[] a = new int[5];
        for(int i = 0; i < 5; i++){ // kullanıcıdan almalı
            a[i] = scanner.nextInt();
        }
        

        for(int i = 0; i < 5; i++){
            System.out.println(a[i]);
        }
        */
        
        int[] b = {10,20,30,40,50};
        //System.out.println("Arrayimizin Uzunlugu: " + b.length);
        
        arrayiBastir(b);
        
        System.out.println("Ortalama: " + ortalamaBul(b));
        
    }
}
