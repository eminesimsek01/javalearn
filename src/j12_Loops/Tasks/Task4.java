package j12_Loops.Tasks;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        /*
        Girilen iki sayı arasındaki çift sayıları print eden ko create ediniz...
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayı giriniz : ");
        int sayi1=scan.nextInt();

        System.out.println("Bir sayı giriniz : ");
        int sayi2=scan.nextInt();

        if (sayi1<sayi2){
            for (int i=sayi1; i<sayi2; i++){
                if (i%2==0){
                    //döngü içindeki sayıların çift kontrolü
                    System.out.print(i+" ");
                }
            }

        } else for(int i=sayi2; i<sayi1; i++){
            if (i%2==0){
                System.out.print(i+" ");
            }
        }

        // for (int i=(a<b?a:b);i<=(a>b?a:b);i++ ){
        //            System.out.print(i%2==0?i:" ");
        //        }

    }//main dışı
}
