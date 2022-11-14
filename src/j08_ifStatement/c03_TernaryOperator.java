package j08_ifStatement;

import java.util.Scanner;

public class c03_TernaryOperator {
    public static void main(String[] args) {
        /* Ternary ile yapilan tum islemler if-else blok ile de yapilabilir
         ternary tercih edilmesi yapinin basit okunabilir ve anlasilabilir olmasi içindir -> clean code
         Ternary icerisinde kompleks kodlar yerine dogrudan sonuç üreten veya sonucu veren
         daha basic code'lar bulunur.
         */
         // TASK01 -> girilen bir tamsayının tek-çift olmasını kontrol eden code create ediniz.

        //if-else method ile çözümü
        //Scanner scan=new Scanner(System.in);
        //System.out.println("Bir sayı giriniz. Tek mi çift mi kontrol edelim? ");
        //int number=scan.nextInt();
        //if (number%2==0){
        //    System.out.println("tek");
        //}else System.out.println("çift");

        System.out.println(" ***** Ternary *****");

        // System.out.println("Bir sayı giriniz. Tek mi çift mi kontrol edelim? ");
        // String sonuc=(number % 2 == 0 ? "sayı çift" : "sayı tek");
        //System.out.println("sonuc "+sonuc);
        //System.out.println(number%2==0?"agam sayı çift" : "agam sayı tek");
        /*
        ahan da TRICK-> ternary operator işlem sonucunda true veya false'a göre bir çıktı verir.
        eğer bu çıktı type'a göre bir variable atanmazsa sout ile doğrudan print edilmeli.
         */
        //task 2-> girilen tam sayının negaitf olmasını kontrol etme
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayı giriniz.");
        int number=scan.nextInt();
        System.out.println(number>0? "negatif değil":"negatif");
    }

}
