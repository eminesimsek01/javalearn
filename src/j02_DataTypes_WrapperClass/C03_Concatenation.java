package j02_DataTypes_WrapperClass;

public class C03_Concatenation {
    public static void main(String[] args) {
        String isim = "Emine";
        String soyad="Simsek";

        int a=7;
        int b=11;
        //Birden çok string variable ile farklı variabl'ler + ile işleme alınırsa java birleştirme yaparak yeni
        //bir string oluşturur.
        System.out.println(isim+soyad+a+b);// String mürekkep gibidir. Her şeyi boyar. Stringten sonra her şeyi
                                           // birleştirir. EmineSimsek711
        System.out.println(a+isim+soyad+b);// 7EmineSimsek11
        System.out.println(a+b+isim+soyad);//18EmineSimsek
        System.out.println(" "+isim+soyad+a);// EmineSimsek
        System.out.println(isim+soyad+(a+b));//EmineSimsek18 Parantez özel bir işlemdir. Java Özelden genele
                                             // uygular.
        System.out.println((a+b)+isim+soyad);//18EmineSimsek
        System.out.println(isim+(a-b)+(a-b));//Emine-4-4
        System.out.println(isim+((a-b)+(a-b)));//Emine-8
        char ch='1';
        /*
        char değeri kendinden önce geleni string yapmaz.
        char data türü işleme girdiği değişkenlerin türüne göre farklı işlem yapar.
        Eğer işleme girdiği değişken aritmetik bir işlemse ascii değeri ile işlem yapar.
         */
        /*
        TRICK :) Bir aritmetik işlem içinde String kullanılırsa, aritmetik işlem önceliğine göre
        işlem yapılıp String variable'a Concatenation yapılır.
        */
        System.out.println(isim+ch);//Emine1
        System.out.println(a+ch+isim);//56Emine
        System.out.println(isim+(ch+b));//Emine60
        System.out.println(a+isim+ch);//7Emine1














    }
}
