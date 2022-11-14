package j12_Loops.Tasks;

import java.util.Scanner;

public class Task03_Fakötriyel {
    public static void main(String[] args) {
        /*
        Task-> girilen sayının faktöriyelini hesaplayan method create ediniz.
        sayi!= 1*2*3*...........*sayi

         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayı giriniz : ");
        int sayı=scan.nextInt();

        System.out.println(faktöriye(sayı));

    }

    private static int  faktöriye(int sayı) {
        int faktöriyel=1;
        for (int i=1; i<=sayı; i++){
            faktöriyel*=i;
        }
        //System.out.println("faktöriyel : "+faktöriyel);
        return faktöriyel;
    }
}
