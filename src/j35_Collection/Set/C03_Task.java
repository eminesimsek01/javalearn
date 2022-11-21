package j35_Collection.Set;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class C03_Task {
    public static void main(String[] args) {
        //interview question : Girilen String datanın karakterlerini alfabetik print ediniz-> TreeSet'e atanır
        /*
        Sorunun Çözümü:
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir string giriniz pls:");
        String str=scan.nextLine();
        String arr []=str.split("");
        TreeSet<String>ts1=new TreeSet<>(List.of(arr));
        System.out.println("ts = " + ts1);
        /*
         ******************* Task ********************
        //hashSet ve treeSet tanımlayıp run sürelerini karşılaştırınız.
        //Trick: Run süresi için System.currenTimeMillis() meth call ediniz...

         */
        long tsBasla=System.currentTimeMillis();
        TreeSet<String>ts=new TreeSet<>();
        ts.add("Salim");
        ts.add("Koray");
        ts.add("Selin");
        ts.add("Elif Turna");
        long tsBitir=System.currentTimeMillis();
        System.out.println("ts run süresi :"+(tsBitir-tsBasla));

        long hsBasla=System.currentTimeMillis();
        HashSet<String>hs=new HashSet<>();
        hs.add("ebik");
        hs.add("gabık");
        hs.add("kem");
        hs.add("küm");
        long hsBitir=System.currentTimeMillis();
        System.out.println("hs run süresi :"+(hsBitir-hsBasla));
    }
}
