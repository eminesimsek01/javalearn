package j36_Map;

import java.util.HashMap;

public class C06_putAll {
    public static void main(String[] args) {
        HashMap<String, String> hm=new HashMap<>();
        //map.putAll(map1);->Girilen map istenen map'e ekler

        hm.put("Amazon","296 Euro");
        hm.put("Ebay","234 Euro");
        hm.put("Saturn","300 Euro");
        hm.put("Vatan","111 Euro");
        hm.put("Apple store","333 Euro");
        hm.put("Apple store","500 Euro");
        hm.put("MediaMarkt","183 Euro");
        System.out.println(hm);


        HashMap<String, String> hm2=new HashMap<>();


        hm2.put("köfteci yusuf","kaburga ızgara");
        hm2.put("starBucks","flat Whitee");
        hm2.put("güllüoğlu","Cennet Çamuru");
        hm2.put("Vatan","111 Euro");
        hm2.put("nusret","dana spagetti");
        hm2.put("Apple store","500 Euro");
        hm2.put("javacan","javanaz");

        hm2.putAll(hm2);
        System.out.println(hm2);
        System.out.println(hm);
        //cincix code...
        HashMap<String, String> hm3=new HashMap<>(hm2);

    }
}
