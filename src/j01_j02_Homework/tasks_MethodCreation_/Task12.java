package j01_j02_Homework.tasks_MethodCreation_;

import java.util.Scanner;

public class Task12 {

    public static void main(String[] args) {

    /*    Kullanıcıdan alınan bir mailin doğru olup olmadığını kontrol eden method create ediniz

    Şartlar:
    * Bir mail adresinde @ karakteri olmalı
    * Bir mail adresinde . (nokta) karakteri olmalı
    * Bir mail adresinde @ karakterinden önce en az bir karakter yazılmalı (a@gmail.com gibi)

    Örnekler
    validateEmail("@gmail.com")
    Çıktı : false

    validateEmail("gmail")
    Çıktı : false

    validateEmail("hello@gmail")
    Çıktı : false

    validateEmail("hello@edabit.com")
    Çıktı : true
    */
    Scanner scan=new Scanner (System.in);
        System.out.println("Emailinizi giriniz lütfen");
        String email=scan.nextLine();
        System.out.println(emailchecking(email));

    }

    private static <string> String emailchecking(String email) {
       String sonuc= (email.contains("@")&&email.contains(".")?(email.charAt(email.length()-1)>'a'&&email.charAt(email.length()-1)<'z'?"Congratualtions!" +
                "emailiniz doğru formatta":"emailinizde @ ifadesinden önce bir karakter bulunmalı "):
                "@ veya . ifadesi girmeyi unutmuş olmalısınız");

        return sonuc;
    }
    }

