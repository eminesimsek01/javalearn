package j16_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C10_Sort_reverse {
    public static void main(String[] args) {
        //Collections.sort(); Verilen listi naturel olarak sıralar.
        //Collections.reverse(List);-> verilen listin ters sıralamsını return eder.
        ArrayList<String> listSehir=new ArrayList<>(List.of("Münih", "LosAngeles", "Londra", "Stockholm"));
        System.out.println("listSehir = " + listSehir);
        Collections.sort(listSehir);//sort metodu sout içinde çalışmaz
        System.out.println("listSehir = " + listSehir);
        Collections.reverse(listSehir);
        System.out.println("listSehir = " + listSehir);//ters sıra sonrası ->
    }
}
