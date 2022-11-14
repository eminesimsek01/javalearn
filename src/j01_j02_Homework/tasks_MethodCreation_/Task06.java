package j01_j02_Homework.tasks_MethodCreation_;

import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {
		/*
		 Kullanıcıya paralelkenar, dikdörtgen ve üçgen kelimelerinden birini
		 ve iki sayı seçmesini söyleyin.
         Hangi şekli seçerse, o şeklin alanını ve çevresini ekrana yazdıran programı yazınız.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.print("paralelkenar, dikdörtgen ve üçgen kelimelerinden birini seçiniz: ");
		String secim = scan.nextLine().toLowerCase();
		System.out.println("iki sayı giriniz");
		int sayi1 = scan.nextInt();
		int sayi2 = scan.nextInt();
		if (secim.equals("üçgen")) {
			System.out.println(ucgenalan(sayi1, sayi2));
		}
		else if (secim.equals("dikdörtgen")){
			System.out.println(dikdörtgen(sayi1, sayi2));
		}
		else if  (secim.equals("paralelkenar")){
			System.out.println(paralelkenar (sayi1, sayi2));
		}
	}

	private static int paralelkenar(int x, int z) {
		int paralelkenaralan =x*z;
		return paralelkenaralan;

	}

	private static int dikdörtgen(int x, int z) {

		return (x*z);
	}

	private static int ucgenalan(int x, int z) {

		return (x*z/2);
	}

}