package j01_j02_Homework.ArrayListsTask;

import java.util.ArrayList;
import java.util.Scanner;

public class Task08 {
    static Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {
        // Task-> Girilen sayıların içinde ortalamadan buyuk olanları print eden METHOD create ediniz.

        ArrayList<Integer> list = new ArrayList<Integer>();
        int toplam = 0;
        System.out.println("Kaç tane eleman girmek istersen");
        int listsize = scan.nextInt();
        int k = 0;
        for (int i = 0; i < listsize; i++) {
            System.out.println("Bir sayı giriniz :");
            k = scan.nextInt();
            list.add(k);
        }
        System.out.println(list);
        ortalama(toplam,list,k);
    }
    private static void toplam(ArrayList<Integer>list) {
        int toplam=0;
        for (int j=0; j<list.size(); j++){
            toplam+=list.get(j);
        }
    }

    private static void ortalama(int toplam,ArrayList<Integer>list,int k ) {
        toplam(list);
        ArrayList<Integer> newlist = new ArrayList<Integer>();
        int ortalama=toplam/list.size();
        if (k>ortalama){
            newlist.add(k);
        }
        System.out.println(newlist);
    }
}


