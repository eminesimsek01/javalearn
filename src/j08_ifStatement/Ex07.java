package j08_ifStatement;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        /*
          TASK -> Kuualanıcının ehliyetinin varlığını kontrol ediniz.
          Ehliyeti varsa yıl tecrübesi 7 yıl ve üstü ise aldıgı mesafe 100000 km ve üzeri ise
          kontak anahtarını teslim ediniz
          aksi durumda tecrübe yılı ve mesafe eksiklerini print eden code create ediniz

         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Ehliyetiniz var mı? Varsa E, Yoksa H giriniz ");
        char ehliyet = scan.next().charAt(0);
        if (ehliyet == 'E') ;
        {
            System.out.println("Kaç yıllık tecrübeniz var?");
            int tecrübe = scan.nextInt();
            if (tecrübe > 7) {
                System.out.println("Yaptığınız kilometreyi giriniz ");
                int km = scan.nextInt();
                if (km > 10000) {
                    System.out.println("Agam araba senin, gözünaydın");
                } else System.out.println(1000 - km + "arabayı almak için yola ihtiyacınız var öncelikle ");
            } else System.out.println(7 - tecrübe + "yıla ihtiyacınız var arabayı almak için ");
            if (ehliyet == 'H') {
                System.out.println("Kursa gidip ehliyet almanız gerekiyor");
            } else System.out.println(" H veya E girmeniz gerekir ");
        }
    }
}

