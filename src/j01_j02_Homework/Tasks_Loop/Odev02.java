package j01_j02_Homework.Tasks_Loop;

import java.util.Scanner;

public class Odev02 {
	static int say=0;
	public static void main(String[] args) {
		/*
		Task-> girilen bir String'deki rakam sayısını hesaplayan method create ediniz
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir string giriniz :");
		String kelime = scan.nextLine();
		System.out.println(Rakamhesaplama(kelime, (int) say));
	}

	private static <kelime> int Rakamhesaplama(String kelime, int say) {
		for (int i = 0; i < kelime.length(); i++) {
			if (kelime.charAt(i) >= '0' && kelime.charAt(i) <= '9') {
				say++;
			}
		}
		return say;
	}
}
