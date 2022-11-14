import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
		/* TASK :
		 *  Kullanicinin boyunu  m  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz

	    INFO :
		BMI = kilo(kg) /(boy*boy)(m)
		BMI <=20 oldukca zayifsiniz
		20<BMI<=25 Normal sinirlardasiniz 
		25<BMI<=30 Sisman kategorisindesiniz
		30<BMI ==> Obez grubundasiniz.
		
		 */
        Scanner scan=new Scanner(System.in);
        System.out.println("Boyunuzu metre olarak giriniz : ");
        double boy=scan.nextDouble();
        System.out.println("Kilonuzu kg olarak giriniz : ");
        double kilo=scan.nextDouble();
        double vki=kilo/(boy*boy);
        if (vki<=20){
                System.out.println("Oldukça zayıfsınız ");
        }
        else if (vki<=25&&vki>20) {
                System.out.println("Normal sınırlardasınız ");
        }
        else if (vki>25&&vki<=30){
                System.out.println("Şişman kategoridesiniz ");
        }
        else if (vki>30){
                System.out.println("Şişman kategoridesiniz ");
        }



    }

}
