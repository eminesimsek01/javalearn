package j01_j02_Homework.Task2;

import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {

    /*  Problem Tanımı
        Bir dik üçgenin iki dik kenarını alarak hipotenüsünü hesaplayan kod yazınız.

        Örnek Ekran Çıktısı
        birinci kenar: 12
        ikinci kenar: 5
        hipotenus: 13      */

    Scanner scan=new Scanner(System.in);
        System.out.println("Üçgenin dik kenarları için değerler giriniz : ");
    double dkenar1=scan.nextDouble();
    double dkenar2=scan.nextDouble();
    double hypo=Math.sqrt((dkenar1)*(dkenar1)+(dkenar2)*(dkenar2));
    System.out.println(" Hipotenüs kenarının uzunluğu : "+hypo);


    }
}
