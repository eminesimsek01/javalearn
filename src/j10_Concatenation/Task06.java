package j10_Concatenation;

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        /*
        Girilen stringin son karakterini silen code create ediniz:..
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Adınızı giriniz : ");
        String ad =scan.nextLine()     ;
        System.out.println(ad.substring(0, ad.length()-1));
        //str.replace(str.length() - 1, "");//Bir önceki satırın alternatifi









    }
}
