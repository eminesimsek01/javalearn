package j36_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task08 {
     /*
    ismi update() olan bir method oluşturun.
    Parametreleri , Integer -String HashMap,  int ve String olmalı. (3ayrı parametre)
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
         Scanner scan=new Scanner (System.in);
         System.out.println("Bir sayı giriniz :");
         int sayı=scan.nextInt();
         System.out.println("Agam sehir giresen :");
         String sehir=scan.next();
         Map<Integer, String> mp=new HashMap<>();
         mp.put(1,"New Jersey");
         mp.put(2,"New York");
         mp.put(3,"London");
         mp.put(4,"Paris");
         System.out.println(updatemethod(mp, sayı, sehir));

     }//main sonu

    private static Map<Integer, String> updatemethod(Map<Integer, String> mp, int sayı, String sehir) {
         if(mp.containsKey(sayı))
        mp.put(sayı,sehir);
        return mp;
    }
}
