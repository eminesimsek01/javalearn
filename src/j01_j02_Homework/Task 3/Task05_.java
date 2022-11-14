import java.util.Scanner;

public class Task05_ {

    /*
     * Girilen saati  saniyeye çeviren program yazınız
     * Örnek : 1 saat 10 dakika 50 saniye - > 4250 saniye
     * 1 saat = 3600 saniye
     * 1 dk   = 60 saniye
     *
     */

    public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
        System.out.println("Saat değerini saat, dakika ve saniye olarak giriniz : ");
        int saat=scan.nextInt();
        int dakika=scan.nextInt();
        int saniye=scan.nextInt();
        int saniyeT=saat*3600+dakika*60+saniye;
        System.out.println("Girdiğiniz saat saniye olarak = " + saniyeT);

    }

}
