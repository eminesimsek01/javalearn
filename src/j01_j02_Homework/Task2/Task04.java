package j01_j02_Homework.Task2;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        /* TASK ->
        Clarusway spor salonu için kullanıcıdan isim soyisim, yaş, kilo, boy, salona devam edeceği ay süresini
        bilgilerini alıp aylık $20 olarak toplam ücretini hesplayıp print eden code create ediniz.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Plase give your personal information :");
        System.out.println("Your name and Surname : ");
        String nameSurname=scan.nextLine();
        System.out.println("Your age :");
        int age=scan.nextInt();
        System.out.println("How many monts will you come? ");
        int durationS=scan.nextInt();
        int totalFee=(durationS*20);
        System.out.println("Total Fee : "+totalFee);


    }
}
