package j01_j02_Homework.tasks_MethodCreation_;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		// Saati saniyeye, mil'i kilometreye, kilogrami gram'a
		// ceviren bir method yaziniz.
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen bir saat giriniz : ");
		double saat=scan.nextDouble();

		System.out.println("Lütfen bir mil giriniz : ");
		double mil=scan.nextDouble();

		System.out.println("Lütfen bir kg değeri giriniz");
		double kilogram=scan.nextDouble();

		saatcevir((double) saat, (double) mil, (double) kilogram);//method çağırma, method calls


	}
	public static void saatcevir(double x, double y, double z) {
		System.out.println("girdiğiniz saat  "+(x*3600));
		System.out.println("girdiğiniz mil  "+(y*1609344) );
		System.out.println("girdiğiniz kg  "+(z*1000));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
