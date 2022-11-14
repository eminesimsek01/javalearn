package j01_j02_Homework.ArrayListsTask;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task11_Fibonacci {
     /*
     Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
     1-1-2-3-5-8-13-21-34....
     */

     static int firstterm=1;
     static int secondterm=1;
     public static void main(String[] args) {
         Scanner scan=new Scanner (System.in);
         System.out.println("Bir sayı giriniz, o sayıya kadar bir fibonacci dizisi oluşturalım: ");
         int limitnum=scan.nextInt();
          System.out.print("1 1 ");
          int nexterm=0;
        while(nexterm<limitnum-2){
             nexterm = firstterm + secondterm;
             firstterm = secondterm;
             secondterm = nexterm;
             System.out.print(nexterm+" ");
         }
     }




}
