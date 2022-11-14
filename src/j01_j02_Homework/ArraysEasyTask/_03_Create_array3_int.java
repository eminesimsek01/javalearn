package j01_j02_Homework.ArraysEasyTask;

import java.util.Arrays;

public class _03_Create_array3_int {

    public static void main(String[] args) {

    /*  elemanları   : 25,30,30,35,100 olan   İnt Array oluştur ve
          Array in elemanlarının toplamını yazdır.
          Cevap 220 olmalı.
     */
    int array[]={25, 30, 30, 35, 100};
        System.out.println(Arrays.toString(array));
        int toplam=0;
        for (int i=0; i<array.length; i++){
            toplam+=array[i];
        }
        System.out.println("Dizi elemanlarının toplamı : "+toplam);
    }
}