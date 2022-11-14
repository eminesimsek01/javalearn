package j09_SwitchStatetment;

import java.util.Scanner;

public class c04_SwitchStatement {
    public static void main(String[] args) {
        //task-> Girilen aya göre hangi mevsimde olduğunu gösteren code create ediniz.


        Scanner sc=new Scanner (System.in);
        System.out.println("lütefen ay için bir numara girin : ");
        int ay = sc.nextInt();

        switch (ay) {
            case 1:
            case 2:
            case 12:
                System.out.println("Kış");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("İlkbahar ");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(" Yaz");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(" Sonbahar");
                break;
            default:
                System.out.println(" hatalı ay girdiniz");
                break;
        }
    }
}
