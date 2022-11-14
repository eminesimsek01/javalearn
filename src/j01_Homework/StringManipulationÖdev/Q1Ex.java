package j01_Homework.StringManipulationÖdev;

import java.util.Scanner;

public class Q1Ex {
    public static void main(String[] args) {
        // TASK : Kullanıcıdan alacağınız bir stringde boşluk karakterinin olup olmadığını kontrol ediniz.
        Scanner sc=new Scanner(System.in);
        System.out.println("Lütfen bir kelime giriniz : ");
        String kelime=sc.nextLine();
        System.out.println(kelime.contains(" ")==true?"Kelimede boşluk var":"Kelimede boşluk yok");

    }
}

