package j36_Map;

import java.util.HashMap;
import java.util.Map;

public class Task02 {
    /*
    Task->
    Key: isim, email, adres, telefon
    Key'lere ait value'ları depolayan
     */
    public static void main(String[] args) {
        Map<String, String> nazımKrtvzt = new HashMap<>();
        nazımKrtvzt.put("isim", "Nazım");
        nazımKrtvzt.put("email", "ebik@gabık.com");
        nazımKrtvzt.put("adres", "büyük dut ağacının altı");
        nazımKrtvzt.put("telefon", "1456789");

        Map<String, String> mehmetKrtvzt = new HashMap<>();
        mehmetKrtvzt.put("isim", "mehmet");
        mehmetKrtvzt.put("email", "ebik@gabıkcom");
        mehmetKrtvzt.put("adres", "büyük elma ağacının altı");
        mehmetKrtvzt.put("telefon", "123456890");

        Map<String, Map<String, String>> kartvizit = new HashMap<>();
        kartvizit.put("QA Nazım", nazımKrtvzt);
        kartvizit.put("Dev Mehmet", mehmetKrtvzt);
        System.out.println("kartvizit = " + kartvizit);

        System.out.println("kartvizit.get(\"Dev Mehmet\").get(\"telefon\") = " + kartvizit.get("Dev Mehmet").get("telefon"));
        Map<Integer, Kartvizit> krt = new HashMap<>();
        Kartvizit k1 = new Kartvizit("Enise", "enise@tester.com", "google company", 1905);
        krt.put(k1.id, k1);
        System.out.println("krt = " + krt);
        System.out.println("krt.get(k1.id) = " + krt.get(k1.id));//krt.get(k1.id) = Kartvizit{isim='Enise', email='enise@tester.com', telefon='google company', id=1905}
        System.out.println("krt.get(101) = " + krt.get(1905));//krt.get(101) = Kartvizit{isim='Enise', email='enise@tester.com', telefon='google company', id=1905}
    }
}


