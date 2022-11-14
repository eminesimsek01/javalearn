package j01_j02_Homework.ArraysEasyTask;

public class _05_Array_with_for_if {

    public static void main(String[] args) {

        /*
         elemanları : 5,6,8,12,14,19 olan int Array oluşturun ve
        Eğer sayı çiftse topla, tekse çıkar.
        Örneğin:
         -5 + 6 + 8 + 12 + 14 - 19 = 16
        Toplamlarını yazdırın.
         */
        int array[]={5, 6, 8, 12, 14, 19};
        int toplam=0;
        for (int i=0; i<array.length; i++){
           if (array[i]%2==0){
               toplam+=array[i];
           } else
           {
               toplam-=array[i];
           }
        }
        System.out.println(toplam);


    }
}
