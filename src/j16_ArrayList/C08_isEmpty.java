package j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C08_isEmpty {
    public static void main(String[] args) {
        //isEmpty;-> Listin boş olmasını kontrol eder. True/False return eder.
        //clear(); -> Listin tüm elemanlarını siler
        ArrayList<String> listSehir=new ArrayList<>(List.of("Münih", "LosAngeles", "Londra", "Stockholm"));
        System.out.println("listSehir = " + listSehir);

        System.out.println("listSehir.isEmpty() = " + listSehir.isEmpty());

        listSehir.clear();//list temizlendi

        System.out.println("listSehir = " + listSehir);
        System.out.println("listSehir.isEmpty() = " + listSehir.isEmpty());//
    }
}
