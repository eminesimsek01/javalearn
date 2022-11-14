package j08_ifStatement;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        /*
        Task-> Girilen bir karakterin harf olup olmadığını kontrol eden bir code create ediniz.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir karakter giriniz : ");
        char ch=scan.nextLine().charAt(0);
        if ((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z')) {
            System.out.println("girdiğiniz karakter harftir :)");
        } else System.out.println(" girdiğiniz karakter harf değildir :(");

        
    }
}
