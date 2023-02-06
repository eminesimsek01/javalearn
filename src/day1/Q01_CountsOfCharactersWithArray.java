package day1;

import java.util.Arrays;
import java.util.Scanner;
public class Q01_CountsOfCharactersWithArray {
   /*
     Kullanicidan bir String aliniz.
     String'de var olan her character'in sayisini ekrana yazdiriniz.
     Ornek: alacan ==> a = 3, l = 1, c = 1, n = 1
            abaa   ==> a=3  b=1
    */
   public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
       System.out.println("Bir string giriniz :");
       String a=scan.nextLine();
       //split
       String arr[]=a.split("");
       System.out.println(Arrays.toString(arr));
       //sort
       Arrays.sort(arr);
       System.out.println(Arrays.toString(arr));
       int count=0;//sayaç
       for (int i=1; i<=arr.length-1; i++){
           if (arr[i-1].equals(arr[i])){
               count++;
           } else {//tek sayıdaki karakter için
               System.out.println(arr[i-1]+" sayısı"+(count+1));
               count=0;
           }
           if (i==arr.length-1){//en son karakter için çalışır
               System.out.println(arr[i]+"sayısı"+(count+1));
           }
       }
       //karakterleri karşılaştırmak için for loop
   }
}
