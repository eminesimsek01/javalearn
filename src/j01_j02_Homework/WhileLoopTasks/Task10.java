package j01_j02_Homework.WhileLoopTasks;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        // task ->  Girilen bir sayıya kadar  tek olanlarını print eden code create ediniz.

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayı giriniz, o sayıya kadar tek olanları yazdıralım :");
        int sayı=scan.nextInt();
        int num=-1;
        while(num+1<sayı) {
            num=num+2;
            System.out.print(num+" ");
        }

    }
}
