import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {

        /* TASK :
         * Kullanicidan bir isim isteyiniz ve isim sadece 3 harfli olmalidir ternary
         * kullanarak harflerin unique(farkli) olup olmadigina bakiniz e.g: ala => 3
         * Test data: ali eme all
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir isim giriniz :");
        String isim = scan.next();

        int a=isim.length();
        System.out.println((a > 3 || a < 3 ? "Üç harfli bir isim giriniz lütfen":(isim.charAt(0) == isim.charAt(1) ||
                isim.charAt(0) == isim.charAt(2)||isim.charAt(1) == isim.charAt(2)? (isim.charAt(0)==isim.charAt(1)?"1. ve 2. harfler aynı":
        (isim.charAt(0)==isim.charAt(2)?"1.ve 3. harfler aynı":(isim.charAt(1)==isim.charAt(2)?"2. ve 3. harfler aynı":"ismin harfleri aynı değil"))):
        "ismin harfleri aynı değil")));
    }
}