package j17_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C01_ForEachLoop {
    public static void main(String[] args) {
        /*
        for each loop, for loop'un gelişmiş halidir.
        1. Clean code-yazım kolaylığı
        2.Code okuma kolaylığı
        3.Hata yapma riskini azaltır
         */

        List<Integer>sayiList=new ArrayList<>(List.of(16, 5, 2, 33, 22, 27, 41, 24));
        //Task 1 List elemanlarının aralarında boşluk olacak şekilde yazdırın, ayrı satırlara

        for(int i=0; i<sayiList.size(); i++){
            System.out.println(sayiList.get(i)+" ");
        }

        for(Integer a:sayiList){
            System.out.println(a+" ");
        }

        //Task 2 List elemanları ilk 3 eleman hariç tek olanları print ediniz.
        for(Integer a:sayiList.subList(3,sayiList.size())){
            if (a%2==1) {
                System.out.print(a+" ");
            }

        }
        //Task 3 list elemanlarının 2 ile 5 indeks elemanlarını toplayınız.
        int toplam=0;
        for(Integer a:sayiList.subList(2,6)){
            toplam+=a;
        }
        System.out.println("toplam" + toplam);
    }


}
