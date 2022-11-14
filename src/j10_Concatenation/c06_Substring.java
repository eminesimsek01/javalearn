package j10_Concatenation;

import java.util.Scanner;

public class c06_Substring
{
    public static void main(String[] args) {

        /*
        substring()
        Metin icinde, istenilen araliktaki bir parcasina ya da butunune ulasilabilir. Sonuc ise String dir.
        substring(i)->Method'a parametre olarak girilen  index'den sona kadar olan parcayi return eder
        substring(baslangicIndexi, bitisIndexi)->Method'a parametre olarak girilen  baslangicIndexi'den bitis
        indexi'e kadar parçayı return eder
        baslangic indexi ==> inclusive/dahil
        bitis indexi ==> eclusive/haric
         */
        String str="java bilen sırtı yere gelmez :) ";
        System.out.println(str.substring(10));//sırtı yere gelmez
        System.out.println(str.substring(str.length()-10));//gelmez
        //str datasının ilk 10 karakterini yazdırın
        System.out.println(str.substring(0,10));
        //str datasının ilk karakterini print ediniz
        System.out.println(str.substring(0,1));//j->0 alır 1 almaz yani 0. karakteri ilk karakter verir.

        //task-> girilen 4 harfli kelimeyi tersten print eden code create ediniz.
        Scanner scan=new Scanner(System.in);
        System.out.println("Dört harfli kelime giriniz : ");
        String kelime= scan.next();
        if (kelime.length()!=4) {
            System.out.println("agam sana 4 harfli gir demedik mi? :(");
        } else {
            System.out.println(kelime.substring(3,4));
            System.out.println(kelime.substring(2,3));
            System.out.println(kelime.substring(1,2));
            System.out.println(kelime.substring(0,1));
        }

    }
}
