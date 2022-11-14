package AutomatiomMac;


import java.util.Scanner;

public class Main<urun> {
            Urun urun = new Urun();
            /*
        Urun urun = new Urun();

        1) Kullanıcı ürünleri göstermeliyiz. ----> Urun clasın da bir obj. toString()
        2) Scanner --> Scanner clasından bir obj create ediniz.
        3) Loop --> Do-While Loop --> kullanıcı 1-7 rakamları arasında bir seçim yapmalı ve eğer girmiş olduğu rakam
        1 den küçük ve ya 7 den büyük ise döngü devam etmeli ve kullanıcı 1-7 arasında bir seçim yapmaya force edilmeli.
        4) 0 a basarak ta menuden cıkabilmeli. --> Yine Bekleriz... Yazısını konsola yazdıralım....
        5) Kullanıcıdan productNum (1-7 arasında rakam {Kullanıcı 1 rakamı seçerse, Kraker, 2 rakamını seçerse cips etc.... }) --> switch-case yapısı kurmalıyım...
        6) switch benden ProductNum ve alınan bu productNum a göre ilgili ürünün price ı alınmalı. urun.getKraker(), urun.getCips(), urun.getCay(), getCocaCola() etc....
        (price set edebilmek için ben price ın setPrice() metodunu kullanmalıyım...)
        7) return olarak bana price dönmeli. return getPrice() (double)

         */
            public static void main(String[] args) {

            }
    public double select(Urun urun){
                Scanner scan=new Scanner(System.in);
        System.out.println(urun.toString());
        System.out.println("Ürün numarasına göre seçiniz: ");
        int urunNu=scan.nextInt();
        return 0;
    }
}




