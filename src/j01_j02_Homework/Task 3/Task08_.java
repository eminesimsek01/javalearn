import java.util.Scanner;

public class Task08_ {
    /*
     * Saniyeyi saat, dk ve saniyeye çeviren bir program yazınız.
     * 		Örnek : 4250 - > 1 saat 10 dakika 50 saniye
     * 1 saat = 3600 saniye
     * 1 dk   = 60 saniye
     *
     */

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Dönüştürmek istediğiniz zamanı saniye cinsinden giriniz :");
        int saniye=scan.nextInt();
        int dakika=saniye/60;
        int saniyeK=saniye%60;
        int saat=dakika/60;
        int dakikaK=dakika%60;
        System.out.println("Girdiğiniz toplam saniye : "+saat+" saat, "+dakikaK+" dakika "+saniyeK+" saniyeye karşılık " +
                           "gelmektedir");




    }
}
