package j34_Iterators;

import java.util.*;

public class C02_Previous {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>(Arrays.asList(24,38,65,9,11,7,27,23));
        System.out.println("l1 list ilk hali :"+list);
        //l1 elemanlarını tersten print ediniz
        System.out.println("listin ilk hali"+list);
        /*
        Tekrarda son elemandan başlayan işlmeler için pointer en sona götürülmeli
        Bunun için pointer'ı sona götüren has.next() method çalışmalı
         */
        ListIterator<Integer>it1=list.listIterator();
        while(it1.hasNext()){//b->s pointer sürekli sona doğru ilerler
            it1.hasNext();
        }
        while(it1.hasPrevious()){//s->b pointer sürekli başa doğru ilerler
            System.out.println(it1.previous()+" ");//23 27 7 11 9 65 38 24
        }
        //System.out.println("listin tersten hali"+list);
        List<String>l2=new ArrayList<>(Arrays.asList("cağla","uğur","muharrem","cebrail"));
        //l2 elemanlarının sonuncusunu ekleyiniz
        System.out.println("listiterator öncesi l2 :"+l2);
        ListIterator<String>it2=l2.listIterator();//l2 elemanlarını tekrarlayan listiterator
    }
}
