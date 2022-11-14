package j15_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        //task-> Girilen int array elemanları toplamını print eden code create ediniz.
        Scanner sc=new Scanner(System.in);
        System.out.println("Kaç elemanlı bir array istersiniz: ");
       // int arrayboyut=sc.nextInt();
        int arr[]=new int[sc.nextInt()];
        for (int i=0; i<arr.length; i++){
            System.out.println(i+ ". index elemanı giriniz : ");
            arr[i]=sc.nextInt();
        }
        int toplam=0;
        for(int i=0; i<arr.length; i++){
            toplam=toplam+arr[i];
        }
        System.out.println("agam istediğin array : "+ Arrays.toString(arr));
        System.out.println("Oluşturudğunuz dizi elemanlarının toplamı  "+toplam);

    }
}
