package j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C06_set {
    public static void main(String[] args) {
        //set();-> Listin istenen elemanını set eder, günceller.
        ArrayList<String> listSehir=new ArrayList<>(List.of("Münih", "LosAngeles", "Londra", "Stockholm"));
        System.out.println(listSehir.set(3,"Angara")); //değiştirilecek elemanı print eder.
        System.out.println(listSehir); // değiştirilmiş halini print eder
       // System.out.println(listSehir.set(11,"pataGONYA"));//Olmayan index set edilirse RTE verir.
        System.out.println(listSehir);


    }

}
