package j01_j02_Homework.ArraysEasyTask;

import java.util.Arrays;

public class _18_2d_array2 {

    public static void main(String[] args) {

        /*
        Şu şekilde olan bir 2D int Array'i oluşturunuz.  [{5,2,1} , {10,2,3,6} , {1,2}]
        2D array'de olan elemanları toplayınız.
        toplamı yazdırınız.
        Sonuç 32 olmalıdır.
         */
        int array2D[][] = {
                {5, 2, 1},
                {10, 2, 3,6},
                {1, 2}
        };
        int toplam=0;
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
               toplam+=array2D[i][j];
            }
        }
        System.out.println(toplam);

    }
}