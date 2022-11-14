package j01_j02_Homework.ArrayListsTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task09 {

    public static void main(String[] args) {
    /* TASK :
   Bir integer list oluşturunuz ve bu list’deki tum sayıların karesinin
   toplamını bulan code create ediniz.
    */
        ArrayList<Integer>list=new ArrayList<>(Arrays.asList(2,3,4,5,7,9));
        int toplam=0;
        for (int j=0; j<list.size(); j++){
            toplam+=list.get(j)*list.get(j);
        }
        System.out.println("Sayıların karesi  :"+toplam);

    }
}

