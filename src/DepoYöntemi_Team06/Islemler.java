package DepoYöntemi_Team06;
import java.util.Scanner;

public class Islemler {
    static Scanner scan=new Scanner(System.in);


    public static void islem() {
        System.out.println("\\n1-Ürün tanımlama\\n2-Ürün listele\\n3-ürün girişi\\4-ürünü güncelleme\\n5-çıkış");
        int option=scan.nextInt();
        switch(option) {
            case(1) :{
                UrunTanımlama();
                islem();
            }
            case(2):{
                UrunListele();
                islem();
            }
            case(3):{
                UrunGirisi();
                islem();
            }
            case(4):{
                UrunGuncelleme();
                islem();
            }
            case(5):{
                Cıkıs();
                islem();
            }
        }
    }

    private static void Cıkıs() {
    }

    private static void UrunGuncelleme() {
    }

    private static void UrunGirisi() {
    }

    private static void UrunListele() {
    }

    private static void UrunTanımlama() {
    }

    public static int tryCatch(){



        int a;
        while (true){
            try {
                a= scan.nextInt();break;
            } catch (Exception e) {
                System.out.println("Lütfen rakamsal değer giriniz");
                scan.nextLine();
            }
        }

        return a;
    }
}
