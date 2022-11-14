package j04_AritmeticOperators;

public class C02_Increment_Decrement {
    public static void main(String[] args) {
        System.out.println("   ******Increment-> Artırma*****  ");
        int a=7;
        System.out.println(++a);//8 yazdırır a=8 Önce artırır sonra yazdırır.
        System.out.println(a++);// a^yı 8 yazdırır sonra artırır a=9 Önce yazdırır sonra artırır.
        System.out.println(a);// 9
        System.out.println(a++ + ++a);//20 Aritmetik işlem içinde artmış bir şekilde iletiliyor.

        // TASK ->
        int k = 5;
        int sonuc = ++k + k++ + k++ + --k + k-- + k;
        System.out.println("sonuc = " + sonuc);
        System.out.println("k = " + k);





    }

}
