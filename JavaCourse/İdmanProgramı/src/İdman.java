public class İdman {
    private int burpee_sayisi;
    private int pushup_sayisi;
    private int situp_sayisi;
    private int squat_sayisi;

    public İdman(int burpee_sayisi, int pushup_sayisi, int situp_sayisi, int squat_sayisi) {
        this.burpee_sayisi = burpee_sayisi;
        this.pushup_sayisi = pushup_sayisi;
        this.situp_sayisi = situp_sayisi;
        this.squat_sayisi = squat_sayisi;
    }
    
    public void hareketYap(String hareketTuru, int sayi){
        if (hareketTuru.equals("Burpee")){
            burpeeYap(sayi);
        }
        else if (hareketTuru.equals("Pushup")){
            pushupYap(sayi);
        }
        else if (hareketTuru.equals("Situp")){
            situpYap(sayi);
        }
        else if (hareketTuru.equals("Squat")){
            squatYap(sayi);
        }
        else{
            System.out.println("Geçersiz Hareket");
        }
            
        
    }
    public void burpeeYap(int sayi){
        if (burpee_sayisi == 0){
            System.out.println("Yapacak burpee kalmadı..");
        }
        if(burpee_sayisi - sayi < 0){
            System.out.println("Hedeflediğin burpee sayısını geçtin.");
            burpee_sayisi = 0;
            System.out.println("Kalan Burpee: " + burpee_sayisi);
        }
        else{
            burpee_sayisi -= sayi;
            System.out.println("Kalan Burpee: " + burpee_sayisi);
        }
    }
    
    public void pushupYap(int sayi){
        if (pushup_sayisi == 0){
            System.out.println("Yapacak pushup kalmadı..");
        }
        if(pushup_sayisi - sayi < 0){
            System.out.println("Hedeflediğin pushup sayısını geçtin.");
            pushup_sayisi = 0;
            System.out.println("Kalan Pushup: " + pushup_sayisi);
        }
        else{
            pushup_sayisi -= sayi;
            System.out.println("Kalan Pushup: " + pushup_sayisi);
        }
    }
    
    public void situpYap(int sayi){
        if (situp_sayisi == 0){
            System.out.println("Yapacak situp kalmadı..");
        }
        if(situp_sayisi - sayi < 0){
            System.out.println("Hedeflediğin situp sayısını geçtin.");
            situp_sayisi = 0;
            System.out.println("Kalan Situp: " + situp_sayisi);
        }
        else{
            situp_sayisi -= sayi;
            System.out.println("Kalan Situp: " + situp_sayisi);
        }
    }
    
    public void squatYap(int sayi){
        if (squat_sayisi == 0){
            System.out.println("Yapacak squat kalmadı..");
        }
        if(squat_sayisi - sayi < 0){
            System.out.println("Hedeflediğin squat sayısını geçtin.");
            squat_sayisi = 0;
            System.out.println("Kalan Squat: " + squat_sayisi);
        }
        else{
            squat_sayisi -= sayi;
            System.out.println("Kalan Squat: " + squat_sayisi);
        }
    }
    
    public boolean idmanBittiMi(){
        return(burpee_sayisi == 0) && (pushup_sayisi == 0) && (situp_sayisi == 0) && (squat_sayisi == 0);
    }
    
}
