package j10_Concatenation;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /*
        Girilen passwordün aşağıdaki şartları sağlamaını kontrol eden code create ediniz
        İlk karakteri büyük harf olmalı
        Son karakteri sayı olmalı
        En az 6 karakter uzunluğunda olmalı
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("password girişi yapın da : ");
        String password=scan.nextLine();

        if (
                (password.charAt(0)>='A'&&password.charAt(0)<='Z') &&
                        (password.charAt(password.length()-1)>='0'&&
                password.charAt(password.length()-1)<='9')&&
                        (password.length()>=6)
           ) {
               System.out.println("password geçerli");
             }
        else System.out.println("password geçersiz");
    }


    }
