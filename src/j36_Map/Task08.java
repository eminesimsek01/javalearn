package j36_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task08 {
    /*
    ismi update() olan bir method oluşturun.
    Parametreleri Integer -String HashMap,  int ve String olmalı. (3ayrı parametre)
    return tipi  Integer - String HashMap
    Eğer HashMap, int olan parametreyi içeriyorsa,
    int değerinde var olan String'i güncelleyin.
    Örnek :
     Hash map:
    1, "New jersey"
    2, "New York"
    3, "London"
    4, "Paris"

    int = 3
    String = Miami
    cevap aşağıdaki gibi olmalı:
    1, "New jersey"
    2, "New York"
    3, "Miami"
    4, "Paris"
     */

    public static void main(String[] args) {
        Map<Integer, String> mapci=new HashMap<>();

        mapci.put(1,"New jersey");
        mapci.put(2,"New York");
        mapci.put(3,"Miami");
        mapci.put(4,"Paris");
        mapci.put(5,"Bursa");
        Scanner scan=new Scanner (System.in);
        System.out.println("Bir sayı giriniz, değerini değiştirelim...");
        int secim=scan.nextInt();
        System.out.println("Neyle değiştirelim, söylen bare..");
        String onerılnesehır=scan.nextLine();
        update(mapci, secim, onerılnesehır);

    }//main sonu

    private static HashMap<Integer, String> update(Map<Integer, String> mapci, int secim, String onerılnesehır) {
        if (mapci.containsKey(secim)) {
            mapci.put(secim, onerılnesehır);
        }


        return (HashMap<Integer, String>) mapci;
    }


}
