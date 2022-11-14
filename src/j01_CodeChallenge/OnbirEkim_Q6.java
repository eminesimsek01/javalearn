package j01_CodeChallenge;

import java.util.Scanner;

public class OnbirEkim_Q6 {
    public static void main(String[] args) {

         /*  Problem Tanımı
          Verilen iki sayının kombinasyonunu bulan kodu yazınız.
          Hatırlatma C(n,r) = n! / (r!(n-r)!)

          Verilen iki sayının permütasyonunu bulan kodu yazınız.
          Hatırlatma P(n,r) = n! / (n-r)!

          Ekran Çıktısı
          Birinci sayıyı giriniz: 15
          Ikinci sayıyı giriniz: 4
          Kombinasyon: 1365
          permütasyon: 32760

          Birinci sayıyı giriniz: 5
          Ikinci sayıyı giriniz: 3
          Kombinasyon: 10
          permütasyon: 60
        */

        Scanner scan=new Scanner(System.in);
        System.out.println("n değeri...");
        long n=scan.nextLong();

        System.out.println(" r değeri...");
        long r=scan.nextLong();

        System.out.println(kombinasyon(n, r));
        System.out.println(permütasyon(n, r));

    }
    public static long faktöriyel (long sayı)  {
        long faktSonuc=1;
        for (int i=1; i<=sayı; i++){
            faktSonuc*=i;
        }

        return faktSonuc;
    }

    private static long kombinasyon(long n, long r) {
        if (n>0&&r>0&&n>=r){
            return faktöriyel(n)/(faktöriyel(n-r)*faktöriyel(r));
        } else return 0;
    }

    private static long permütasyon(long n, long r) {
        if (n>0&&r>0&&n>=r){
            return faktöriyel(n)/faktöriyel(n-r);
        } else return 0;

    }
}
