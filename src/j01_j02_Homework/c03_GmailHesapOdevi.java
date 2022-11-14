package j01_j02_Homework;

import java.util.Scanner;

public class c03_GmailHesapOdevi {
    public static void main(String[] args) {
        //task-> girilen email hesabı @gmail.com içerimiyorsa "lütfen gmail hesabı giriniz"
        //@gmail.com ile bitiyorsa "hesabınız onaylandı" aksi durumda " geçerli hesap giriniz" print eden code create
        //ediniz.
        System.out.println("Email Hesabınızı giriniz ");
        Scanner sc=new Scanner(System.in);
        String email=sc.nextLine();
        if (email.contains("@gmail.com")) {
            if (email.endsWith("@gmail.com"))
            {
                System.out.println("Hesabınız onaylandı ");
            } else System.out.println("Lütfen geçerli bir gmail hesabı giriniz.");
        }
        else System.out.println("Lürfen bir gmail hesabı giriniz ");







    }
}
