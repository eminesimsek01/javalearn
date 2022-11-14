package j20_PassbyValue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_PassByValue {
    public static void main(String[] args) {
        /*
        Java non-primitive data  türlerinde (Array, arraylist..) obj kendisi değil de dataları değişirse obj referans ve kendşisi
        değişmediği için dataların değişikliğini kalıcı yapar.
         */
        //Task-> Liste elemanları 24, 20, 87 iki farklı method ile list elemanlarını update edip print eden code
        // create ediniz.
        //1. method-> for each kullansın.
        //2.method set kullansın
        List<Integer> list=new ArrayList<>(Arrays.asList(24,20,87));
        System.out.println("method öncesi list  "+list);
        listupdate1(list);
        listupdate2(list);
        System.out.println("method sonrası list"+list);
    }//main sonu
    public static void listupdate1(List<Integer>list){
        for(Integer v:list){
            v*=2;
            System.out.println("v ="+v);
        }

    }
    public static void listupdate2(List<Integer>list){
        for (int i=0; i<list.size(); i++){
            list.set(i, list.get(i));
        }
        System.out.println();
        System.out.println(list);
    }
}
