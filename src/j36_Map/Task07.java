package j36_Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task07 {

    /*
    returnKey() isminde bir method oluşturun.
    Parametresi     String-Integer HashMap olsun.
    Return tipi Array List olsun.
    Hashmap:
                       "Lion",     1
                       "Tiger",    2
                       "Elephant", 3
                       "Cat",      4
                       "Dog",      5
    Tüm ANAHTARLARI(Keys) for döngüsü ile döndürün.
     */

    public static void main(String[] args) {
    Map<String, Integer> mymap=new HashMap<>();
    mymap.put("Lion",1);
    mymap.put("Tiger",2);
    mymap.put("Elephant",3);
    mymap.put("Cat",4);
    mymap.put("Dog",5);
        System.out.println(returnKey(mymap));
        ;    }

    private static ArrayList returnKey(Map<String, Integer> mymap) {
        List<Integer> mylist = new ArrayList<>();
        for (int w :mymap.values()){
          mylist.add(w);
        }

        return (ArrayList) mylist;
    }
}

