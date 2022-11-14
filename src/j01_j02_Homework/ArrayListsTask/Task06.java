package j01_j02_Homework.ArrayListsTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
         /* TASK :
        Kullanıcıdan alacağınız 6 elemanlı bir dizinin
        sadece tek elemanlarını ayrı diziye bir metodda atayarak
        yazdırınız.
        */

        Scanner scan=new Scanner (System.in);
        int sayılar[]=new int[6];
        for (int i=0; i<6; i++){
            System.out.println("Bir sayı giriniz ");
            sayılar[i]=scan.nextInt();
        }
        System.out.println("Arrays.toString(sayılar) = " + Arrays.toString(sayılar));
        TekSayılar(sayılar);

    }//main sonu

    private static void TekSayılar(int[] sayılar) {
        ArrayList<Integer> newList = new ArrayList<>();
        for (int i=0; i<6; i++)
            if (sayılar[i] % 2 != 0) {
                newList.add(sayılar[i]);
            }
        Integer arrteksayılar[]=newList.toArray(new Integer[0]);
        System.out.println("Arrays.toString(arrteksayılar) = " + Arrays.toString(arrteksayılar));
    }

}

