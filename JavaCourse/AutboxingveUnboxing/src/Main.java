
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        /*
        Wrapper class
        ilkel veri tipleri
        boolean ---> Boolean
        char ---> Character
        byte ---> Byte
        short ---> Short
        int ---> Integer
        long ---> Long
        float ---> Float
        double ---> Double
        
        */
        
        ArrayList<String> arraylist = new ArrayList<String>();
        
        /*
        ArrayList<int> arraylis2 = new ArrayList<int>();
        ArrayList<double> arraylis2 = new ArrayList<double>();
        ilkel tiplerle arraylist oluşturulamıyor, referans kullanılmalı
        */ 
        
        Integer a = 5; 
        ArrayList<Integer> arraylist2 = new ArrayList<Integer>();
        /*
        for (int i = 0; i < 10; i++) {
            arraylist2.add(Integer.valueOf(i*4));// ilkel bir veri tipi olan int'i kutuya alarak wraper classla autoboxing yapıyoruz 
            
        }
        
        for (int i = 0; i < arraylist2.size(); i++) {
            System.out.println(arraylist2.get(i).intValue());//unboxing ile ilkel veri tipine dönüştürdük
        }
        */
        
        //java bize uyarı vererek autoboxing ve unboxingi kendin yapmana gerek yok diyor kendisi otomatik yapıyot zaten
        //aslında şöyle yap diyor üstteki iki for döngüsünü:
        for (int i = 0; i < 10; i++) {
            arraylist2.add(i*4);// autoboxingi kendiis yapıyor zaten
            
        }
        
        for (int i = 0; i < arraylist2.size(); i++) {
            System.out.println(arraylist2.get(i));//unboxingi kendisi yapıyor zzaten
        }
        
    }
}
