package j01_j02_Homework.WhileLoopTasks;

import java.util.Scanner;

public class Task12 {

	public static void main(String[] args) {
		/*
		 task->girilen bir metinde harf rakam ve özel karakter sayısını print eden code create ediniz.
		do-While loop
		 */
		Scanner scan=new Scanner(System.in);
		int karakterSayısı=0;
		int harf=0;
		int rakam=0;
		System.out.println("Bir cümle girinz");
		String cümle=scan.nextLine();
		int index=0;
		do {
			if (cümle.toLowerCase().charAt(index)>='a'&&cümle.toLowerCase().charAt(index)<='z') {
				harf++;
			}
			else if (cümle.charAt(index)>='0'&&cümle.charAt(index)<='9') {
				rakam++;
			}
			else{
				karakterSayısı++;
			}
			index++;
		} while (index<cümle.length());
		System.out.println(rakam+" "+ harf+" "+ karakterSayısı);

	}

}
