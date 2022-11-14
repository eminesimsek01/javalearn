package j01_j02_Homework.Arrays_Homework;

import java.util.Arrays;
import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {
        /* TASK :
        bir int Array elemanlarinin işaretini(+-)degistiren  bir method create ediniz.
        input : 1,2,-3,4,-5,-6
        output :-1,-2,3,-4,5,6

         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Bir array boyutu giriniz :");
        int arrayboyutu = sc.nextInt();
        int arr[] = new int[arrayboyutu];
        System.out.println("Bir dizi sayı giriniz, dizi yapalım ");
        for (int i = 0; i < arrayboyutu; i++) {
            System.out.println(i + ". index elemanı giriniz : ");
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        isaretdegistirme((arr));
        }
    private static void isaretdegistirme(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
                 arr[i]*=-1;
            System.out.print(arr[i]+" ");
        }

    }


}

