package j01_j02_Homework.ArrayListsTask;

import java.util.ArrayList;
import java.util.Arrays;

public class Task13 {
    /* TASK :
     * If the array is { 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 }
     * type a program to create a new array whose elements are like {3, 5+1, 2+7+9, 2+3+5+7}
     * ardışık array elemanların toplamını hesaplayan bir method create ediniz.
     */
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3, 5, 1, 2, 7, 9, 2, 3, 5, 7));
        ArrayList<Integer> ikboyutlulist = new ArrayList<>();
        int toplam=0;
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (i==0) {
                    int ilkeleman=list.get(i);
                    ikboyutlulist.add(ilkeleman);
                    i++;
                }
                else {
                    int yenieleman;
                    for (int n = 1; n <j;)
                        yenieleman = list.get(i) + list.get(j);

                    i++;
                }
            }
        }
        System.out.println(ikboyutlulist);
    }
}

