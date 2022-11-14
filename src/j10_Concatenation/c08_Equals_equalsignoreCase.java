package j10_Concatenation;

public class c08_Equals_equalsignoreCase {
    public static void main(String[] args) {
        /* equals()
         * 2 String metnin birbirine esit olup olmadigina bakar. büyük küçük harf farkı vardır. Sonuc boolean dir.
         *
         * equalsIgnorecase()
         * equals() ile ayni islevi gorur, tek farki buyuk kucuk harfe duyarliligi yoktur. Sonuc boolean dir.
         */
        /**
         * str.toLowerCase() verilen String'in tamamini kucuk harfe cevirir
         * str.toUpperCase() verilen String'in tamamini buyuk harfe cevirir
         */

        String str1="Merhaba";
        String str2="merHaba";
        System.out.println(str1.equals(str2));//False
        System.out.println(str2.equals(str1));//False
        System.out.println(str1.equalsIgnoreCase(str2));//true
        System.out.println(str2.equalsIgnoreCase(str1));//true

        String s1="songül hanım";//String pool-> gömlek cebi-> kolay çıkan para
        String s2="songül hanım";//String pool-> gömlek cebi-> kolay çıkan para
        String s3=new String("songul hanım");//obj non primitive -> heap memory
        String s4=new String("songül hanım");//obj non primitive -> heap memory

        System.out.println(s1==s2);//true
        System.out.println(s1.equals(s2));//true
        System.out.println(s3==s4);//false
        System.out.println(s3.equals(s4));//true











    }




}
