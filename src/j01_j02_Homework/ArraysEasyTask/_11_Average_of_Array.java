package j01_j02_Homework.ArraysEasyTask;

public class _11_Average_of_Array {

    public static void main(String[] args) {

        /*
        int Array oluşturun ve elemanları : 12, 14 , 21 ,23 , 10 ,6
        Array'in ortalamasını alınız.
         */
      int array[]={12,14,21,23,10,4,9,10, 24, 56, 78};
      int arrtoplam=0;
      for (int i=0; array.length>i ; i++){
          arrtoplam+=array[i];

      }
      double ortalamaArr=arrtoplam/array.length;
        System.out.println("ortalamaArr = " + ortalamaArr);


    }
}