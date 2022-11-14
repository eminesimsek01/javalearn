package j01_j02_Homework.Task2;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /*
         * TASK ->
         *
         * Kullanicidan boyunu cm olarak, kilosunu kilogram olarak alin
         * ve vucut kutle endeksini bulun.
         * Sonucu tamsayi ve ondalikli sayi olarak yazdirin
         *
         * VKE= kilo/(boy*boy) …….. Kilo : kilogram , Boy : metre olmalidir
         *
         * Ornek : Input : boy :180 kilo : 80
         *         Output : Vucut kutle endeksiniz : 24
         *                  Vucut kutle endeksiniz : 24.691…
         *
         *
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("please enter your height as cm :");
        double height=scan.nextDouble();
        System.out.println("please enter your weight as kg :");
        double weight=scan.nextDouble();
        double bodymi=weight/((height/100)*(height/100));
        System.out.println("Your body mass index = " + bodymi);
        System.out.println("Your body mass index = "+ (int)bodymi);



    }
}
