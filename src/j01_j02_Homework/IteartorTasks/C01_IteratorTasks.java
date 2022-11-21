package j01_j02_Homework.IteartorTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class C01_IteratorTasks {
    static int num;

    public static void main(String[] args) {
        /*
        verilen bir integer listin tek elemanlarının karesini tersten iterator print eden code create edin
        */
        List<Integer> l1 = new ArrayList<>(Arrays.asList(1, 5, 9, 0, 20, 12, 14));
        ListIterator<Integer> it1 = l1.listIterator();

        List<Integer> l2 = new ArrayList<>();
        while (it1.hasNext()) {
            int num = it1.next();

            if (num % 2 == 1) {
                it1.set((int) Math.pow(num, 2));
            }
        }
        while (it1.hasPrevious()) {
            l2.add(num);
            System.out.println(l2);
        }
    }
}
