package j16_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C14_ListConvertArray {
    public static void main(String[] args) {
        //List'i Array'a çevirme -> toArray(9;
        //1. Yöntem-> toArray(); parametre olarak String [0] alarak yapılır.

        ArrayList<String>listUlke=new ArrayList<>(List.of("Almanya", "Amerigonya", "İngiltere", "İsveç" ));
        String arrUlke[]=listUlke.toArray(new String[0]);//ulkeList'i elemanları arrÜlke olarak atandı.

        System.out.println("listUlke ="+listUlke);
        System.out.println("Arrays.toString(arrUlke" + Arrays.toString(arrUlke));//8Almanya, Amerigonya, İngiltere]
        //2. Yöntem -> OLuşturulan Array'in data type Object olarak atanır.
        //Trick-> Object class java'da tüm class'ların parent(ataso:Hz. Adem)
        //Object Class java'da parent'ı olmayan tek class'tır.
        //Integer class'lar object class child'i olduğu için istenen durumlarda
        Object arrUlkeler[]=listUlke.toArray();//Object Hz. Adem class2ına atandı.
        System.out.println("Arrays.toString(arrUlkeler) = " + Arrays.toString(arrUlkeler));


    }
}
