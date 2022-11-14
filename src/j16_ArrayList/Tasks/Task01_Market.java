package j16_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task01_Market {
    static ArrayList<String>günler=new ArrayList<>(Arrays.asList("Pazartesi ", "Salı ", "Çarşamba ", "Perşembe ", "Cuma ",
            "Cumartesi ", "Pazar "));
    static ArrayList<Double>gunlukKazanclar=new ArrayList<>();//2. adım
    static double haftaCirosu=0;
    static Scanner scan=new Scanner(System.in);

    public static void main(String[] args) {
        int gun=0;
        while(gun<7){
            System.out.println("agam hele bugünün kazancını gir :"+günler.get(gun)+" günün hasılatını gir :");
            double gunKazancı=scan.nextDouble();
            gunlukKazanclar.add(gunKazancı);
            haftaCirosu+=gunKazancı;
            gun++;
        }
        getortalamkazanc();
        System.out.println("Haftanın Cirosu" +haftaCirosu);
        System.out.println("Ortalama kazanç" +getortalamkazanc());
        System.out.println("Getortalamanınustundekazanc = " +getortalamanınustundekazanc());
        System.out.println("Getortlamanınustundekazan ="+getortalamanınaltıkazanc());

    }

    private static String getortalamanınaltıkazanc() {
        String ortalamaaltıgün = "";
        for (int i = 0; i < gunlukKazanclar.size(); i++) {
            if (gunlukKazanclar.get(i) < getortalamkazanc()) {//günlük hasılat haftanın ortalama kazancından yüksekse
                ortalamaaltıgün += günler.get(i);//ortlamanın üstünde hasılat olan günü ortlama üstü güne eklendi .
            }
        }
        return ortalamaaltıgün;
    }

    private static String getortalamanınustundekazanc() {//5. adım
        String ortalamaÜstügün = "";
        for (int i = 0; i < gunlukKazanclar.size(); i++) {
            if (gunlukKazanclar.get(i) > getortalamkazanc()) {//günlük hasılat haftanın ortalama kazancından yüksekse
                ortalamaÜstügün += günler.get(i);//ortlamanın üstünde hasılat olan günü ortlama üstü güne eklendi .
            }
        }
        return ortalamaÜstügün;
    }

    private static double getortalamkazanc() {
        double ortalama=haftaCirosu/7;
        return ortalama;
    }


}
