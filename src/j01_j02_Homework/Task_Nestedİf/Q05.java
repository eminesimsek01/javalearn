import java.util.Scanner;

public class Q05 {

    public static void main(String[] args) {
		/*
		TASK :
		Kullanicidan  yasini ve kilosunu alaliniz
		18 yasindan kucuk ise kan bagisi yapamaz
		18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
		18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.
		 */
        Scanner scan=new Scanner(System.in);
        System.out.println("Yaşınızı giriniz lütfen ");
        int yas=scan.nextInt();
        if (yas>18)
        {
            System.out.println("Kilonuz nedir? ");

            double kilo=scan.nextDouble();
            if (kilo>50)
            {
                System.out.println("Kan bağışı yapabilirsiniz ");
            } else if (kilo<=50) {
                System.out.println("Kan bağışı yapamzsınız, kilonuz 50'den büuük olmalı");}

        }
        else if (yas<=18)
        {
            System.out.println("Kan bağışı yapamzsınız yaşınız 18'den büyük değil  ");
        }


    }




}
