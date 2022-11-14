package j11_MethodCreation;

import java.util.Scanner;

public class c05_RecursiveMethod {
    public static void main(String[] args) {
        ///*
        //Recursive  call edildiğinde run time'da programa ekstradan yük getiren bir yapıdadır
        //çünkü bir fonksiyon kendi kendini çağırdığında her çağırmada yığında (stack) bir işlem gerçekleşir ve bir bellek konumu oluşur.
        //Bu yüzden özyineleme ile yapılan hesaplamalar daha yavaş ve verimsizdir.
        //Peki özyinelemeyi neden kullanıyoruz?
        //Bazı karmaşık çözülmesi güç problemlerde döngülere göre daha kısa ve anlaşılır olduğu için.
        // */

        /*
        Girilen sayıdan 1'e kadar olan sayıların çarpımına faktöriyel denir.
         */
        //1!=1
        //0!=1
        //task->Girilen sayının faktöriyelini hesaplayan method create ediniz.


        Scanner scan=new Scanner(System.in);
        System.out.println("Bir tam sayı giriniz : ");
        int sayi=scan.nextInt();
        System.out.println(faktöriyel(sayi));


    }//main dışı
    public static int faktöriyel (int a){
        if (a >= 1) {
            return a*faktöriyel(a-1);
        } else return 1;


    }
}
