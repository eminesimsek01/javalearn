package j01_j02_Homework.ArraysEasyTask;

import java.util.Arrays;

public class _10_reverse_String {

    public static void main(String[] args) {

        /*
        Bir String oluşturun : "Hello World"
        Stringi tersten yazdırın ve print edin.
        Cevap böyle olmalı :  "dlroW olleH"
         */
        String a[]={"Hello World"};
        String str=Arrays.toString(a);// [Hello World]
        for( int i=str.length()-2; i>0; i--){
            System.out.print(str.charAt(i));
        }


    }
}