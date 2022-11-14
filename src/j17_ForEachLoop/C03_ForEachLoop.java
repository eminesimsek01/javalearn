package j17_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C03_ForEachLoop {
    public static void main(String[] args) {
        //Task is coming..
        //İki string array elemanlarının ortak olmasını kontrol eden code create ediniz.
        //for each ile
        String array1[]={"Enise", "Emine", "Mehmet", "Nazım"};
        String array2[]={"Zeynep", "Emine", "Mehmet", "Semra"};
        List<String> ortakisim=new ArrayList<>();//ortak isimlerin atanacağı boş list
        for (String i:array1) {
            for(String j:array2){
                if (i.equalsIgnoreCase(j)){//hER BİR ÇEKİRDEK EŞİTLİĞİ KONTROL
                    ortakisim.add(i);
                }
            }
        }
        System.out.println("ortakisim.add(i) = " + ortakisim);//System.out.println(i);


    }
}

