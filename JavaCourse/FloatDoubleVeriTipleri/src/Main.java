public class Main {
    public static void main(String[] args) {
//        Double : 64 bit - 8 byte
//        Float : 32 bit - 4 byte
//        Otomatik dönüştürme : int --> float --> double
        
        double a = 5.25;
        double b = 4.0;
        double c = 4d;
        double d = 4.23d;
        
        float x = (float)5.0;
        float y = 5f;
        float z = 5.2f;
        
        int k = 22 / 7;
        float l = 22f / 7f;
        double m = 22d / 7d;
        
        System.out.println("k:" + k);
        System.out.println("l:" + l);
        System.out.println("m:" + m);
    
    }
    
}
