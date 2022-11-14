package j01_j02_Homework.tasks_SwitchCase;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        // Girilen bir sayının onlar basamağının değerini yazı ile yazdırınız.

        Scanner sc = new Scanner(System.in);
        System.out.print("Sayi = ");
        int sayi = sc.nextInt();
        int kalan=sayi%10;
        switch (kalan){
            case 0:
                System.out.println("Girdiğiniz sayının onlar basamağı sıfırdır" );
                break;
            case 1:
                System.out.println("Girdiğiniz sayının onlar basamağı birdir" );
                break;
            case 2:
                System.out.println("Girdiğiniz sayının onlar basamağı ikidir ");
                break;
            case 3:
                System.out.println("Girdiğiniz sayının onlar basamağı üçtür");
                break;
            case 4:
                System.out.println("Girdiğiniz sayının onlar basamağı dörttür");
                break;
            case 5:
                System.out.println("Girdiğiniz sayının onlar basamağı beştir");
                break;
            case 6:
                System.out.println("Girdiğiniz sayının onlar basamağı  altıdır" );
                break;
            case 7:
                System.out.println("Girdiğiniz sayının onlar basamağı yedidir" );
                break;
            case 8:
                System.out.println("Girdiğiniz sayının onlar basamağı  sekizdir");
                break;
            case 9:
                System.out.println("Girdiğiniz sayının onlar basamağı dokuzdur" );
                break;


        }




    }
}
