package j01_CodeChallenge;

import java.util.Scanner;

public class OnbirEkim_Q5 {
    public static void main(String[] args) {
        /* Kullanicidan sayilar girmesini isteyin
         * ve girdigi sayilari toplayip yazdirin.
         * yeni sayi isteyin
         * girilen sayilarin toplami 100 'u gecerse
         * "... kere sayi girdin. Bu kadar sayi yeter" yazdirin ve oyunu bitirin
         *
         */

        Scanner scan=new Scanner (System.in);
        int sayı;
        int toplam = 0;
        int adet=0;
        while( toplam<100){
            System.out.println("Bir sayı giriniz : ");
        sayı = scan.nextInt();
        toplam+=sayı;
        adet++;
            System.out.println("toplam"+toplam);
        }
        System.out.println(adet + " kere sayı girdin Ağam Bu kadar sayı yeter. Ahanda Toplam = " +toplam);
    }
}
