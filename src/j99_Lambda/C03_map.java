package j99_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_map {
    public static void main(String[] args) {
        List<Integer> sayi = new ArrayList<>(Arrays.asList(24, 38, 49, 33, 7, 3, 42, 66, 75, 45, 46, 55, 35, 25, 67, 16));
        tekKüpBirFazlaPrint(sayi);

        System.out.println("\n ******* ");
    }//main sonu

    //Task: Functional Programming ile listin çift elemanlarının karelerini aynı satırda aralarına boşluk bırakarak print edilir.
    public static void çiftKarePrint(List<Integer> sayi) {
        sayi.
                stream().//List elemanlar akışa alındı
                filter(C01_LambdaExpression::ciftMi).//akıştaki çift elemanlar filtrelendi
                map(t -> t * t).//Map elemaları güncelledi, karesini aldı
                forEach(C01_LambdaExpression::yazdir);//akışta filtrelenmiş çift elemanalr karesi alınıp işaretlendikten
        // sonra yazdırıldı
    }

    //Task: Functional Programming ile listin tek elemanlarının küplerinin bir fazlasını aynı satırda aralarına boşluk
    //bırakarak
    public static void tekKüpBirFazlaPrint(List<Integer> sayi) {
        sayi.
                stream().//List elemanlar akışa alındı
                filter(t -> t % 2 == 1).//akıştaki tek elemanlar filtrelendi
                //map(t->t*t*t+1).//Map elemaları güncelledi, küpünü alarak bir ekledi
                        map(t -> (int) Math.pow(t, 3) + 1).
                forEach(C01_LambdaExpression::yazdir);//akışta filtrelenmiş tek elemanların küpü alınıp işaretlendikten
        // sonra yazdırıldı
    }

    //Task: Functional Programming ile listin çift elemanlarının kareköklerini aynı satırda aralarına boşluk bırakarak
    //print ediniz.
    public static void ciftkarekok(List<Integer> sayi) {
        System.out.println("\n      ***      ");

        sayi.stream().filter(C01_LambdaExpression::ciftMi).map(t -> (int) Math.sqrt(t)).forEach(C01_LambdaExpression::yazdir);


    }
}
