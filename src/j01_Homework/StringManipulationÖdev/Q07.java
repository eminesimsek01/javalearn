package j01_Homework.StringManipulationÖdev;

import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {

        /* TASK :
         * Kullanicidan bir isim isteyiniz ve isim sadece 3 harfli olmalidir ternary
         * kullanarak harflerin unique(farkli) olup olmadigina bakiniz e.g: ala => 3
         * Test data: ali eme all
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("Lütfen üç harfli bir isim giriniz : ");
        String isim = sc.next();
        System.out.println(isim.charAt(0)==isim.charAt(1)?"1. ve 2. harfler aynı":"1. ve 2. harfler farklı");
        System.out.println(isim.charAt(1)==isim.charAt(2)?"2. ve 3. harfler aynı":"2. ve 3. harfler farklı");
        System.out.println(isim.charAt(0)==isim.charAt(2)?"1. ve 3. harfler aynı":"1. ve 3. harfler farklı");

    }
}