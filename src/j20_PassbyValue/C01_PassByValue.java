package j20_PassbyValue;

public class C01_PassByValue {
    public static void main(String[] args) {
        /*
        Java Pass By Value bir programlama dilidir.
        Bir primitive variable argument olarak bir methoda call edildiğinde variable değil bir copy clone (vesikalık) (pointer)
        değeri gönderilir.
         */
        //-< verilen fiyat için %24 artırılmış fiyatı print eden method create ediniz.

        double fiyat=100;// primitive double type variable
        System.out.println("method call öncesi fiyat değeri ="+fiyat);//1100
        fiyatArttır(fiyat);//fiyat variable methoda paramatre call edildi.
        System.out.println("method call sonrası fiyat "+ fiyat);
    }//main sonu
    public static void fiyatArttır(double bisey) {
        bisey*=1.24;
        System.out.println("arttırılmış fiyat"+bisey);

    }
}
