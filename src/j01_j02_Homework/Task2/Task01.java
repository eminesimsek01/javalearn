package j01_j02_Homework.Task2;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        /* TASK->
		 Ask user to enter mid-term grade, final grade, and project grade
		 Calculate the general grade (mid-term : 30% , project : 20%, final : 50%)

		  Example:
		      INPUT: mid-term grade=78
		      		 final grade = 66
		      		 project grade = 90
		      OUTPUT: "Your grade is : 81,6"

		 */

    Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen final notunuzu giriniz : ");
        int f= scan.nextInt();
          System.out.println("Lütfen vize notunuzu giriniz : ");
          int v=scan.nextInt();
          System.out.println("Lütfen proje notunuzu giriniz : ");
          int p=scan.nextInt();
          double generalG=v*0.30 + p*0.20 + f*0.50;
        System.out.println(generalG+ "Not ortalamanız ");


    }
}
