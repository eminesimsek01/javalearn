package j99_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C07_match {
    public static void main(String[] args) {
        List<String> menu=new ArrayList<String>(Arrays.asList("küşleme","küşleme","küşleme","trileçe","cacix","yağlama","güllaç"));
        System.out.println("\n *********");
        hrfsys7denAzKontrol(menu);
        xilebitenKontrol(menu);
    }//main sonu
    //anyMatch() --> enaz bir eleman sarti saglarsa true aksi durumda false return eder
    //allMatch() --> tum  elemanlar sarti saglarsa true en az bir eleman sarti saglamazsa false return eder.
    //noneMatch()--> hic bir sarti SAGLAMAZSA true en az bir eleman sarti SAGLARSA false return eder.
    //Task: List elemanlarının karakter sayısını 7 veya 7'den az olma durumunu kontrol ediniz..
    public static void hrfsys7denAzKontrol (List<String>menu){
        boolean kontrol=menu.stream().allMatch(t->t.length()<=7);
        if(kontrol){//amele code
            System.out.println("agam menüdekiler 7 ve daha az karakterden oluşuyor :)");
        } else System.out.println("agam menüdekiler 7 karakterden fazla ");
    }
    //Task: List elemanlarının w ile başlamasınıkontrol ediniz:
    public static void wilebaslayanKontrol (List<String>menu){
        System.out.println(menu.
                stream().
                noneMatch(t->t.startsWith("w"))//akıştaki hiçbir eleman w ile başlamaz kontrolü yapıldı->şart
                ?"agam ile başlayan yemahh olur mu?  :("//şart true ise print edilecek
                :"agam venemen ne menem bir şey");//şart false  is print eder
    }
    public static void xilebitenKontrol (List<String>menu){
        System.out.println(menu.
                stream().
                anyMatch(t->t.toLowerCase().endsWith("w"))//akıştaki hiçbir eleman x ile biter kontrolü yapıldı->şart
                ?"agam senden bir cacix olmaz  :("//şart true ise print edilecek
                :"agam senin yemeğğ bu topraklar da yoğğğğ");//şart false  is print eder
    }
}
