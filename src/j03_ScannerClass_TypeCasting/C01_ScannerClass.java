package j03_ScannerClass_TypeCasting;

import java.util.Scanner;

public class C01_ScannerClass {
    public static void main(String[] args) {
        //kullanıcıdan veri almak için 3 adım takip edilir.
        //1. adım-> Scanner Class'tan obje üretilir.

        Scanner scan=new Scanner(System.in);//Scanner classından scan isminde değerini Sistem içerisinden alan bir obje
                                            // oluştur.

        //2.adım->Kullanıcıdan istenilen veri için bildirimde bulunulur->sout("....");
        System.out.print("Adınızı giriniz:");

        //3.adım->Kullanıcının girdiği veri data tipine göre bir variable'a atanır.
        String isim=scan.nextLine();//Kullanıcıdan gelen string tipinde isim verisi scan objesini next line
                                    // metdouyla atandı.

        System.out.println("isim = " + isim);

        //Task->Kullanıcıdan firdiği değere göre karenin çevresini ve alanını bulan bir code create ediniz.

        Scanner input = new Scanner(System.in);
        System.out.println("Karenin bir kenarını giriniz");
        int kenar= scan.nextInt();
        System.out.println("alan :"+(kenar*kenar)+" çevre :"+(kenar*4));

        /*
        Kullanıcının bir günde içtiği çay ve kullandığı şeker sayısına göre bir yılda kaç kg şeker kullandığını hesapla-
        yan bir kod create ediniz...
        1 şeker;1.7 gr
        Örnek: Input: Çay sayısı: 10 şeker sayısı:2
        Output: Yılda 12.41 kg şeker kullanıyorsunuz
         */

        System.out.println("Günlük içtiğiniz çay sayısını giriniz :");
        int caySayisi=scan.nextInt();
        System.out.println("Her bardak için ihtiyaç duyduğunuz şeker sayısını giriniz");
        int sekerSayisi= scan.nextInt();
        System.out.println("Kullanılan şeker miktarı = "+(caySayisi*sekerSayisi*1.7*365)+" kilogram");

        Scanner sc=new Scanner(System.in);
        System.out.println("İsminizi giriniz : ");
        //char ch= sc.nextLine().charAt(0);//Kullanıcıdan gelen string ifadenin 0. index, ilk karakterini alır.
        //System.out.println("ch = " + ch);
        String name=sc.nextLine();//Kullanıcının girdiği tüm satırı isime atar.
        String ad=sc.next();//Kullanıcının girdiği ilk ifadeyi ad'a atar.
        System.out.println("ad = " + ad);


    }
}
