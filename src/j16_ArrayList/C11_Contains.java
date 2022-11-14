package j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C11_Contains {
    public static void main(String[] args) {
        //contains(); method listte istenen elamanın varlığını kontrol eder. True/false verir.
        ArrayList<String>listSehir =new ArrayList<>(List.of("Münih", "losAngeles", "Londra", "Stockholm","Angara", "pataGONYA"));
        System.out.println("listSehir.contains(\"angara\") = " + listSehir.contains("Angara"));
        System.out.println("listSehir.contains(\"kayseri\") = " + listSehir.contains("kayseri"));

    }
}
