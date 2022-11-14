package j01_j02_Homework.Task2;

import java.util.Scanner;

public class _24_Scanner3 {

    public static void main(String[] args) {

     /*  kullanıcını sevdiği meyveyi print eden code create ediniz  */

        Scanner scan=new Scanner (System.in);
        System.out.print("Sevdiğiniz meyvenin adını yazınız = ");
        String meyve=scan.nextLine();
        System.out.println(" Sevdiğiniz meyve = " + meyve);


    }
}
