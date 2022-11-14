package j01_j02_Homework.Task2;

import java.util.Scanner;

public class _22_Scanner1 {

    public static void main(String[] args) {

    /*    kullanıcının ismini print eden code create ediniz */
        Scanner scan=new Scanner (System.in);
        System.out.print("Adınızı Giriniz= ");
        String isim= scan.nextLine();
        System.out.println("isim = " + isim);


    }
}
