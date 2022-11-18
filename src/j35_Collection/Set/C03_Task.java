package j35_Collection.Set;

import java.util.HashSet;
import java.util.TreeSet;

public class C03_Task {
    public static void main(String[] args) {
        //interview question : Girilen String datanın karakterlerini alfabetik print ediniz-> TreeSet'e atanır
        //hashSet ve treeSet tanımlayıp run üsrelerini karşılaştırınız.
        //Trick: Run süresi için System.currenTimeMillis() meth call ediniz...
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
        System.out.println("ts run süresi :"+(hsBitir-hsBasla));
    }
}
