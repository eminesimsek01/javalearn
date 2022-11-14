package j01_CodeChallenge;

import java.util.Scanner;

public class c04_ÜçüncüSoru {
    public static void main(String[] args) {
        /*
         * Kulanicidan bir kelime isteyin eger kelime 3 ve daha fazla harfden olusuyorsa son
         * iki harfini 3 kere yan yana yazdirin. degil ise girilen kelimeyi yazdirin
         *
         * ornek
         * input = Ali
         * output = lilili
         *
         * input = el
         * output = el
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir kelime giriniz : ");
        String kelime = scan.nextLine();
        int a = kelime.length();
        if (a >= 3) {
            System.out.println(kelime + kelime.substring(kelime.length() - 2)+kelime.substring
                    (kelime.length() - 2)+kelime.substring(kelime.length() - 2));
        } else {
            System.out.println(kelime);
        }
    }
}
