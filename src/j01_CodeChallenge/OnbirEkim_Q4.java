package j01_CodeChallenge;

import java.util.Scanner;

public class OnbirEkim_Q4 {
    public static void main(String[] args) {

         /*  Problem Tanımı
            Girilen bir sayı kadar satır ve sütünu olan ve
            sağ kenara dayalı üçgeni basan kodu yazınız.

            Ekran Çıktısı
            Bir sayi giriniz: 5
                   *
                  **
                 ***
                ****
               *****

                  */

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayı giriniz :");
        int sayı=scan.nextInt();
        for (int satır=1; satır<=sayı; satır++ ){//satır kontrolü
            for (int bosluk=sayı-satır; bosluk>0 ; bosluk--){//boşluk kontrolü
                System.out.print(" ");
            }
            for ( int sütun=1; sütun<=satır; sütun++){//sütun kontrolü
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
