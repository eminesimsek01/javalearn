package j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C07_subList {
    public static void main(String[] args) {
        ArrayList<String>listSehir =new ArrayList<>(List.of("Münih", "losAngeles", "Londra", "Stockholm","Angara", "pataGONYA"));
        //subList();-> Listelenmek istenen list parçasını return eder.
        System.out.println("listSehir.subList(3,5) = " + listSehir.subList(3, 5));//3. ve 4. index elemanlarının listini verir.

        ArrayList<String>city=new ArrayList<>(listSehir.subList(2,5));//2. 3. 4. index elemanlarını listeler
        System.out.println("listSehir = " + listSehir.subList(2,5));
    }
}
