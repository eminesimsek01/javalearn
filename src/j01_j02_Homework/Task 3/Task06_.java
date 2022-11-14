import java.util.Scanner;

public class Task06_ {

    public static void main(String[] args) {

        /*
         * Kullanicidan uc basamakli bir sayi alin
         * ve sayinin rakamlarini birler,onlar ve yuzler basamagi olarak yazdirin
         *
         *
         * Ornek : Inputs : 853
         * Output : Girdiginiz sayinin birler basamagi : 3
         *          Girdiginiz sayinin onlar basamagi : 5
         *          Girdiginiz sayinin yuzler basamagi : 8
         *
         *
         */

    Scanner scan=new Scanner(System.in);
        System.out.println("Üç basamaklı bir sayı giriniz : ");
        int ucBasamakliSayi=scan.nextInt();
        int birler=ucBasamakliSayi%10;
        ucBasamakliSayi/=10; //sayının 10 ile bölümünde bölümü verir demektir.  853/10->85
        int onlar=ucBasamakliSayi%10; //Bir sayının 10'a bölümünden kalan birler basamğıdır.
        int yüzler=ucBasamakliSayi/10;//85'in 10'a bölümü
        System.out.println("Girdiğiniz sayının birler basamağı : "+birler+"\nGirdiğiniz sayının onlar basamağı : " +
                +onlar +"\nGirdiğiniz sayının yüzler basamağı :"+yüzler);


    }
}
