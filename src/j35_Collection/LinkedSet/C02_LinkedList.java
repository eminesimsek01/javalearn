package j35_Collection.LinkedSet;

import java.util.LinkedList;

public class C02_LinkedList {
    public static void main(String[] args) {
        LinkedList<Object> list=new LinkedList<>();//DatatypeObject(Haz. Adem)->ne olursan ol gel
        //Bad practice app. çok yavaşlar tavsiye edilmez :cısss...
        list.add("Nazım");
        list.add('$');
        list.add(1453);
        System.out.println("list ="+list);//[Nazım, $, 1453]

    }
}
