public class Main {
    public static void main(String[] args) {
        
        String a = "Mustafa";
        
        String b = new String("Mustafa");
        
        System.out.println(b);
        
        System.out.println("Harf Sayisi: " + b.length());
        
        System.out.println("0. index: " + b.charAt(0));
        System.out.println("2. index: " + b.charAt(2));
        System.out.println("Son eleman: " + b.charAt(b.length() - 1));

        for(int i = 0; i < b.length(); i++){
            System.out.println(b.charAt(i));
        }
        
        System.out.println(b.startsWith("Mu"));
        System.out.println(b.startsWith("as"));
        System.out.println(b.endsWith("fa"));
        System.out.println(b.endsWith("me"));
        
        System.out.println(b.indexOf('a')); // ilk gördüğü ilk a'nın indexi
        System.out.println(b.indexOf("b")); // bulamazsa -1 döner
        
        System.out.println(b.lastIndexOf("a"));//aramaya sondan başlar
        
        System.out.println(b.toLowerCase());//bütün karakterleri küçültür
        System.out.println(b.toUpperCase());//bütün karakterleri büyütür
        
        String c = "1923";
        int d = Integer.parseInt(c);//Integer.parseInt Stringi integera çevirir
        System.out.println(d);
        System.out.println(d - 42);
        
        int e = 1923;
        String f = String.valueOf(e);//integeri stringe çevirdik
        System.out.println(f);
        
        
        //Atamalar arasındaki farklar:
        String g = "Mustafa";
        String g2 = "Mustafa";
        
        if(g == g2){
            System.out.println("Esitler");// iki obje de aynı yerde olduğu için doğru
        }
        
        String g3 = new String("Mustafa");
        String g4 = new String("Mustafa");
        
        // bellekte farklı yerdeler o yüzden eşit olamazlar
        
        if(g3 == g4){
            System.out.println("Esitler");
        }
        else{
            System.out.println("esit degiller");
        }
        
        if(g3.equals(g4)){ // dogru kontrol budur .equals
            System.out.println("esitler");
        }   
    }
}
