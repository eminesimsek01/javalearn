package j10_Concatenation;

public class c05_Start_EndWith {
    public static void main(String[] args) {
        /**
         * startsWith()
         *  Metnin bas kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
         *  String'in basladigi characteri dogrular
         * endsWith()
         * Metnin son kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
         */

            String sehir="Istanbul";
        System.out.println(sehir.startsWith("i"));//true
        System.out.println(sehir.startsWith("is"));//true
        System.out.println(sehir.startsWith("s"));//false
        System.out.println(sehir.startsWith("a",3));//true 3. indekstir
        //indeksi 3 olan harf a mıdır?

        System.out.println(sehir.endsWith("l"));//true
        System.out.println(sehir.endsWith("bul"));//true
        System.out.println(sehir.endsWith("bu"));//false

        String str="bul";
        System.out.println(sehir.endsWith(str));//true
        int yas=48;
        //System.out.println(sehir.endsWith(yas));//cte
        //task-> girilen email hesabı @gmail.com içerimiyorsa "lütfen gmail hesabı giriniz"
        //@gmail.com ile bitiyorsa "hesabınız onaylandı" aksi durumda " geçerli hesap giriniz" print eden code create
        //ediniz.




    }
}
