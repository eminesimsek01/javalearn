package j01_j02_Homework.Task2;

import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {
		
		
		// kullanicidan 2 tam sayi alip bu 2 tamsayinin  dort islem sonucunu yazdiriniz.
		
	Scanner scan=new Scanner(System.in);
		System.out.println("Please write two numbers : ");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		System.out.println(" Sayıların Toplamı : " +" "+(num1+num2) + "Sayıların farkı : "+" "+ (num1-num2)+
				"Sayıların çarpımı "  + " " + num1*num2 + "Sayıların bölümü :" +" "+ (num1/num2) );


	}

}
