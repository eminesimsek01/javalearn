package j36_Map;

import java.util.HashMap;
import java.util.Map;

public class Task01 {
    public static void main(String[] args) {

      // task -> urun fiyatları toplamını hesaplayan code create ediniz..
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Amazon", 296);
        map.put("Ebay", 301);
        map.put("Saturn", 326);
        map.put("MediaMarkt", 340);
        map.put("Apple Store", 320);

        int toplam=0;
        for (Map.Entry<String, Integer>w: map.entrySet()){//w'da map'in her şeyi var
            toplam+=w.getValue();
        }
        for (Integer w: map.values()){//["Amazon"=296
            toplam+=w;
        }
        System.out.println(toplam);
    }
}
