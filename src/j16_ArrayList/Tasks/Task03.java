package j16_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        //Bir liste istenen sayının varlığını kontrol eden bir code create ediniz.
        ArrayList<Integer>listSayı=new ArrayList<>(Arrays.asList(1, 24, 23, 14, 19, 60, 1, 55, 27, 1, 38));
        Scanner scan=new Scanner(System.in);
        System.out.println("agam hangi sayı arirsen :");
        int ara=scan.nextInt();
        boolean varMı0=false;

        for (int i=0; i<listSayı.size(); i++){
            if(listSayı.get(i)==ara){
                varMı0=true;
                System.out.println(" agam aradığın sayı bizde MEVCUT");
                break;
            }
        }
        if(!varMı0){
            System.out.println(" agam aradığın sayı MAALESEF");
        }
    }
}
