package j34_Iterators;

import java.util.*;

public class C01_Iterators {
    public static void main(String[] args) {
        List<String> l1 = new ArrayList<>(Arrays.asList("Nur", "Gamze", "Erol", "Bekir"));
        System.out.println("l1 list ilk hali: " + l1);

        //l1 eleanları for loop ile print ediniz..
        for (int i = 0; i < l1.size(); i++) {
            System.out.print(l1.get(i) + " ");
        }
        System.out.println("     **************    ");
        //l1 elemanları for each loop ile print ediniz.
        for (String w : l1) {
            System.out.println(w + " ");
        }
        System.out.println();
        System.out.println(" ********** ");

        //l1 elemanları for loop ile :) update edip, print ediniz.
        for (int i = 0; i < l1.size(); i++) {
            l1.set(i, l1.get(i) + ":) ");
        }
        System.out.println(l1);
        System.out.println("     **************    ");

        //l1 elemanları for each loop ile :) update edip, print ediniz
        for (String w : l1) {
            w += " :(";
        }
        System.out.println("update sonrası l1 = " + l1);//update sonrası l1 = [Nur:) , Gamze:) , Erol:) , Bekir:) ]
        /*
        index desteklemeyen yapılarda tekrarlayan aksiyon için for each loop update yapamayabilir.
        Bu durumda java iterator interface'den tanımlanacak variable ile tekrarlayan aksiyonlar idex olmadan yapılır.
         */

        System.out.println();
        System.out.println(" ******Iterators******* ");
        Iterator<String> it1 = l1.iterator();//interator interfaceden it1 variable tanımlandı.
        //Atama olarak l1 elemanları atandı
        while (it1.hasNext()) {//has.Next()-> it1 elemanları için pointer olduğu yerde eleman varsa true, yoksa false
            // verir ve pointe bir sonraki eleman önüne koyulur.
            it1.next();//next()-> listin pointer önündeki elemanını return eder.
        }
        List<String> l2 = new ArrayList<>(Arrays.asList("Emine", "Mehmet", "Elif", "Turna"));
        //l2 elemanlarını iterator ile silip print ediniz.. l2=[]
        System.out.println("iterator öncesi l2" + l2);//
        Iterator<String> it2 = l2.iterator();
        while (it2.hasNext()) {
            it2.next();//tekrardaki pointer önündeki elemanı return eder
            it2.remove();//next() ile gelen elemanı siler
        }
        System.out.println("iterator remove sonrası l2" + l2);
        List<String> l3 = new ArrayList<>(Arrays.asList("Emine", "Mehmet", "Elif", "Turna"));
        //l3 elemanlarını iterator ile set edip print ediniz->

        System.out.println("update öncesi" + l3);
        ListIterator<String> it3 = l3.listIterator();
        while (it3.hasNext()) {
            it3.set(it3.next().toLowerCase() + " :)");//tekrardaki next() ile elemanı :) concat ederek update edildi
        }
        System.out.println("update sonrası" + l3);

        List<String> l4=new ArrayList<> (Arrays.asList("Emine","Mehmet","Elif","Leyla"));
        System.out.println("listiterator öncesi l3"+l3);
        //l3 elemanlarını ilk harfi büyük kln 3 harfi *** karakteri ve l4 listi ekleyip print ediniz.
        ListIterator<String>it4=l3.listIterator();//tekrar iterator yapısı tanımlandı
        while(it4.hasNext()){
            it4.set(it4.next().toUpperCase().charAt(0)+"*****");//next()iilen l4 elemanlı ilk harf byk kalan 3 harf***
            // ile set edildi
            it4.add(l4.toString());//tekrardaki updateedilen l3'e l4 add edildi.
        }System.out.println(" Listiterator set ve add sonrası l3 :"+l3);//Baran, Gülsüm, Akif, Nazım

    }
    }

