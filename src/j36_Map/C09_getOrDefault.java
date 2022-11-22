package j36_Map;

import java.util.HashMap;

public class C09_getOrDefault {
    public static void main(String[] args) {
        //map.C09_getOrDefault();->Girilen key map'de varsa key'e ait value yoksa default değer return eder.
        HashMap<String, String> hm=new HashMap<>();

        hm.put("Amazon","296 Euro");
        hm.put("Ebay","234 Euro");
        hm.put("Saturn","300 Euro");
        hm.put("Vatan","111 Euro");
        hm.put("Apple store","333 Euro");
        hm.put("Apple store","500 Euro");
        hm.put("MediaMarkt","183 Euro");
        System.out.println(hm);
        System.out.println("hm.C09_getOrDefault() = " + hm.getOrDefault("Ebay","ebikGabık"));//234 Euro
        //Ebay key map'de varolduğu için Ebay key'e ait value:234 Euro return edildi.
        hm.getOrDefault("ebik","gabık");//gabık
        //ebik key map'de olmadığı için bu key default değer gabık atanıp return edildi.
        System.out.println(hm);

    }
}
