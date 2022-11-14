package j12_Loops.L02_WhileLoops;

import java.util.Scanner;

public class C01_WhileLoop {
    public static void main(String[] args) {




        //Task02-> 7 kere javaCAN print eden code create ediniz..
        System.out.println("**********task02*************");
        int b=1;
        while(b<8){
            System.out.println(b+". javaCAN");
            b++;
        }
        //task03-> İki basamklı tek sayıları yanyan print eden code create ediniz.
        /*
        System.out.println("**********task03*************");
        int a=10;
        while(a<100) {
            if (a % 2 == 1)
                System.out.print(a);
            a++;
        }

         */

        int a=11;
        while(a<100) {
            System.out.println(a+" ");
            a++;
        }

        //Task04-> girilen metni while loop ile terinden print eden code giriniz.
         Scanner sc=new Scanner(System.in);
        String kelime=sc.nextLine();
        int metinuzunluk=kelime.length();
        while(metinuzunluk>=1) {//metnin son karakteri 0'a eşit ve büyük iken
            System.out.println(kelime.charAt(metinuzunluk-1));//
            metinuzunluk--;
        }
        //Task05-> Girilen tamsayıya kadar tamsayıların t
        System.out.println("Bir sayı giriniz : ");
        int sayı=sc.nextInt();
        int toplam=0;
        while (sayı>0) {//sayı 0'dan büyük olduğu sürece
            toplam+=sayı;//her döngüde sayıyı toplama ekle
            sayı--;//her döngüde sayıyı 1 azalt
        }
        System.out.println("agam girdiğin sayılar toplamı : "+toplam);


        // task05// Girilen tamsayıya kadar sayının faktöriyelini print eden code create ediniz.
        System.out.println("Bir tam sayi giriniz :");
        int num=sc.nextInt();
        int faktöriyel=1;
        while (num>0) {//sayı 0'dan büyük olduğu sürece
            faktöriyel*=sayı;//her döngüde sayıyı toplama ekle
            sayı--;//her döngüde sayıyı 1 azalt
        }
        System.out.println("Girdiğiniz sayının faktöriyeli :"+faktöriyel);



    }//main sonu


}
