package j01_j02_Homework.ArraysEasyTask;

import java.util.Arrays;

public class _13_Advance_zeroFront {

    public static void main(String[] args) {

      /*

   Verilen Array tam olarak aynı sayıları içeren, ancak tüm sıfırların dizinin başında gruplandırılması
   için yeniden düzenlenmiş bir Array döndürün.
   Sıfır olmayan sayıların sırası önemli değildir.
   Böylece {1, 0, 0, 1} {0, 0, 1, 1} olur. Verilen diziyi değiştirebilir ve döndürebilir veya yeni bir dizi oluşturabilirsiniz.

   Bu şekilde bir Array oluşturunuz: 1,0,0,1,0
   Sonuç böyle olmalı :  0,0,0,1,1

       */
        int arr[]={1, 0, 0, 1, };
        int expectedarr[]={0, 0, 1,1};
        for (int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length+1; i++ ){
                if(arr[i]!=0&& arr[j]==0){
                    int space=arr[i];
                    arr[i]=arr[j];
                    arr[j]=space;
                }
            }
        }
        System.out.println(Arrays.toString(arr));


    }
}