package j15_Arrays;

import java.util.Arrays;

public class C06_MdArrays {
    public static void main(String[] args) {
        /*
          Çok Boyutlu Diziler
    Java'da Çok Boyutlu Diziler varsayılan bir veri tipi olarak bulunmazlar ve matris olarak adlandırılırlar.
     Dizilerin 2 boyutlu halleri şeklinde tanımlanırlar. Matrisler satır ve sütun şeklinde tablo verisi
     formatındaki verileri tutmak için kullanılır. Diziler liste halinde veriler için uygunken,
     matrisler tablo şeklindeki veriler için uygundur. Oluşturulan tabloda bir değere ulaşmak istersek
     satır ve sütun sayısını girmemiz yeterli olacaktır.
    * TRICK :)İki boyutlu dizilerde tek boyutlu diziler gibi indis değeri 0'dan başlar.
    Dizide tutulacak veri tipleri aynı olmak zorundadır farklı veri tiplerini aynı matriste tutamayız.

           * 1- Ic Icice olusturulan  array'lerde   disardaki ana array'e outer array
           *  icerdeki  array'lere  inner array denir
           * 2- TRICK->  icerdeki array'lerin boyutlari birbirinden farkli ise
           *  Array'i ancak tum elemenlari atanarak declare edilmeli
           * 3- Multi dimensional array'de bir elemanin indexi icin
           *  en distaki array haric, elemania kadar ic ice olan tum arraylerin indexlerini yazmak gerekir
           */
        //Md Array Tanımlama
        int arr1[][]=new int[3][5];//3 katlı ve her katta 5 dairesi olan boş apt. -> 3 satır 5 sütun bir tablo
        //Bir sitede her birinde 10 dairelik 8 katlı 6 apt var. Nasıl arry olarak tanımlanır.-> 3 boyutlu arr
        //Trick-> Arry'i uzunlukları ile tanımlamak için inner(daire) uzunlukları eşit olmalı.
        int site[][][]=new int [6][8][10];

        //24 kişilik 3 sınıf ve 21 kişilik 5 sınıf olan okul nasıl array olarak tanımlanır.
        int sınıf24 [][]=new int[3][24];//24 kişilik 3 boş sınıf
        int sınıf21[][]=new int[5][21];//21 kişilik 5 boş sınıf
        arr1[2][4]=35;//2. kat 4. daire değeri 35 atandı.
        arr1[0][3]=34;//0. kat 5. daire değeri 34 atandı.
        System.out.println(arr1[0][3]);//34
        //elemanları girilerek array tanımlama
        int arr[][]={
                {1,2,3},//0. kat
                {10,20},//1. kat
                {101}//2. kat
                };//3 katlı apt
        //101 eleman index -> arr[2][0]

        //MdArray elemanları print etme
        System.out.println(arr[1]);//referans değerlerini yazdırır.
        System.out.println(Arrays.toString((arr[1])));//10, 20 //arr1'in değerlerini verir.
        System.out.println(arr[1][0]);//10 //Bu bir array elemanıdır, array değildir.
        System.out.println(Arrays.deepToString(arr));//Bütün apartmanı yazdırdı
    }
}
