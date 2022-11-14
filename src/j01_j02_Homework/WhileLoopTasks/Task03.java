package j01_j02_Homework.WhileLoopTasks;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		/*

        task-> girilen  tamsayı için carpim tablosunu print eden code create ediniz.

		 Ornek input = 13
		 13x1=13 13x2=26  . . .. .  . 13x10=130
		 */

		Scanner scan=new Scanner (System.in);
		System.out.println("Bir sayı giriniz, o sayıya kadar çarpım tablosunu yazdıralım ");
		int sayı=scan.nextInt();
		int i=1;
		while(i<=sayı) {
			System.out.println(sayı+" x "+i+" = "+ sayı*i);
			i++;
		}
				

	}

}
