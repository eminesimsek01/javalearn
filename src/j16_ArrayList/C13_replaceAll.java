package j16_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class C13_replaceAll {
    public static void main(String[] args) {
        ArrayList<Integer>listSayi=new ArrayList<>(Arrays.asList(1, 24, 23, 19, 60, 55, 27, 1, 38));
        Collections.replaceAll(listSayi,1,20);
        System.out.println("listSayı ="+listSayi);//replaceAll sonrası-> [20, 24, 23, 14, 19, 60, 20, 55, 27, 20, 38]

        //fill();-> Listte tüm elemanları belirli bir değere update eder.
        Collections.fill(listSayi,33);
        System.out.println(" listSayi ="+listSayi); // fill sonrası -> [33, 33, 33, 33, 33..........................]

    }
}
