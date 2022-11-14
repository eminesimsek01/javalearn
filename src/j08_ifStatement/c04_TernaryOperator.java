package j08_ifStatement;

import java.util.Scanner;

public class c04_TernaryOperator {
    public static void main(String[] args) {
       // //Girilen bir pozitif tamsayının iki veya daha fazla basamaklı olmasını kontrol eden bir kod create ediniz.
       // Scanner scan=new Scanner(System.in);
       // System.out.println("Bir sayı giriniz");
       // int a=scan.nextInt();
       // String sonuc=(a>9)?"sayı iki veya daha fazla basamaklıdır":"sayı iki basamklı değildir";
       // System.out.println("sonucun ekrandadır agam: "+sonuc);

        // TASK-> girilen  bir tamsayının 2 veya daha fazla basamaklı olmasını kontrol eden code create ediniz.
        Scanner sc = new Scanner(System.in);
        System.out.println("agam bi tamsayı gir bakam : ");
        int agaSayisi = sc.nextInt();
        System.out.println(agaSayisi > 9 ? " sayı iki veya daha fazla basamaklı  " : "sayı tek basamaklı");
        String sonuc =( agaSayisi > 9 ||agaSayisi<-9)? " sayı iki veya daha fazla basamaklı  " : "sayı tek basamaklı";
        System.out.println(sonuc);



    }
}
