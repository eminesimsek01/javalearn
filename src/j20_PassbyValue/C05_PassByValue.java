package j20_PassbyValue;

public class C05_PassByValue {
    static double etiketFiyatı;//güneş
    static double indirimOranı;//güneş
    public static void main(String[] args) {
         /*
        eger bir method2Da yapılan değişiklik kalıcı olsun istenirse
        2. değişklik->  yapılan variable'lar atama tanımlanır.
         */
        double etiketFiyatı = 100;//primitive
        double indirimOranı=0.1;//primitive
        System.out.println("indirim ncesi etiket fiyatı"+etiketFiyatı);
        etiketFiyatı=indirim(etiketFiyatı,indirimOranı);//atama yapıldı
        System.out.println("indirim sonrası etiket fiyatı "+etiketFiyatı);
    }//main sonu

    public static double indirim (double fiyat,double oran){
        fiyat*=(1-oran);
        System.out.println("indirimli fiyat  :"+fiyat);
        return fiyat*=(1-oran);
    }
}
