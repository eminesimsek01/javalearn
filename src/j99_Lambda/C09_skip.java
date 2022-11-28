package j99_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class C09_skip {
    public static void main(String[] args) {
        ////skip(n) => atlama demek. Akışın ilk n elemanını attıktan sonra bu akışın kalan elemanlarından oluşan bir akış return eder.
        // akıs n den daha az eleman içeriyorsa  skip(n) neth dan sonra boş akıs return eder.skip(n) ara işlemdir.
        List<String> menu=new ArrayList<String>(Arrays.asList("küşleme","küşleme","küşleme","trileçe","cacix","yağlama","güllaç"));
        System.out.println("\n *********");
        sonelemanagorekarsılastırPrintEt(menu);
    }//main sonu

    //Task: List elemanlarını son harfine göre sıralayıp ilk iki eleman hariç kalan elemanları print ediniz.
    public static void sonelemanagorekarsılastırPrintEt (List<String>menu){
        System.out.println(Arrays.asList(
        menu.stream().
                sorted(Comparator.comparing(t->t.charAt(t.length()-1))).//akıştaki elemanların son karakterine göre sıralandı
                skip(20).//akıştaki ilk iki eleman akıştan çıkarılır
                toArray()//akış elemanları bir arraye atandı
        ));
    }
}
