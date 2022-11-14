package j01_j02_Homework.ArraysEasyTask;

import java.util.Arrays;

public class _17_2d_Array {

    public static void main(String[] args) {

        /*
        Şu şekilde olan bir 2D int Array'î oluşturunuz.  [{2,3,2} , {4,1,5} , {7,2,5}]
        Bütün 2'leri 6'yla değiştirin.
        Array'i yazdırınız.
         */
        int array2D[][] = {
                {2, 3, 2},
                {4, 1, 5},
                {7, 2, 5}
        };
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                if (array2D[i][j] == 2) {
                    array2D[i][j] = 6;
                }
            }
        }
        System.out.println(Arrays.deepToString(array2D));
    }
}