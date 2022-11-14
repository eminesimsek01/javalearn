package j01_j02_Homework.WhileLoopTasks;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /*
        task-> girilen iki tamsayı arasındaki tamsayıları print eden code create ediniz.
        for loop & while lopp
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayı giriniz : ");
        int sayı1=scan.nextInt();;

        System.out.println("Bir sayı daha girin arasındaki sayıları yazdıralım : ");
        int sayı2=scan.nextInt();
        if (sayı1<sayı2) {
            while(sayı1<sayı2) {
                System.out.print(sayı1+ " ");
                sayı1++;
            }
        } else if(sayı2<sayı1) {
            System.out.print(sayı2+ " ");
            sayı2++;
        } else
            System.out.println("aynı rakamları girdiniz, arasında sayı yok ki ");




    }
}
