package j15_Arrays;

import java.util.Arrays;

public class C05_Arrays {
    public static void main(String[] args) {
        //Array copy...copyof(arr,newLength);-> girilen arr'in new length kadar ilk elemanını kopyalar
        int sayi[]={63, 21, 47, 27, 35, 12, 36, 31, 46, 24};

        int yeniArr[]= Arrays.copyOf(sayi,5);
        System.out.println("Sayıdan kopyalanan 5 eleman kopyalanan yeni arr" +Arrays.toString(yeniArr));
        //[63, 21, 47, 27, 35]

        int baskaArr[]=Arrays.copyOfRange(sayi,3,8);
        System.out.println("sayı arr'den özel kopyalanan başka Arr : "+Arrays.toString(baskaArr));//[27, 35, 12, 36, 31]

        //Array'i belirli bir eleman ilr update(set) etme...fill(arr,value);
        Arrays.fill(sayi,99);//
        System.out.println("Sayı arr'i 99 ile fullenmiş hali "+Arrays.toString(sayi));

        Arrays.fill(sayi,3,7,33);//3. 4. 5. 6. index elemanlar 33 ile update edildi.
        System.out.println(" sayı arr'i 3 ile 7 index ara[sı 33 ile fullenmiş hali :"+Arrays.toString(sayi));
        //

    }
}
