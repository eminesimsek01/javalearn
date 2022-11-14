package j01_j02_Homework.ArrayListsTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task03 {
    static Scanner scan=new Scanner (System.in);
    public static void main(String[] args) {
        // Task ->  bir listte istenen sayının varlığı kontrol eden code create ediniz.
        ArrayList<Integer>listinteger=new ArrayList(Arrays.asList(2,3,5,7));
        System.out.println("Bir sayı giriniz, listte var mı kontrol edelim");
        int sayı=scan.nextInt();
        boolean sonuc=listinteger.contains(sayı);
        System.out.println( (sonuc == true ? "sayı listte var" : "sayı listte yok"));



    }
}
