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
}
