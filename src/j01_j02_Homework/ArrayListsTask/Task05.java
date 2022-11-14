package j01_j02_Homework.ArrayListsTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;



public class Task05 {
    public static void main(String[] args) {


         /*TASK :
        2 Boyutlu bir Multidimensional array i input kabul edip, arraydeki tüm elemanları bir
        listeye kopyalayan ve harf sırasına göre yazdıran bir METHOD yazınız.
        Ex : Input : {{Ali,Veli,Ayse},{Hasan,Can},{Suzan}}
           Output:[Ali, Ayse, Can, Hasan, Suzan, Veli]
         */
        String isimArr[][] = {{"Ali", "Veli", "Ayse"}, {"Hasan", "Can"}, {"Suzan"}};
        newList(isimArr);


    }//main sonu

    private static void newList(String[][] isimArr) {
        ArrayList<String> newList = new ArrayList<String>();
        for (int i=0; i<isimArr.length; i++){
            for (int j=0; j<isimArr[i].length; j++){
                newList.add(isimArr[i][j]);
            }
        }
        Collections.sort(newList);
        System.out.println(newList);
    }


}
