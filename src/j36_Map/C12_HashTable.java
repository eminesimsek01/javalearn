package j36_Map;

import java.util.Hashtable;

public class C12_HashTable {
    public static void main(String[] args) {
        /*
        HashTable->
        HashMap'te kullanılan tüm methodlar hashTable obj ile call edilir.
        1-HashMap ve TreeMap threadsafe ve synchronized olmadığı için Map'ler arasında thread-safe ve synchronized olan
        bir map'e ihtiyaç olduğundan Hashtable tanımlanmıştır.
        2-HashTable HashMap'e göre daha yavaştır.
        3-HashTable key ve value'larda null değere izin vermez.
        4-HashTable eleman yapılırken HashMap random (rastgele: hurra) yapar.
         */
        Hashtable<String, String> ht=new Hashtable<>();
        ht.put("kebap","adana");
        ht.put("döner","sivas");
        ht.put("köfte","tekirdağ");
        ht.put("çorba","beyran");
        ht.put("söğüş","");
        System.out.println("ht = " + ht);//ht = {köfte=tekirdağ, söğüş=, çorba=beyran, döner=sivas, kebap=adana}
        ht.put("döner","dönerse senindir");//döner key update edilir key'de dublicate değil üzerine value ataması yapılır.
        System.out.println("ht = " + ht);//ht = {köfte=tekirdağ, söğüş=, çorba=beyran, döner=dönerse senindir, kebap=adana}
        //ht.put("kahve",null);//RTE -> NullPointerException
        //ht.put(null,"trileçe"); -> NullPointerException
        System.out.println("agam selametle dewamkee....");

        Hashtable<String, String>ht1=new Hashtable<>();
        ht1.put("salata","patlıcan közleme");
        ht1.put("ara sıcak","içli köfte");
        System.out.println(ht1);

        ht.putAll(ht);
        System.out.println("ht = " + ht);//{köfte=tekirdağ, salata=patlıcan közleme, söğüş=, çorba=beyran, döner=dönerse senindir :) , ara sıcak=içli küfte, kebab=adana}
        System.out.println("ht1 = " + ht1);
    }
}
