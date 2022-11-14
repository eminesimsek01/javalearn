package j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C04_Get {
    public static void main(String[] args) {
        //get();-> Listte istenen elemanı return eder. arr[3]-> arr'nin 3. indeksteki elemanını ver.
        ArrayList<String> listSehir=new ArrayList<>(List.of("Münih", "LosAngeles", "Londra", "Stockholm"));
        System.out.println(listSehir.get(1));//losAngeles
        //System.out.println(listSehir.get(11));//Olmayan eleman CTE verir.



    }

}
