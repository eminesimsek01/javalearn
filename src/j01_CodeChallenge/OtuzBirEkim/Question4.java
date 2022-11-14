package j01_CodeChallenge.OtuzBirEkim;

import java.time.LocalDate;
import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {

        /*
        Bir aydaki gün sayısını hesaplayan bir Java programı yazınız.

        INPUT:
        Ay Numarasi:
        2
        Yil :
        2016
        OUTPUT :
        Subat 2016 29 Gundur.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Yıl giriniz :");
        int yil = scan.nextInt();
        System.out.println("Ay bilgisini giriniz : ");
        int ay = scan.nextInt();
        LocalDate trh = LocalDate.of(yil, ay , 1);
        System.out.println(trh.lengthOfMonth());

    }
}
