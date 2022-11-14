package j10_Concatenation;

import java.util.Locale;
import java.util.Scanner;

public class c07_index0f_lastindex0f {
    public static void main(String[] args) {
        String str="Good of scholl";
        System.out.println("ilk görülen O'nun index nosu "+str.indexOf('o'));//1
        System.out.println("d'nin yeri index nosu : "+str.indexOf("d"));//3
        System.out.println("D'nun yeri index nosu : "+str.indexOf("D"));//-1 -> D karakteri olmadığı için
        //Ahan da TRICK: Olmayan karakter indexi sorgulanırsa -1 return eder.
        System.out.println(" od nun yeri index nosu :"+str.indexOf("0d"));

        String isim="emine sarıkaya simsek";
        System.out.println(isim.indexOf('a'));
        System.out.println(isim.lastIndexOf('a'));
        System.out.println(isim.indexOf("arı"));
        System.out.println(isim.lastIndexOf("arı"));

        /*
        Task: Girilen cümlenin aşağıdaki durumları sağlaması için code create ediniz.
        Girilen cümle java içermiyor
        Girilen cümle 1 tane java içeriyor
        Girilen durumda birden fazla java var
         */


        Scanner scan=new Scanner(System.in);
        System.out.println("Kafi miktar bir cümle giriniz : ");
        String cümle= scan.nextLine().toLowerCase();
        if (cümle.indexOf("java")==-1) {
            System.out.println("Girilen cümle java içermiyor");
        } else if (cümle.indexOf("java")==cümle.lastIndexOf("java")) {
            System.out.println("Girilen cümle 1 tane java içeriyor");
        } else System.out.println("girilen cümlede birden fazla java var ");





    }
}
