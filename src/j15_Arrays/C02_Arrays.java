package j15_Arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {
        int arr []={67, 97, 20, 63, 43, 34, 54, 24, 16, 7, 55, 17};
        int sayı =33;
        boolean flag=false;//bayrak aşağıda
        for (int i=0; i<arr.length ; i++ ){
            if (arr[i]==sayı){
                flag=true;
            }
        }
        if (flag) {
            System.out.println("aradığınız sayı array'de var :)");
        } else {
            System.out.println("aradığınız sayı arrayde yok  :(");
        }
        Arrays.sort(arr);//array elemanları sıralandı
        System.out.println(Arrays.toString(arr));// [7, 16, 17, 20, 24, 34, 43, 54, 55, 63, 67, 97]
        System.out.println(Arrays.binarySearch(arr, 34));//binarySearch(arr,34); -> method aranan elemanı arrayin içinde arama
        System.out.println(Arrays.binarySearch(arr, 16));//binarySearch(arr,34); -> method aranan elemanı arrayin içinde arama
        System.out.println(Arrays.binarySearch(arr, 21));//binarySearch(arr,34); -> method aranan elemanı arrayin içinde arama

        //Trick-> binarySearch() metodu arrayde olmayan elemanı çalışırsa sonuç olarak : eğer bu eleman arrayde olsaydı
        //kaçıncı indekste olurdu
        System.out.println(Arrays.binarySearch(arr, 99));//-13. - olmadığı için, olsaydı 13. indekste olurdu.
    }
}
