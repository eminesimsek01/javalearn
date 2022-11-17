package j35_Collection;

import java.util.Arrays;
import java.util.LinkedList;

public class C01_LinkedList {

    public static void main(String[] args) {
        /*
       1. Linked listte elemanlar data ve adres olmak üzere iki kısımdan oluşur ve eleman yerine "node" olarak tanımlanır.
       2. LinkedListte ilk node data barındırmayansadece adres bulunduran head note olarak tanımlanmıştır.
       3. LinkedListte son node adres kısmı null olan sadece data bulundruan tail node olarak tanımlamıştır.
       4.ArrayList searching LinkedList node ekleme ve silmede daha avantajlıdır. LinkedList eleman bulmada
       index yapısı olmadığı için başarısızdır.
       5.LinkedList-> tren vagon ilişkisi bağlantısı gibi düşünülebilir.
       6.Collection obj tanımlanırken cons Class(LinkedList, ArrayList...) olmalı, Interface(List, Queueu...) olmamasına dikkat dilir.
       Ancak obj DtatType olarak parent interface tanımlanabilir.
       7.LinkedList class iki tane parent interface'den(List,Queue) implemen etmiştir.
         */
        LinkedList<String> ll1=new LinkedList<>(Arrays.asList("Ebubekir","Gülsüm","Adem","İlker","Merve"));//LinkedList->Declaration and Assignment
        //LinkedList Print
        System.out.println("ll1 ="+ll1);
        ll1.add("uğur");//ll1 =[Ebubekir, Gülsüm, Adem, İlker, Merve]
        System.out.println(ll1);
        ll1.add(2,"Abdülaziz");//[Ebubekir, Gülsüm, Adem, İlker, Merve, uğur]
        System.out.println(ll1);
        ll1.addFirst("JavaCan");
        System.out.println(ll1);//[JavaCan, Ebubekir, Gülsüm, Abdülaziz, Adem, İlker, Merve, uğur]
        ll1.addLast("JavaTar");
        System.out.println(ll1);//[JavaCan, Ebubekir, Gülsüm, Abdülaziz, Adem, İlker, Merve, uğur, JavaTar]

    }
}
