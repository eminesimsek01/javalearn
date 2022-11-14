package j10_Concatenation;

import java.util.Scanner;

public class c04_Contains {
    public static void main(String[] args) {
        /*
        String içerisinde istenen stringin varlığını kontrol eder ve boolean return eder.
         */
        String s1= "Enise Hanım başarılı bir Qa tester team lead";
        System.out.println(s1.contains("hanım"));//false
        System.out.println(s1.contains("E"));//true
        System.out.println(s1.contains(" "));//true

        String s2="Qa";
        System.out.println(s1.contains(s1));//true //Bir stringin içerilip içerilmediğini de kontrol edebiliriz.
        System.out.println(s2.contains(s1));//false

        //task->
        //Girilen bir cümlede aranan kelimenin varlığını kontrol eden bir code create ediniz.
        //Ternary kullan
        Scanner sc=new Scanner(System.in);
        System.out.println("Bir cümle giriniz");



    }
}
