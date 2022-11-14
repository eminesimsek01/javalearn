package j10_Concatenation;

import java.util.Scanner;

public class c03_CharAt {
    public static void main(String[] args) {
        /*
        charAt() methodu parametre int olarak girilen index'deki char değerini return eder.
        index değeri 0'dan başlar.
         */
       String sehir=" Istanbul";
       System.out.println(" sehir.cahrAt(5) = " +sehir.charAt(5));//sehir.charAt(5)=b
       char besinciindex= sehir.charAt(5);
       System.out.println(besinciindex);//n

        //son index karakteri --> length ()-1
        System.out.println(sehir.charAt(sehir.length()-1));//l

        //ilk index karakter-->charAt(0)
        System.out.println(sehir.charAt(0));//I

        //task-> Girilen kelimenin ortadaki karakterini girin.
        System.out.println("Kelime giriniz :");
        Scanner scan=new Scanner(System.in);
        String kelime=scan.nextLine();
        if (kelime.length()%2==0){
            System.out.println("kelimesinin orta karakteri yoktur ");
        } else if(kelime.length()%2!=0) {
            System.out.println(kelime.charAt((kelime.length()-1)/2));

        }






    }
}
