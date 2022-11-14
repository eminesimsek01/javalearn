package j21_ImmutableClass;

public class C02_ImmutableClass {
    public static void main(String[] args) {
        String str1="murat";//ilk değeri murat atanan str1 variable
        String str2="murat";//str1 ve str2 aynı ilk değere sahip olduğu için String havuzunda ortak ref alır.

        String str3=new String ("murat");//değerleri aynı referansları farklı obje
        String str4=new String ("murat");//değerleri farkl referansları aynı obje


        String str5=str1+""; //Concatenation

        System.out.println( str1 == str2);//T
        System.out.println( str1 == str3);//F
        System.out.println(  str1.equals(str2));//T
        System.out.println( str3 == str4);//F
        System.out.println(str1 == str5);//F
        System.out.println( str1.equals(str5));//T


    }
}
