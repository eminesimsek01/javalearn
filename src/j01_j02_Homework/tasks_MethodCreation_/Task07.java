package j01_j02_Homework.tasks_MethodCreation_;

import java.util.Scanner;

public class Task07 {
    static Scanner scan=new Scanner (System.in);

    public static void main(String[] args) {

    /*
    Üç sayı arasındaki en küçük sayıyı bulan  method create ediniz

    Test data:
    12,24,34

    Beklenen Çıktı:
    12
    */

    Scanner scan=new Scanner (System.in);
        System.out.println("Karşılaştırmak istediğiniz üç sayıyı giriniz : ");
        int a=scan.nextInt();
        int b=scan.nextInt();
        int c=scan.nextInt();
        karsılastır((int) a, (int) b, (int) c);
    }

    public static void karsılastır(int a, int b, int c) {
        System.out.println(( a < b ? (a < c ? "min number :" + a : "min number :" + c) :
                (b < c ? "min number" + b : "min number" + c)));
    }



    }

