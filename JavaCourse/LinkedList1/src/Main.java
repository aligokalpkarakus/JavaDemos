
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        ArrayList<String> diller = new ArrayList<String>();
        
        diller.add("Java");
        diller.add("Php");
        diller.add("Python");
        diller.add("Kotlin");
        diller.add("C#");
        
        /*for (int i = 0; i < diller.size(); i++) {
            System.out.println(diller.get(i));
        }*/
        
        for (String s : diller) {
            System.out.println(s);
        }
        
        System.out.println("----------------------");
        diller.add(1, "C++");
        for (String s : diller) {
            System.out.println(s);
        }
        // bunu arraylistle yaparken çok fazla işlem yapılıyor
        // bunu arraylistte yapmak performans kaybına yol açılıyor
        // bu gibi durumlar için linkedlist kullanmak daha uygundur
        
        //linked listte ilk referans diğer referansı gösterir diğer referans bir sonrakine bağlıdır iteratif şekilde gider
        //linked list dezavantajlarından biri bir objenin hem kendi değerini hem de başka referansın değerini taşımasıdır. hafızada fazla yer kaplar
        //bellek sıkıntısı olduğu durumda arraylist daha uygundur.
        
    }
}
