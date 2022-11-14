package j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C03_index0f {
    public static void main(String[] args) {
        //index0f();-> list içinde istenen elemanın index değerini return eder.
        ArrayList<String> listUlke=new ArrayList<>(List.of("Alamanya", "Amerigonya", "İngiltere", "İsveç"));
        ArrayList<String> listSehir=new ArrayList<>(List.of("Münih", "LosAngeles", "Londra", "Stockholm"));

        System.out.println(listSehir.indexOf("Londra"));//2
        System.out.println(listSehir.indexOf("Ankara"));//-1//Listte olmayan eleman indeksi -1 return eder.
        listUlke.add("Amerigonya");
        System.out.println("listUlke.indexOf(\"Amerigonya\") = " + listUlke.indexOf("Amerigonya"));//1, eğer
        // tekrarlı eleman varsa soldan bulunan ilk elemanın indeksini return eder.
        System.out.println(listUlke.lastIndexOf("Amerigonya"));//4 sondan ilk bulunan elemanın indeksini return eder.


    }
}
