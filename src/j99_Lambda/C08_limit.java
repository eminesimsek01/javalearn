package j99_Lambda;

import java.util.*;
import java.util.stream.Stream;

public class C08_limit {
    public static void main(String[] args) {
        //limit(a) akısdan çıkan elemanları a parametresine göre ilk a kadar elemanı alır.
        List<String> menu=new ArrayList<String>(Arrays.asList("küşleme","küşleme","küşleme","trileçe","cacix","yağlama","güllaç"));
        System.out.println("\n *********");
        charSayısıEnBykElPrint(menu);
    }//main sonu
    //Task: Karakter sayısı en büyük elemanı yazdırınız.
    public static void charSayısıEnBykElPrint (List<String>menu){
        Stream<String> enbykKarkter=
        menu.stream().sorted(Comparator.comparing(String::length).reversed()).
                limit(1);//akısdaki ilk 1 eleman alındı
        // System.out.println(enBykKarktr);//java.util.stream.SliceOps$1@6e8dacdf->limit meth bir stream yaı akıs(birden çok eleman) return eder
        //dolaysıyle limit cıktısı doprudan sout ile print edilemez.limit çıktısı list veya array gibi bir coll. atanmalı
        System.out.println(Arrays.toString(enbykKarkter.toArray()));//java.util.stream.SliceOps$1@6e8dacdf
        Object[] enbykKarakter=menu.stream().
                sorted(Comparator.comparing(String::length).reversed()).
                limit(1).//akıştaki ilk 1 eleman atandı
                toArray();//akıştaki elemanlar array'e atandı
        System.out.println(Arrays.toString(enbykKarakter));

        Optional<String> enBykKarktr2 = menu.
                stream().
                sorted(Comparator.comparing(String::length).reversed()).
                findFirst();//akısdaki ilk 1 eleman alındı
    }
}
