package j09_SwitchStatetment;

import java.util.Scanner;

public class c01_SwitchStatement {
    public static void main(String[] args) {
                /*
          Switch Case deyimi islev bakimindan if deyimine çok benzemektedir.
          Çok sayida if islem bloklari kullandigimizda programin okunurlugu azalacak ve
          programi izlemek zorlasacaktir. Programimizin bir degerini bir çok degerle
          karsilastirmak gerektiginde switch komutunu kullanacagiz. Switch seçenegi
          ile degiskenin durumuna göre bir çok durum içersinden bir tanesi gerçeklestirilir.
          Istersek de if deyimi ile switch case'' yi birlikte kullanabiliriz.
          Switch in yaptigi is kisaca, ifadenin degerini sirayla sabitlerle karsilastirarak ve her satiri islemektir.
          çok sayıda koşul içeren durumlarda switch kullanmak if'e göre programınızın daha hızlı çalışmasını sağlıyor.
          Bunun haricinde iki koşul ifadesi arasında dikkate değer bir performans farklılığı bulunmuyor.

          ahan da TRICK-> Switch Statement'de long,double,float ve boolean asla KULLANILMAZZZ.. CISSS
                */

        //TASK-> Kullanıcının girdiği rakamı yazı ile print eden kod create ediniz.
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir rakam giriniz ");
        int rakam=scan.nextInt();
        switch(rakam) {
            case 0:
                System.out.println("Sıfır");
                break;
            case 1:
                System.out.println("Bir ");
            break;
            case 2:
                System.out.println("İki");
                break;
            case 3:
                System.out.println("Üç");
                break;
            case 4:
                System.out.println("Dört");
                break;
            case 5:
                System.out.println("Beş");
                break;
            case 6:
                System.out.println("Altı");
                break;
            case 7:
                System.out.println("Yedi");
                break;
            case 8:
                System.out.println("Sekiz");
                break;
            case 9:
                System.out.println("Dokuz");
                break;
            default:
                System.out.println("Rakam girmediniz. Rakam giriniz lütfen.");
                break;


            //if (rakam == 0) {
            //    System.out.println("sıfır");
            //} else if (rakam == 1) {
            //    System.out.println("bir");
            //} else if (rakam == 2) {
            //    System.out.println("iki");
            //} else if (rakam == 3) {
            //    System.out.println("üç");
            //} else if (rakam == 4) {
            //    System.out.println("dört");
            //} else if (rakam == 5) {
            //    System.out.println("beş");
            //} else if (rakam == 6) {
            //    System.out.println("altı");
            //} else if (rakam == 7) {
            //    System.out.println("yedi");
            //} else if (rakam == 8) {
            //    System.out.println("sekiz");
            //} else if (rakam == 9) {
            //    System.out.println("dokuz");
            //} else
            //    System.out.println("hatalı");
            //

        }








    }
}
