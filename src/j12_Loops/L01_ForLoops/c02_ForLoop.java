package j12_Loops.L01_ForLoops;

import java.util.Scanner;

public class c02_ForLoop {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayı giriniz : ");
        int sayı=scan.nextInt();
        if (sayı>=100){
            System.out.println("agam hani sayıyı 100'den küçük girecektin :(");}
        else {
        for(int i=sayı; i<100; i++){
            if(i%4==0) {
                System.out.println(i+" .");
            }
        }

        }
    }
}
