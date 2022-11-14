package j16_ArrayList;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C02_nCopies {
    public static void main(String[] args) {
        ArrayList<String> listUlke=new ArrayList<>(List.of("Alamanya", "Amerigonya", "İngiltere", "İsveç"));
        ArrayList<String> listSehir=new ArrayList<>(List.of("Münih", "LosAngeles", "Londra", "Stockholm"));


        //nCopies(int, obj);-> int elemanlı bir
        ArrayList<String> yeniList=new ArrayList<>(Collections.nCopies(7,"javaCAN"));
        System.out.println("yeniList = " + yeniList);

        //addAll();-> Liste diğer listi olduğu gibi ekler
        listUlke.addAll(listSehir);
        System.out.println("listUlke = " + listUlke);

        listSehir.addAll(3,listUlke);//3. indexten itibaren ülke listi şehir listine ekledi

        System.out.println("listsehir"+ listSehir);//

        //task-> 1'den 10'a kadar sayıları bir liste atayıp print eden code create ediniz.
        ArrayList<Integer> list=new ArrayList<>();
        for (int i=0; i<10; i++){
            list.add(i);
        }
        System.out.println("list = " + list);//[1, 2 ,.............10]

    }
}
