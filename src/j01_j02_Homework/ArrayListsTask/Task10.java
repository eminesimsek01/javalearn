package j01_j02_Homework.ArrayListsTask;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task10 {

    public static void main(String[] args) {
        /* TASK :
         * Verilen arraydeki tekrar eden sayilari, ilki haric silip, tekrarsiz
         * sayilardan olusan bir array haline getiren bir code create ediniz.
         *
         * INPUT : {1,2,2,3,1,4,2,5,6,8,7,5,9,1}
         * OUTPUT : [1,2,3,4,5,6,7,8,9]
         */
        ArrayList<Integer>list1=new ArrayList<Integer>(Arrays.asList(1,2,2,3,1,4,2,5,6,8,7,5,9,1));
        ArrayList<Integer>list2=new ArrayList<Integer>();
        for (int i=0; i<list1.size(); i++){
            if (!list2.contains(list1.get(i))) {
                list2.add(list1.get(i));
            }
        }
        System.out.println(list2);

    }

}
