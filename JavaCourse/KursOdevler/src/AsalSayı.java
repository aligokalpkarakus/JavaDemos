public class AsalSayı {
    
    public static boolean asal_sayi(int sayi){
        for (int i = 2; i < sayi; i++){
            if (sayi % i == 0){
                return false;
            }
        }
        return true;
        
    }
    
    public static void main(String[] args) {
        for (int i = 2; i < 1000; i++){
            if (asal_sayi(i)){
                System.out.println(i);
            }
        }
    }
}
