public class Main {
    public static void main(String[] args) {
        /*
        + toplama
        - çıkarma 
        / bölme
        * çarpma
        % kalan
        */
        System.out.println(3 + 4.2);
        System.out.println(3 - 5);
        System.out.println(10 / 4);
        System.out.println(10 / 4.0);
        System.out.println(10d / 4);
        System.out.println(3 * 4);
        System.out.println(10 % 4);
        
        int a = 4; 
        
        a = a + 2;
//          ya da a += 2
        System.out.println(a);
        
        int b = 6;
        
        b = b * 3;
//        ya da b *= 3
        System.out.println(b);
        
        int c = 7;
        
        c++;
//        1 arttırır. c-- hali 1 azaltır
        System.out.println(c);
        
        int d = 7;
        System.out.println(d++);
        System.out.println(++d);
        
        
    }   
}
