package j16_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_ArrayList {
    public static void main(String[] args) {
        int sayı=33;//tek bir data saklayabilen yapıdır, variable.
        int sayı1[]=new int[5];//5 int değer saklayabilen yapı
        int sayı2[][]=new int[5][6];//5*6 30 int değer saklayabilen yapı
        ArrayList<Integer>syılist=new ArrayList<>(); //istenildiği kadar int değer saklayan yapı;
        //Açıklamalar gelecek
        ArrayList<Integer>listSayı=new ArrayList<>();//boş integer type list oluşturuldu.
        //1. yol->add(9; method
        listSayı.add(10);//liste ilk eleman olarak 10 değeri eklendi
        System.out.println("listSayı = " + listSayı);//[10]
        listSayı.add(39);
        listSayı.add(72);
        listSayı.add(61);
        listSayı.add(41);
        listSayı.add(41);//list eleman tekrarını kabul eder
        System.out.println("listSayı = " + listSayı);//[10, 39, 72, 61, 41, 41]
        //2. yol
        ArrayList<String>listIsim=new ArrayList(Arrays.asList("Muharrem", "Nur", "Enise", "Fatih"));
        System.out.println("listIsim = " + listIsim);
        //3.yol-> List.of(); method
        ArrayList<String>listUlke=new ArrayList<>(List.of("Alamanya", "Amerigonya", "İngiltere", "İsveç"));
        listSayı.add(2,14);//Listde index 2'ye 14 değerini ekledi. 2. indexteki eski eleman bir index ileri
        // kaydırıldı.
        System.out.println("listSayı = " + listSayı);//[10, 39, 14, 72, 61, 41, 41];

    }
}
