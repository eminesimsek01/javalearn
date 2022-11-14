package j08_ifStatement;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir yıl giriniz ");
        int yıl=scan.nextInt();
        if ((yıl%4==0) && (yıl%100!=0) || (yıl%400==0)) {
            System.out.println("Artık yıl ");
        } else System.out.println("Artık yıl değildir ");
    }
}
