public class Main {
    public static void main(String[] args) {
        /*
        && and operatörü bütün sonuçlar kendi içinde true ise genel sonuç true
        en az birisi false ise false
        || or operatörü en az birisi true ise genel sonuç true
        ! not operatörü
        */
        System.out.println(3 == 3);
        System.out.println(2 < 3);
        System.out.println(3 == 3 && 2 < 3);
        System.out.println(3 == 3 && 2 > 3);
        System.out.println(! false);
        System.out.println(!(3 < 4));
    }
}
