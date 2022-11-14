package j16_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C15_ArrayConvertList {
    public static void main(String[] args) {
        //King of Trick-> Array'dan çevrilen List array kaynaklı olduğu için array davranışı gösterir, boyut sabittir,
        //dolayısıyla remove add methodu çalışmaz.
        String arrJavacan[]={"Akif", "Gamze", "Musty", "SevdeNur"};
        List<String>listJavaTar= Arrays.asList(arrJavacan);//arrJavaCan değerleri list eleman
        System.out.println("listJavaTar ="+ listJavaTar);//[Akif, Gamze, Musty, SevdeNur]
        System.out.println("listJavaTar.size() =" + listJavaTar.size());//4

        //listJavaTar.add("sefilCan Haluk");//array'a eleman eklenemezz    :(
                                            //RTE-> UnsupportedOperationException
        //ahan da kral Trickyyy-> list data type Arraylist tanımlanırsa Rte vermez.
        //kaynağı array de olsa list davranır, boyut esnekliği yapar.

        ArrayList<String > listJavaTar1= new ArrayList<>(Arrays.asList(arrJavacan));
        listJavaTar1.add("sefil haluk");
        System.out.println("listJavaTar1 = " + listJavaTar1);//[Akif, Gamze, Musty, SevdeNur, sefil haluk]

    }
    }
