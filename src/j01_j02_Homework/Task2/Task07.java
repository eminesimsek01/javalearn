package j01_j02_Homework.Task2;

import java.util.Scanner;

public class Task07 {

    public static void main(String[] args) {

    /*  Problem Tanımı
        Mesafeyi ve hızı alıp süreyi hesaplayan bir kod yazınız.
        Örneğin:İstanbul ile Ankara arası 400km olarak ölçülmektedir. Bu yolu ortalama
        120 km/saat hızla giden bir araç ne kadar sürede hedefe varır?

        Örnek Ekran Çıktısı
        Mesafeyi giriniz: 400
        Hızı giriniz: 100
        Süre 4 saattir.
     */

    Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen süreyi hesaplamak için mesafeyi km olarak ve hızı km/saat olarak giriniz : ");
        double mesafe=scan.nextInt();
        double hız=scan.nextInt();
        double süre=mesafe/hız;
        System.out.println("Varmak için hesaplanan süre : " + süre+" saat");


    }
}
