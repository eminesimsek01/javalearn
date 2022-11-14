package j01_j02_Homework.tasks_SwitchCase;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
// 2- Girilen 3 basamaklı sayıyı kelime olarak print eden code create ediniz..


        Scanner scan = new Scanner(System.in);
        System.out.print("sayi giriniz :");
        int sayi = scan.nextInt();
        int yuzler=sayi/100;
        switch(yuzler) {
            case 1:
                System.out.println("Yüz");
                break;
            case 2:
                System.out.println("İki Yüz");
                break;
            case 3:
                System.out.println("Üç Yüz");
                break;
            case 4:
                System.out.println("Dört Yüz");
                break;
            case 5:
                System.out.println("Beş Yüz");
                break;
            case 6:
                System.out.println("Altı Yüz");
                break;
            case 7:
                System.out.println("Yedi Yüz");
                break;
            case 8:
                System.out.println("Sekiz Yüz");
                break;
            case 9:
                System.out.println("Dokuz Yüz");
                break;
        }
        int onlar=(sayi%100)/10;
        switch(onlar) {
            case 1:
                System.out.println("on");
                break;
            case 2:
                System.out.println("Yirmi");
                break;
            case 3:
                System.out.println("Otuz");
                break;
            case 4:
                System.out.println("Kırk");
                break;
            case 5:
                System.out.println("Elli");
                break;
            case 6:
                System.out.println("Altmış");
                break;
            case 7:
                System.out.println("Yetmiş");
                break;
            case 8:
                System.out.println("Seksen");
                break;
            case 9:
                System.out.println("Doksan");
                break;

        }

        int onlarbasamagı=sayi%10;
        switch (onlarbasamagı) {
            case 1:
                System.out.println("Bir");
                break;
            case 2:
                System.out.println("İki");
                break;
            case 3:
                System.out.println("Üç");
                break;
            case 4:
                System.out.println("Dört");
                break;
            case 5:
                System.out.println("Beş");
                break;
            case 6:
                System.out.println("Altı");
                break;
            case 7:
                System.out.println("Yedi");
                break;
            case 8:
                System.out.println("Sekiz");
                break;
            case 9:
                System.out.println("Dokuz");
                break;
        }

    }
}
