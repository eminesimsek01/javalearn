package j01_j02_Homework.tasks_If;

import java.util.Scanner;

public class _18_if_else_statement_find_min {

    public static void main(String[] args) {

    /*    Oluşturulan bu 3 int arasında en düşük değerdeki numarayı bulunuz.
          Bu numarayı yazdırınız.
          Not: Kodunuz her farklı senaryoda en küçük numarayı yazdırmalıdır.

          Örn: 10-11-12 > 10  */


        Scanner scan = new Scanner(System.in);
        System.out.println(" Üç farklı tamsayı giriniz : ");
        int i1 = scan.nextInt();
        int i2 = scan.nextInt();
        int i3 = scan.nextInt();

        //Kodu aşağıya yazınız. BU SATIRIN YUKARISINI DEĞİŞTİRMEYİNİZ.

        if (i1<i2&&i1<i3){
            System.out.println(i1+" minimum sayıdır ");
        }
        else if (i2<i3&&i2<i1){
            System.out.println(i2+" minimum sayıdır");
        }
        else if (i3<i2&&i3<i1){
            System.out.println(i3+" minimum sayıdır");
        }


    }
}
