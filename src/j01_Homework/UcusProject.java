package j01_Homework;

import java.util.Scanner;

public class UcusProject {
    static Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Uçamk istediğiniz şehi seçiniz :  B, C, D şehirleri ");
        String sehir=scan.nextLine().toUpperCase();
        System.out.println("agam uçuş yönü için \ntek yon -> 0\nçift yon ->1\n seçiniz ");
        String ucusuyonu=scan.nextLine();
        double fiat = 0;
        System.out.println("Lütfen yaşınızı giriniz :");
        int age=scan.nextInt();
        if (age<12) {
           age12(sehir, (double) fiat);
        } else if (12<age&&age<24){
            age1224(sehir, (double) fiat);
        }else if (age>65){
            age65(sehir, (double) fiat);
        }
    }

    private static void sehir(String sehir,double ucret) {
        if (sehir.equals("B")){
           double fiyatB = 500/10;
           ucret=fiyatB;}
        else if (sehir.equals("C")){
            double fiyatC = 700/10;
            ucret=fiyatC;}
       else if (sehir.equals("D")){
            double fiyatD = 900/10;
            ucret=fiyatD;}
        }

    private static void age65(String sehir, double ucret) {
        sehir(sehir, ucret);
        ucret = ucret - (ucret * 0.3);
        System.out.println("ucretiniz :" + ucret);
    }
    private static void age1224(String sehir, double ucret) {
       sehir(sehir, ucret);
        ucret=ucret-(ucret*0.2);
        System.out.println("ucretiniz :"+ucret);
    }

    private static void age12(String sehir, double ucret) {
        sehir(sehir, ucret);
        ucret=ucret-(ucret*0.1);
        System.out.println("ucretiniz :"+ucret);
    }
}
