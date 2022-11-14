package j01_j02_Homework.Arrays_Homework;

import java.util.Scanner;

public class Task13 {

    public static void main(String[] args) {
        /* TASK :
         Kullanicidan aldigimiz 8 elemanli arrayin icinde
        3 e bolunebilen sayi adedini print eden java code create ediniz (negatif sayilar da dahil olsun)

         */
        Scanner scan=new Scanner(System.in);
        int arr[] = new int[8];
        System.out.println("8 terimli bir dizi girin :");
        for (int i=0; i<8; i++){
            System.out.println(i+". indeks elemanını giriniz ");
            arr[i]=scan.nextInt();
        }
        ücebolunebilme(arr);

    }

    private static void ücebolunebilme(int[] arr) {
        for (int i=0; i<8; i++){
            System.out.print((arr[i] % 3 == 0 ? arr[i]+" " : ""));
        }
    }

}
