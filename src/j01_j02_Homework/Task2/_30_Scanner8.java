package j01_j02_Homework.Task2;

import java.util.Scanner;

public class _30_Scanner8 {

    public static void main(String[] args) {

    /*    Bir byte oluşturunuz.
          Konsola kg cinsinden bir ağırlık yazınız.
          Byte'ı yazdırınız.   */

    Scanner scan=new Scanner (System.in);
        System.out.println("Lütfen Kilonuzu Giriniz :");
    byte kg=scan.nextByte();
        System.out.println("kg = " + kg);


    }
}
