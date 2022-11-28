package j99_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class C04_reduce {
    public static void main(String[] args) {
                    /*
            reduce()-->azaltmak ... bir cok datayi tek bir dataya(max min carp top vs islemlerde) cevirmek icin kullanilir.
            kullanımı yaygındır pratiktir.
            Bir Stream içerisindeki verilerin teker teker işlenmesidir. Teker teker işleme sürecinde, bir önceki adımda elde edilen sonuç
            bir sonraki adıma girdi olarak sunulmaktadır. Bu sayede yığılmlı bir hesaplama süreci elde edilmiş olmaktadır.
            reduce metodu ilk parametrede identity değeri, ikinci parametrede ise BinaryOperator türünden bir obj kullanılır.
            reduce işleminde bir önceki hesaplanmış değer ile sıradaki değer bir işleme tabi tutulmaktadır.
            İşleme başlarken bir önceki değer olmadığı için bu değer identity parametresinde tanımlanmaktadır.
                   */
            List<Integer> sayi = new ArrayList<>(Arrays.asList(24, 38, 49, 33, 7, 3, 42, 66, 75, 45, 46, 55, 35, 25, 67, 16));
            //Lambda->Stream API
            System.out.println("\n   ***   ");
            ciftkaremaksimum(sayi);
            citfelemanCarpPrint(sayi);
            minBul(sayi);
            yirmidorttenbuyukTekPrint(sayi);
    }//main sonu
            //Task: Listin çift elemanlarının karelerinin en büyüğünü print ediniz
    public static void ciftkaremaksimum (List<Integer>sayi){
            //        Optional<Integer> maxEleman=   sayi.//filter işlemi null değer return etme riskine karşı Optional Class type data casting yapıldı.
            //        stream().//List elemanları akışa alındı
            //        filter(C01_LambdaExpression::ciftMi).//Akıştaki list elemanları çift mi tek mi olarak filtrelendi
            //        map(t->t*t).//Filtrelenen çift elemanları akışta karesi ile update edildi.
            //        reduce(Math::max);//çift filtrelenen ve karesi alınan akış elemanları maksimum elemana göre reduce edildi.
            //        System.out.println("maxEleman = " + maxEleman);

        System.out.println("sayi.\n               stream().//List elemanları akışa alındı\n               filter(C01_LambdaExpression::ciftMi).//Akıştaki list elemanları çift mi tek mi olarak filtrelendi\n               map(t->t*t).//Filtrelenen çift elemanları akışta karesi ile update edildi.\n                reduce(Math::max) = " + sayi.
                stream().//List elemanları akışa alındı
                        filter(C01_LambdaExpression::ciftMi).//Akıştaki list elemanları çift mi tek mi olarak filtrelendi
                        map(t -> t * t).//Filtrelenen çift elemanları akışta karesi ile update edildi.
                        //reduce(Math::max));//çift filtrelenen ve karesi alınan akış elemanları maksimum elemana göre reduce edildi.
                         reduce(Integer::max));//spesific class daha hızlı çalışır.
    }
    //Task-> Listteki tüm elemanların toplamını print ediniz.

    // Task : List'teki tum elemanlarin toplamini print ediniz.
    public  static void elTopla(List<Integer> sayi){
        System.out.println(sayi.
                stream().reduce(Integer::sum));//Optional[626]
        Optional<Integer> toplam=sayi.
                stream().reduce(Integer::sum);
        System.out.println(toplam);//Optional[626]

        System.out.println("lambda exp. : "+sayi.stream().reduce(0, (a, b) -> a + b));//Lambda expression
        /*
        a : ilk değerini her zaman atanan identity değerden alır
        b : değerini her zaman stream() akısdan alır.
        a ilk değerden sonraki değerlerini action(işlem body)'den alır
        */

    }
    //List'teki çift elemanların çarpımını yazdırınız.
    List<Integer> sayi = new ArrayList<>(Arrays.asList(1, 3, 5,4,6,12,8));
    public static void citfelemanCarpPrint (List<Integer>sayi){
        System.out.println( sayi.
                stream().
                filter(C01_LambdaExpression::ciftMi).
                reduce(Math::multiplyExact));//Math Class'dan math refere..
        System.out.println(sayi.stream().filter(C01_LambdaExpression::ciftMi).reduce(1, (t, u) -> t * u));//Lamb. expression
        //Başlangıç değeri olduğu için kesinlikle optional değer vermez. Null değer verme ihtimali yoktur
    }

    //Task: List'teki elemanlardan en küçüğünü 4 farklı yöntem ile print ediniz.
    public static void minBul(List<Integer>sayi){
        System.out.println(sayi.stream().reduce(Math::min));//1.yol->meth. refe.
        System.out.println(sayi.stream().reduce(Integer::min));//2.yol-> meth. refe.
        System.out.println(sayi.stream().reduce(Integer::min));//3.yol-> meth. refe.
        System.out.println(sayi.stream().reduce(C04_reduce::byHalukMinBul));//3.yol

    }
    public static int byHalukMinBul (int a, int b){//math refe. için seed(tohum) method
        return a<b?a:b;
    }
    //Task: Listteki 24'ten büyük en küçük tek sayıyı print ediniz.
    public static void yirmidorttenbuyukTekPrint(List<Integer>sayi){
        System.out.println(sayi.stream().filter(t -> t > 24 && t % 2 == 1).reduce(Integer::min));
        //sayi.stream().filter(t->t>24&&C01_LambdaExpression::ciftMi).reduce(Integer::min);->CTE : exp. ve method
        // referans aynı body^de olamaz.
    }

}
