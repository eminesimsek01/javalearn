package j01_j02_Homework.WhileLoopTasks;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        /*
    task -> 0 (sıfır) girilene kadar girilen tum sayıların adedini ve toplamını print eden code create edinz.
    */
    Scanner scan=new Scanner(System.in);
    System.out.println("Bir sayı giriniz :");
    int sayı=scan.nextInt();
    int toplam=0;
    int count=0;
    while (sayı==0){
        toplam+=sayı;
        count++;
        System.out.println("Sayıların toplamı = " + toplam);
        System.out.println("Sayıların adedi"+count);
    }



    }
}
