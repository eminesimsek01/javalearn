package j12_Loops.Tasks;

import java.util.Scanner;

public class Task02_Polindrome {
    public static void main(String[] args) {
        /*
        Girilen ifadenin polindrome olmasını kontrol eden bir method create ediniz.
        Polindrome her iki yönde okunduğunda eşit olan ifadeler
        ey edip adanada pide ye
         */

        Scanner sc=new Scanner(System.in);
        System.out.println("Bir metin giriniz : ");
        String str=sc.nextLine();

        polindrome (str);

    }//main dışı

    private static void polindrome(String str) {
        String tersStr="";//boş bir String kutu
        for (int i=str.length()-1; i>=0; i--){
            tersStr+=str.charAt(i);//str'nin i.'ci karakterini ter str'ye ekler. (concat)
        }
        System.out.println(" girilen ifadenin tersi :"+tersStr);
        if (str.equalsIgnoreCase(tersStr)) {//str ile ters eşitlik str kontrolü
            System.out.println("girilen ifade polindrome ");
        } else System.out.println(" girilen ifade polindrome değil ");
    }
}
