package j08_ifStatement;

import java.io.Serializable;
import java.util.Scanner;

public class c05_TernaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("tamsayı girin : ");
        int agaSayisi = sc.nextInt();
        Serializable sonuc=(agaSayisi%2==0)?agaSayisi/2:"girilen sayı tek sayı değildir, yarısı da tamsayı değildir";
        System.out.println(sonuc);
        /*
        Ahan da TRICK:
        Ternary iki durum (T/F) için farklı data type çıktısı veriyorsa variable atama yapmadan ya da ternary çıktısı
        aynı data  type'a cast edilmeli.
         */
    }
}
