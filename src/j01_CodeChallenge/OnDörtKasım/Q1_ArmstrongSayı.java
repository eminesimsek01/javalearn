package j01_CodeChallenge.OnDörtKasım;

import java.util.Scanner;

public class Q1_ArmstrongSayı {
    public static void main(String[] args) {
    /*  soru1: Check if the integer is an Armstrong numbers to 4 digit numbers(4 digit-> exclusive)
    Armstrong sayi:herhangi bir 3 basamakli sayinin rakamlarinin kupleri toplami o sayiyi veriyorsa sayi  Armstrong sayidir
        (0, 1, 153, 370, 371, 407)
        153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
        370 = 3*3*3 + 7*7*7 + 0*0*0 = 370

      soru2: Birden baslayarak girilen sayıya kadar her bir tamsayının amstrong sayı olup olmadıgını
      gösteren program yazınız */
        //4 basamak için çalışmıyor

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir Sayı giriniz : ");
        int sayı=scan.nextInt();
        armstrong(sayı);
    }

    static void armstrong(int sayı) {
        int sayınınkupleritoplamı=0;
        int basamaktaKisayı=0;
        int girilensayı=sayı;

        while (sayı>0){
            basamaktaKisayı=sayı%10;
            sayınınkupleritoplamı+=(basamaktaKisayı*basamaktaKisayı*basamaktaKisayı);
            sayı=sayı/10;
        }
        if (girilensayı==sayınınkupleritoplamı){
            System.out.println(girilensayı+" sayısı armstrong sayısıdır");
        } else System.out.println(girilensayı+" armstrong sayısı değildir");
    }
}
