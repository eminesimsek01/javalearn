package j10_Concatenation;

public class c02_Length
{
    public static void main(String[] args) {
        /*
        Length metodu() girilen stringin uzunluğunu: içinde bulunan karakter sayısını return eder. Bütün
        karakterleri (boşluk vs.) sayıp adedini verir.
         */
      String str="madem geldin dünyaya otur çalış javaya";
        str.length();//int type data verir.
        int strKrtrSayisi=str.length();
        System.out.println(str);
        System.out.println(strKrtrSayisi);//38
        System.out.println(str.length());//38

        String str1="";
        System.out.println(str1.length());//0 Hiçlik

        String str2=" ";
        System.out.println(str2.length());//1 otoparkta 1 tane araba var

        String str3=null;
        //System.out.println(str3.length());//NullPointerException hatası verir yani run time error hatası verir.


        //str3.concat(str1);//CTE verir.
        //Null'ın bir değeri yoktur.
        //TRICK->
        /*
        Null case sensitivedir yani Null veya NULL yazılmaz. Null bir değer değildir (dutluk) sadece hiçliği
        gösteren bir pointor'dır. (Giriş işaretçi)
         */







    }
}
