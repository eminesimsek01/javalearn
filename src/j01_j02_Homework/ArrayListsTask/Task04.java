package j01_j02_Homework.ArrayListsTask;

import java.util.ArrayList;
import java.util.Arrays;

public class Task04 {
    public static void main(String[] args) {
        /* TASK :

         * Input olarak verilen listteki isimlerden
         * icinde ‘a’ harfi bulunanlari silen bir code create ediniz.
         *
         * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
         * OUTPUT : [Veli,Omer]
         */
        ArrayList<String>list1=new ArrayList<>(Arrays.asList("Ali","Veli","Ayse","Fatma","Omer")) ;
        String arr1[]=list1.toArray(new String[0]);
        for (int i=0; i< list1.size(); i++){
            if (arr1[i].contains("a")||arr1[i].contains("A"))
                  arr1[i]="";
        }
        System.out.println("Arrays.toString(arr1) = " + Arrays.toString(arr1));
    }
}
