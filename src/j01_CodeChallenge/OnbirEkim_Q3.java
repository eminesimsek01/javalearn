package j01_CodeChallenge;

import java.util.Scanner;

public class OnbirEkim_Q3 {
    public static void main(String[] args) {
        /*
         /*
    Girilen bir sayıya kadar olan sayılardan sadece tek olanlarını ekrana yazdırınız.
    girilen sayı dahil(tek ise), tek olanlarin adet yazdiralim
   */
        //Scanner scan=new Scanner (System.in);
        //System.out.println("bir sayı girin ");
        //int sayı=scan.nextInt();
        //int adet=0;
        // for (int i=1; i<sayı; i+=2) {
        //     adet++;
        //     System.out.println(i+"   Bu aşamadaki sayı adedi "+adet);
        // }

        Scanner scan=new Scanner (System.in);
        System.out.println("bir sayı girin ");
        int sayı=scan.nextInt();
        int count=0;// sayaç tek olan sayıları sayan değişken
        while (sayı>0){
            if(sayı%2==1){
                System.out.println(sayı+ " ");
                count++;
            }
            sayı--;
        }
        System.out.println();
        System.out.println(" count "+ count);

   }
}
