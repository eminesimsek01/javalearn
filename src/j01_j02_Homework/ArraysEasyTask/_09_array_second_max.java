package j01_j02_Homework.ArraysEasyTask;

import java.util.Arrays;

public class _09_array_second_max {

    public static void main(String[] args) {

        /*
        int Array oluşturun ve elemanları : 15 , 25, 22, 18, 30
        Arraydaki en büyük 2. elemanı yazdıran bir program yazın.
         */
        int array[]={15, 25, 22, 18, 30};
        Arrays.sort(array);
        System.out.println(array[2]);



    }
}
