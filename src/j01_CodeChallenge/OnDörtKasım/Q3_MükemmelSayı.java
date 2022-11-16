package j01_CodeChallenge.OnDörtKasım;

import java.util.Scanner;

public class Q3_MükemmelSayı {
      //Q03_PerfectNumber
    /* Perfect Number (Mukemmel sayi)
      Kullanici tarafindan bir sayiya kadar olan sayilarin,
      mukemmel olup olmadigini bulan method yaziniz.
      Mukemmel sayi : bir sayinin kendisi haric bolenlerinin toplami,
      kendisine esitse o sayi mukemmeldir. (1+2+3 = 6 = 6 (Mukemmel))
      ORNEK: (6, 28, 496, 8128)
      INPUT      : 6
      OUTPUT     :  1,2,3
    */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayı giriniz:");
        int sayı=scan.nextInt();

        perfectnumber(sayı);
        girilensayıyakadar(sayı);
    }
    private static void girilensayıyakadar(int sayı){
        int toplam=0;
        for (int i=1; i<sayı; i++){
            for (int j=1; j<i; j++){
                if(i%j==0){
                    toplam+=j;
                }
            }
            if(toplam==i){
                System.out.println(i+"mükemmel sayıdır");
            }toplam=0;
        }
    }

    private static void perfectnumber(int sayı) {
        int toplam=0;
        for (int i=1; i<sayı; i++){//1'den başlayarak bölenleri kontrol edeceğiz, sayı dahil olmamalı
            if (sayı%i==0)//sayının herhangi bir böleni varsa
            {
                toplam+=i;//toplam değişkenine ekle
                System.out.println(i+" ");//bölenleri görmek için
            }
        }
        System.out.println();
        if(toplam==sayı){
            System.out.println(sayı+" mükemmel sayıdır ");
        }else
            System.out.println(sayı+" mükemmel sayı değildir");
    }
}
