package j01_j02_Homework.tasks_If;

import java.util.Scanner;

public class _04_if_else_if_statement4 {

    public static void main(String[] args) {

     /* double1 ve double2 isimli iki tane double oluşturulmuştur.
        Eğer double1, double2'dan büyük ise "double 1 is greater than double 2" yazdırınız.
        Eğer double1, double2'dan küçük ise "double 1 is smaller than double 2" yazdırınız. */

    Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen iki adet ondalıklı sayı giriniz : ");
    double sayi1=scan.nextDouble();
    Scanner sc=new Scanner(System.in);
    double sayi2=scan.nextDouble();
    if (sayi1>sayi2){
        System.out.println( "double 1 is greater than double 2 ");
    }
    else if (sayi1<sayi2) {
        System.out.println(" double 1 is samller than double 2 ");

    }


    }
}
