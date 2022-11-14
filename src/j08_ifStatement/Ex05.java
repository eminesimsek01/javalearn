package j08_ifStatement;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        /*
        Task:Girilen iki sayıyı seçilen dört işlemden birine uygulayıp sonucu print eden code create ediniz.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("İki sayı giriniz : ");
        double sayi1= scan.nextDouble();
        double sayi2=scan.nextDouble();
        //Method 1
        //System.out.println("Bir işlem seçiniz  +, -, x, / ");
        //        char operation=scan.next().charAt(0);
        //        if (operation=='+'){
        //            System.out.println(sayi1+sayi2);
        //        }
        //        else if (operation=='+'){
        //            System.out.println(sayi1-sayi2);
        //        }
        //        else if (operation=='*'){
        //            System.out.println(sayi1*sayi2);
        //        }
        //        else if (operation=='/'){
        //            System.out.println(sayi1/sayi2);

        //Method 2
        System.out.println("+ için 1 seçiniz\n- için 2 seçiniz\n* için 3 seçiniz\n/ için 4 seçiniz ");
        int secim=scan.nextInt();

        if (secim==1){
            System.out.println(sayi1+sayi2);
                }
        else if (secim==2){
            System.out.println(sayi1-sayi2);
        }
        else if (secim==3){
            System.out.println(sayi1*sayi2);
        }
        else if (secim==4){
            System.out.println(sayi1/sayi2);
        }
        else System.out.println(" normal ol, normal işlem seç");


        
    }
}
