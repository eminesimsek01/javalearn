package j01_j02_Homework.IteratorTasks;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C02_IteratorTasks {
    //İstenen sayı aralığındaki elemanları silme
    //[2,13,56,23,45,14,40] -> istenen aralık 20-40(sınırlar dahil)
    //20 den küçük 40  dan büyük elemanları sileceğiz
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>(List.of(2,13,56,23,45,14,40));
        Iterator<Integer> it = list.iterator();
        while(it.hasNext()) {
            int num=it.next();
            if (num<20||num>40){
                it.remove();
            }
        }
        System.out.println(list);
    }

}
