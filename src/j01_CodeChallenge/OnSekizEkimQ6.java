package j01_CodeChallenge;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class OnSekizEkimQ6 {
    public static void main(String[] args) {
        /*
         * verilen arrayin n sayisi kadar maksimun  degerlerini bulan java programi yaziniz
         * not kisa metodlar kullamayiniz
         * Input : {1,2,3,4,5,6,7,8} input n:2 Output : 7 and 8
         */

        int[] arr = {2, 5, 8, 78, 12, -4, 11, 0};
        int n = 2;
        //Bir liste oluşturalım.
        List<Integer> list = new ArrayList<>();
        for (Integer each : arr) {
            list.add(each);
        }
        List<Integer> maxlist = new ArrayList<>();
        int max = 0;
        int count = 0;

        while (count < n) {//max listeye eklenecek eleman sayısı kontrolü
            max = list.get(0);
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max) {//listedeki herhangi bir eleman max'dan büyükse
                max = list.get(i);//o max olsun
            }
        }
        maxlist.add(max);//o max değeri maxListe ekle
        maxlist.add(max);
        count++;


    }
}

