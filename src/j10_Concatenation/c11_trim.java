package j10_Concatenation;

public class c11_trim {
    public static void main(String[] args) {
        // Integer.valueOf() rakamlarla olusturulan String'leri sayiya donusturur. Boylece rakamlarla olusturulan
        // Stringlerle matematiksel islemler yapabilmemizi saglar.

        //valueOf() hem Integer wrapper classinin icinde hem de String'in icinde var. Integer wrapper classinin icinde
        //olan valueOf() methdou String'i integer'a cevirir. String'in icindeki valueOf() methodu integer'i String'e cevirir.

        //task-> string type verilen iki adet bağış miktarını toplayan code create ediniz.
        String bagis1="1500";
        String bagis2="2500";
        int bagişDegeri1=Integer.valueOf(bagis1);//bagis1 string içindeki sayı değerlerini int'a çevirdi.
        int bagişDegeri2=Integer.valueOf(bagis2);//bagis2 string içindeki sayı değerini int'a çevirdi, bagisDegeri2'ye
        // atadı.
        System.out.println("toplam bağış miktarı : "+(bagişDegeri1+bagişDegeri2));//bagış değerleri toplanıp print edildi. 4000

        int fetih=Integer.valueOf("1453");
        System.out.println(fetih);//1453


        System.out.println("toplam bağış : "+(Integer.valueOf(bagis1)+(Integer.valueOf(bagis2))));

        int tc=1234567;
        String strTc=String.valueOf(tc);
        System.out.println("strTc = " + (strTc+tc));//

        String fiyat="$150";
        int yeniFiyat= Integer.valueOf(fiyat);
        System.out.println("yeni fiyat  "+yeniFiyat);


    }
}
