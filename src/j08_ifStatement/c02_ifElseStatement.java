package j08_ifStatement;

import java.util.Scanner;

public class c02_ifElseStatement {
    public static void main(String[] args) {
        /*
        Grilien yaşın 18'den büyük olduğunu gösteren kod create edin.
         */
       //Scanner scan=new Scanner(System.in);
       //System.out.println("Yaşınızı giriniz :");
       //int yas=scan.nextInt();
       // if (yas>18) {
        //    System.out.println("Yaşınız 18'den küçük değil : ");
        /*
        Yaşın 18'den büyüklüğünü kontrol edin. 18'den küçükse "ehliyet alamazsın" yazısını creat ediniz.
         */

    Scanner scan = new Scanner(System.in);
    System.out.println("Lütfen yaşınzı giriniz : ");
    int yas = scan.nextInt();
    if (yas>=18){
        System.out.println("18 yasindan buyuksünüz");
    }
    else System.out.println("18 yasindan kücüksünüz, ehliyet alamazsiniz");

    }
}



