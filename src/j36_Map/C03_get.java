package j36_Map;

import java.util.HashMap;

public class C03_get {
    public static void main(String[] args) {
        HashMap<String, String> hm=new HashMap<>();
        //map.get(key);->Girilen key değerinin value'sunu return eder.
        hm.put("Amazon","296 Euro");
        hm.put("Ebay","234 Euro");
        hm.put("Saturn","300 Euro");
        hm.put("Vatan","111 Euro");
        hm.put("Apple store","333 Euro");
        hm.put("Apple store","500 Euro");
        hm.put("MediaMarkt","183 Euro");
        System.out.println(hm);

        System.out.println("hm.get(\"Ebay\") = " + hm.get("Ebay"));//234 Euro
        System.out.println("hm.get(\"ebikgabık\") = " + hm.get("ebikgabık"));//hm.get("ebikgabık") = null//Olmayan key için null return eder
        System.out.println("hm.get(12) = " + hm.get(12));//null// key datatype farketmeksizin olmayan key null return eder
    }
}
