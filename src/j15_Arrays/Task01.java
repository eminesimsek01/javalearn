package j15_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        ////Task-> kullanıcdan alınan değerlerle bir int array elemanlarını buyukten kucuge print eden code create ediniz.
        Scanner sc=new Scanner(System.in);
        System.out.println("Kaç elemanlı bir array istersiniz: ");
        int arrayboyut=sc.nextInt();
        int arr[]=new int[arrayboyut];
        for (int i=0; i<arrayboyut; i++){
            System.out.println(i+ ". index elemanı giriniz : ");
            arr[i]=sc.nextInt();
        }
        System.out.println("agam istediğin array : "+ Arrays.toString(arr));
        Arrays.sort(arr);//arr k->b sortingen yapıldı.
        for (int i=arr.length-1; i>=0; i--){
            System.out.print(arr[i]+" ");
        }
    }
}
