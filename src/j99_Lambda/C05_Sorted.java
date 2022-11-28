package j99_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class C05_Sorted {
    public static void main(String[] args) {
        List<Integer> sayi=new ArrayList<>(Arrays.asList(24,38,49,33,7,3,42,66,75,45,46,55,35));
        System.out.println("\n ****** ");
        ciftkareKbPrint(sayi);
        System.out.println("************");
        tekKareBüyüktenKüçüğe(sayi);
    }//main sonu

    //Task: Listin çift elemanlarının karelerini küçükten büyüğe print ediniz.
    public static void ciftkareKbPrint(List<Integer>sayi){
        sayi.
                stream().//List elemanları akışa alındı
                filter(C01_LambdaExpression::ciftMi).//akıştaki elemanlar çift şartına göre filtrelendi
                map(t->t*t).//filtrelenen çift elemanlar elemanın karesi olarak update edildi
                sorted().//akıştaki karesine göre update edilen elemanlar sıralandı
                forEach(C01_LambdaExpression::yazdir);//print//576 1444 1764 2116 4356
        //sorted() => Doğal düzene göre sıralanmış, bu akışın elemanlarında oluşan bir akış döndürür.
        //Sorted() methodu tekrarlı kullanılırsa en son kullanılan aktif olur.

    }
    //Task: Listin tek elemanlarının karelerini büyükten küçüğe print ediniz.
    public static void tekKareBüyüktenKüçüğe(List<Integer>sayi){
        sayi.
                stream().//List elemanları akışa alındı
                filter(t->t%2==1).//akıştaki elemanlar tek şartına göre filtrelendi
                map(t->t*t).//filtrelenen çift elemanlar elemanın karesi olarak update edildi
                sorted(Comparator.reverseOrder()).//Comparator.reverseOrder() meth call. ters sıra meth sorted edildi
                forEach(C01_LambdaExpression::yazdir);//print//5625 3025 2401 2025 1225 1089 49 9
        //sorted() => Doğal düzene göre sıralanmış, bu akışın elemanlarında oluşan bir akış döndürür.
        //Sorted() methodu tekrarlı kullanılırsa en son kullanılan aktif olur.

    }

}
