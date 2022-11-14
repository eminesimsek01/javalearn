package j04_AritmeticOperators;

import java.util.Scanner;

public class C04_RakamToplamı {
    public static void main(String[] args) {
        //kullanıcıdan alınan 3 basamaklı bir sayının rakamları toplamını print eden code create ediniz.
        Scanner scan=new Scanner(System.in);
        System.out.println("Üç basamaklı bir sayı giriniz : ");
        int ucBasamakliSayi=scan.nextInt();
        int birler=ucBasamakliSayi%10;
        ucBasamakliSayi/=10; //sayının 10 ile bölümünde bölümü verir demektir.  853/10->85
        int onlar=ucBasamakliSayi%10; //Bir sayının 10'a bölümünden kalan birler basamğıdır.
        int yüzler=ucBasamakliSayi/10;//85'in 10'a bölümü
        int toplamRakam=onlar+yüzler+birler;
        System.out.println("Sayının Rakamları Toplamı = " + toplamRakam);


    }
}
