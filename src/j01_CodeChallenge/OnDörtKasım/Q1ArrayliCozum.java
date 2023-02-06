package j01_CodeChallenge.OnDörtKasım;

import java.util.Scanner;


public class Q1ArrayliCozum {
    public static void main(String[] args) {
       // Q02_ArmstrongNumber_4Digits
      /*
      Armstrong sayi:herhangi bir sayinin rakamlarinin kupleri toplami o sayiyi veriyorsa sayi  Armstrong sayidir
      (0, 1, 153, 370, 371, 407, 1634)
      153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
      370 = 3*3*3 + 7*7*7 + 0*0*0 = 370
      1634 = 1*1*1*1 + 6*6*6*6 + 3*3*3*3 + 4*4*4*4 = 1634
      5 basamakli : 54748 */
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir Sayı giriniz : ");
        String strSayı=scan.nextLine();
        armstrong1(strSayı);
    }
    private static void armstrong1(String strSayı) {
        String [] basamak =strSayı.split("");
        int toplam=0;
        for (int i=0; i<basamak.length; i++){
            toplam+=Math.pow(Integer.valueOf(basamak[i]),basamak.length);
            //String olan her bir basamağı integera çevirdik-> taban
            //basamak.length->üs
        }
        if (Integer.valueOf(strSayı)==toplam){
            System.out.println(" Bu bir armstrong sayıdır");
        } else System.out.println(" Bu bir armstrong sayı değildir");
    }
}
