package j36_Map;

import java.util.*;

public class Task05 {
    //Task->   TreeMap Kullanarak Bir cumlenin içindeki harflerin frekansını(adetini) hesaplayıp print  code create ediniz
    static Map<String, Integer>harffrekansları=new TreeMap<>();

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir cümle giriniz: ");
        String cümle=scan.nextLine();
        List<String> harffrekanslar=new ArrayList<>(Arrays.asList(cümle.split("")));
        harffrekanslar.removeAll(Collections.singleton(" "));//
        harffrekanslar.removeAll(Collections.singleton("."));
        System.out.println(harffrekanslar);

        for(String w:harffrekanslar){
            if (harffrekansları.containsKey(w)){
                harffrekansları.put(w,harffrekansları.get(w)+1);
            }
            else harffrekansları.put(w,1);
        }
        System.out.println(harffrekansları);
    }
}

