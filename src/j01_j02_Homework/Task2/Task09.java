package j01_j02_Homework.Task2;

import java.util.Scanner;

public class Task09 {

    public static void main(String[] args) {

    /*  Problem Tanımı
        Kullanıcıdan a,b ve c sayılarını okuyarak aşağıdaki işlemi yapan kodu yazınız
        a'nın karesinden b'nin karesini cikarip c nin 3 katina bolunuz

        Örnek Ekran Çıktısı
        a sayısını giriniz: 5
        b sayısını giriniz: 3
        c sayısını giriniz: 1
        sonuç : 5.333333333333333
        */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen a için bir değer giriniz : ");
        double a=scan.nextDouble();
        System.out.println("Lütfen b için bir değer giriniz : ");
        double b=scan.nextDouble();
        System.out.println("Lütfen c için bir değer giriniz : ");
        double c=scan.nextDouble();
        double generalG=((a*a)-(b*b))/(3*c);
        System.out.println("generalG = " + generalG);


    }
}
