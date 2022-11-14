package j13_BreakContinue;

import java.util.Scanner;

public class C03_AsalKontrol {
    public static void main(String[] args) {
        //Girilen tam sayının asal olmasını kontro letme

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayı giriniz : ");
        int sayı=scan.nextInt();
       asalmı(sayı);
    }

    private static void asalmı(int sayı) {
        boolean asalMı=true;
        for(int i=2; i<sayı; i++){
            int toplam=0;
            if (sayı%i==0){
                asalMı=false;
                break;
            }

        }
        if(asalMı){
            System.out.println("girilen sayı ASAL");
        } else System.out.println("girilen sayı asal değil ");

    }
}
