package j08_ifStatement;

import java.util.Scanner;

public class c07_NestedTernaryOperator {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println(" Sayı gir kullanıcı ");
        int sayi=scan.nextInt();
        System.out.println(sayi>999&&sayi<10000?"4 basamaklı sayı ":sayi%2==0?"4 basamaklı olmayan çift sayı":"4 basamaklı olmayan tek sayı");


    }
}
