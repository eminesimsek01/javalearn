package j01_j02_Homework;

import java.util.Scanner;

public class c05_Kelime {
    public static void main(String[] args) {
        //task->
        //Girilen bir cümlede aranan kelimenin varlığını kontrol eden bir code create ediniz.
        //Ternary kullan
        Scanner sc=new Scanner(System.in);
        System.out.println("Bir cümle giriniz");
        String cumle=sc.nextLine();
        System.out.println("Aramak istediğiniz kelimeyi giriniz");
        String aranacakkelime=sc.nextLine();
        String s = cumle.contains(aranacakkelime) == true ? "aradığınız kelime cümlede var" : "aradığınız kelimede cümlede bulunmamaktadır";
        System.out.println("Aramanızın sonucu : "+s);

    }
}
