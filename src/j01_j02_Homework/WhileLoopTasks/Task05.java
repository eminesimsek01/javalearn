package j01_j02_Homework.WhileLoopTasks;

import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {
		/*
		task-> girilen  isim ve soyismi için ilk isminin ilk harfinden soy isminin son harfine kadar olan butun harfleri
		 ayni satirda aralarina bosluk birakarak print rden code create ediniz

		 */
		
		Scanner scan=new Scanner (System.in);
		System.out.println(" Adınızı ve soyadınızı boşluk bırakmadan giriniz ");
		String kelime=scan.nextLine();
		int i=0;
		while(i<kelime.length()){
			System.out.print(kelime.charAt(i)+" ");
			i++;
		}



	}

}
