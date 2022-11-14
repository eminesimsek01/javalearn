package j15_Arrays;

import java.util.Arrays;

public class C04_Arrays {
    public static void main(String[] args) {
        //Array eşitlik kontrolü... equals() -> methodu index ve value kontrolü yapar ve true/false
        //return eder.
        int sayi1[]={39, 3, 72, 63, 84};
        int sayi2[]={84, 72, 63, 3, 39};

        System.out.println("sayı 1 v sayı 2 eşit mi? "+ Arrays.equals(sayi1, sayi2));//false
        Arrays.sort(sayi1);
        Arrays.sort(sayi2);
        System.out.println("sayı 1 ve sayı 2 eşit mi"+ Arrays.equals(sayi1, sayi1));//true

        //Array'i stringe çevirme ....toString(arr);-> verilen arr'i string data type'a çevirir.
        String str=Arrays.toString(sayi1);
        System.out.println(" str ="+ str);//[3, 39, 63, 72, 84]-> ahan da TRICK.
        // arr'in tüm karakterleri String olarak tanımlandı.
        System.out.println("str.substring(6) = " + str.substring(6));

    }
}
