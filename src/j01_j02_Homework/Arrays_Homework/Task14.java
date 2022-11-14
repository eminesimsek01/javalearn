package j01_j02_Homework.Arrays_Homework;

import java.util.Arrays;

public class Task14 {
    public static void main(String[] args) {
        /*  TASK :
        Write a method which accepts  string as parameter and prints the sum of digits
        present in thr given string
        input :"ade1r4d3"
        output : 8
        trick : Use --> Character.isDigit()
                    --> Integer.valueOf()
         */
        String str = "ade1r4d3";
        sumCharacters((String) str);
    }

    private static void sumCharacters(String str) {
        int sum=0;
        for(int i=0; i<str.length(); i++) {
                    if (Character.isDigit(str.charAt(i))) {
                        String newstr=str.substring(i,i+1);
                        sum+= Integer.parseInt(newstr);
                    }

        }
        System.out.println(sum);
    }


}

