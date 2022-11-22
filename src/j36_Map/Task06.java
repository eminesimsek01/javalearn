package j36_Map;

import LaptopStore.Main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        /*
        map1() isminde bir method oluşturun.
        Parametresi   bir Integer -String map  ve bir int
        return tipi String
        Tamsayı değerlerini (int) döndürün.
        ÖRNEK:
        Map:
                        1 ,  "Lion"
                        2 ,  "Tiger"
                        3 ,  "Elephant"
                        4 ,  "Cat"
                        5  , "Dog"
        Integer 3
        Cevap Elephant olmalı.
         */
        Map<Integer, String> mp=new HashMap<>();
        mp.put(1,"Lion");
        mp.put(2,"Tiger");
        mp.put(3,"Elephant");
        mp.put(4,"Cat");
        mp.put(5,"Dog");

        Scanner sc=new Scanner(System.in);
        System.out.println("agam sayıgiresen :");
        int sayı=sc.nextInt();
        System.out.println(map1(mp, sayı));
    }

    private static String map1(Map<Integer, String> mp, int sayı) {
       //sayı: Int Hey değerine karşılık value get eder.
        return mp.get(sayı);
    }


}
