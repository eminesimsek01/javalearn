package j10_Concatenation;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        /*
        Girilen string içindeki istenen indexteki kakrkateri print eden code create ediniz
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("String giriniz: ");
        String kelime =scan.nextLine();
        System.out.println("Karakter nosu giriniz: ");
        int b=scan.nextInt();
        if (b>kelime.length()-1) {
            System.out.println("Böyle bir index yok");
        } else
               System.out.println(kelime.charAt(b));
       // System.out.println(kelime.substring(b, b + 1));


    }
}
