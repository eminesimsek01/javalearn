package j01_j02_Homework.ArraysEasyTask;

import java.util.Arrays;

public class _14_String_method_replace {

    public static void main(String[] args) {

        /*
        Bu String'i oluşturunuz.  "Hello World"
        "o" harfleri yerine "K" yerleştiriniz.
        Sonuç bu şekilde olmalıdır:
        HellK WKrld
         */
        String[]isim={"Hello World"};
        String str= Arrays.toString(isim);
        String newStr=str.replace('o','K');
        String thenewest=newStr.substring(1, newStr.length()-2);
        System.out.println(thenewest);


    }
}