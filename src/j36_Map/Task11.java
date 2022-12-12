package j36_Map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task11 {
      /*
    Count the words in a String one by one
    Bir Stringdeki kelimeleri saydırıp prnt eden code create ediniz .
    String Str = "Ali came to school and Ayse came to school"
    Ali=            1
    came=   2
    to=         2
    school= 2
    and=    1
    Ayse=   1
*/

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir cümle giriniz...");
        String cumle=scan.nextLine();
        Map<String, Integer>kelimesayısı=new HashMap<>((Map) Arrays.asList(cumle.split(" ")));


        }



    }


