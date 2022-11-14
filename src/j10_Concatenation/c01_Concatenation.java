package j10_Concatenation;

public class c01_Concatenation {
    public static void main(String[] args) {
        /** concat () metodu içine aldığı string variable'ı çalıştığı stringin sonuna ekler.
         * java'da + işlemi yapılırken eğer en az bir string variable varsa java toplama değil concat yapar.
         */

        String name="Melek";
        String meslek="  Qa tester";
        name.concat(meslek);
        System.out.println(name.concat(meslek));//Nur Qa tester
        System.out.println(name);//Nur
        //ahan da TRICK -> String methodları variable'da geçici değişiklik yapar.
        //ama değişkene atama yapılırsa kalıcı olarak değişir.
        name=meslek.concat(name);
        System.out.println(name);

        System.out.println( name.concat(true + " :) "));// Qa tester  Nurtrue :)
        System.out.println( name.concat(100+ " :) "));// Qa tester  Nur 100 :)

        // TRICK-> concat methodu parametre olarak string type harici tüm dataları srtinge cevirip concat eder












    }
}
