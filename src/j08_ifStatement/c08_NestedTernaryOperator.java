package j08_ifStatement;

import java.util.Scanner;

public class c08_NestedTernaryOperator {
    public static void main(String[] args) {
        /*
       Kullanıcıdan alacağı ürün miktarını ve ürünün birim fiyatını alın. Eğer urun miktarı 100 den fazla ise
       %33  indirim yapıp  ödemesi gereken toplam miktarı print eden code create ediniz.
        */
        Scanner scan=new Scanner(System.in);
        System.out.println(" Main miktarı : ");
        int urunm=scan.nextInt();
        System.out.println("Main fiyatı : ");
        int adet=scan.nextInt();
        double sonuc=urunm>100?urunm*adet*0.67:urunm*adet;
        System.out.println(sonuc);
    }
}
