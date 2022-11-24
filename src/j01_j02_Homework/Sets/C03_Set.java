package j01_j02_Homework.Sets;

import java.util.Arrays;
import java.util.HashSet;

public class C03_Set {
    /*
    Task
    totalCount() isminde bir method oluşturun.
    Parametresi  'Integer Hashset' olmalı
    HashSetteki eleman sayısını alın.
    totalCount'u döndürün.
    Örnek:
    hashset ; 4,2,3,1,7
    cevap: 5
     */
    public static void main(String[] args) {
        HashSet<Integer>hs=new HashSet<>(Arrays.asList(4,2,3,1,7));
        System.out.println("totalCount(hs) = " + totalCount(hs));
    }
    private static int totalCount(HashSet<Integer> hs) {
        return hs.size();
    }
}
