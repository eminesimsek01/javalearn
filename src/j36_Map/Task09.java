package j36_Map;

import java.util.HashMap;
import java.util.Map;

public class Task09 {

    /*
     Task-> aşağıdaki çıktıyı print eden code create ediniz.
     Kiraz 100
     İncir 200
     Enginar 150
     Üzüm 145
     Nar 250
     */

    public static void main(String[] args) {
        HashMap<String, Integer>manavmap=new HashMap<>();
        manavmap.put("Kiraz",100);
        manavmap.put("İncir",200);
        manavmap.put("Enginar",150);
        manavmap.put("Üzüm",145);
        manavmap.put("Nar",250);

        for (Map.Entry w:manavmap.entrySet()){
            System.out.print(w+ " ");
        }
    }
}
