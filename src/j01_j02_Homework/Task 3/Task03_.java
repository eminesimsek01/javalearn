import java.util.Scanner;

public class Task03_ {
	
	public static void main(String[] args) {
		
		/* Soru 10:
		 * Kullanicinin girdigi 3 basamakli sayinin ilk ve son rakamlarinin toplamini veren programi yaziniz.
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("Üç basamaklı bir sayı giriniz : ");
		int sayi=scan.nextInt();
		int birler=sayi%10;
		int yüzler=sayi/100;
		System.out.println("Girdiğiniz üç basamaklı sayının birler basamağı ve yüzler basamağı toplamı : "+(birler+yüzler));

		
	}

}
