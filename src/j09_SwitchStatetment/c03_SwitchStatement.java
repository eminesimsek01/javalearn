package j09_SwitchStatetment;

import java.util.Scanner;

public class c03_SwitchStatement {
    public static void main(String[] args) {
        //task-> girilen ay numarasına göre kaç gün çektiğini print eden kod create ediniz.

       Scanner sc=new Scanner (System.in);
        System.out.println("lütefen ay için bir numara girin : ");
            int ay = sc.nextInt();

        switch (ay) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(" 31");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(" 30");
                break;
            case 2:
                System.out.println("yılı gir");
                int yil = sc.nextInt();
                if (yil%4==0){
                    System.out.println("29");
                }else System.out.println("28");
                break;
            default:
                System.out.println(" hatalı rakam girdiniz");
                break;
        }



    }



















    }
