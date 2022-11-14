package j01_j02_Homework.WhileLoopTasks;

import java.util.Scanner;

public class Task01 {
    static Scanner sc=new Scanner(System.in);
    static int sayıTopla;
    static  int sayı;
    static  int girilenSayıAdedi=0;
    public static void main(String[] args) {
        /*
        Task-> girilen sayıların toplamı 333 gectiğinde girilen sayı adedini ve toplamını prşnt eden code create ediniz.
         */
        int sayıtopla=0;
        while(sayıtopla<333) {
            System.out.println("Bir sayı giriniz lütfen :");
            int sayı = sc.nextInt();
            sayıTopla+=sayı;
            girilenSayıAdedi++;
        }
        System.out.println("Sayıların toplamı :"+sayıtopla);
        System.out.println("Sayı adediniz :"+girilenSayıAdedi++);
    }

}
