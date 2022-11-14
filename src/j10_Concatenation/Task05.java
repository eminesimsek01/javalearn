package j10_Concatenation;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
     /* Task->
    Girilen ad soyad bilgilerinin ilk harflerini buyuk harf print eden code create ediniz..
     */
              Scanner scan=new Scanner(System.in);
              System.out.println("Adınızı giriniz : ");
              String ad =scan.nextLine()     ;

              System.out.println("Soyadınızı giriniz : ");
              String soyad =scan.nextLine()     ;
        System.out.print(ad.substring(0,1).toUpperCase()+ad.substring(1));
        System.out.println(" "+soyad.substring(0,1).toUpperCase()+soyad.substring(1));



    }



}
