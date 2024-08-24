public class Main {
    public static int toplama(int a, int b, int c){
        return (a+b+c);
    }
    
    public static int ikiilecarp(int a){
        return a*2;
    }
    
    public static int ikiiletopla(int a){
        return a + 2;
    }
    
    public static int dortilecarp(int a){
        return a * 4;
    }
    
    public static void main(String[] args) {
        System.out.println("Çıktı değer:" + toplama(1, 2, 3));
        System.out.println("Sonuç: " + dortilecarp(ikiiletopla(ikiilecarp(8))));
    }
}
