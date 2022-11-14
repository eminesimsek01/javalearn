package j15_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        //task-> girilen  int array elemanlarından ortalamadan büyük olan eleman sayısını print eden bir code create ediniz.
        Scanner sc = new Scanner(System.in);
        System.out.println("Kaç elemanlı bir array istersiniz: ");
        int arrayboyut = sc.nextInt();
        int arr[] = new int[arrayboyut];
        for (int i = 0; i < arrayboyut; i++) {
            System.out.println(i + ". index elemanı giriniz : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("agam istediğin array : " + Arrays.toString(arr));
        int arrToplam = 0;//local var

        for (int i = 0; i < arr.length; i++) {
            arrToplam += arr[i];
        }
        System.out.println("array elemanları toplamı :" + arrToplam);

        //0rtalama Bulma

        int arrOrtalama = arrToplam / arr.length;
        System.out.println(" Ortalama : "+arrOrtalama);
        int ortlamayıgecensayısı=0;

        for(int i=0; i<arr.length; i++){
            if(arr[i]>arrOrtalama){
            ortlamayıgecensayısı++;}
        }
            System.out.println("ortalamayı geçen eleman sayısı"+ortlamayıgecensayısı);
    }

}
