package LaptopStore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Data {
    public ArrayList<String>allData(int laptopID){
        //5 farklı ürün için 5 farklı list create edeceğiz
        //Marka, size(min, max, middle), Ram(32, 16, 8, 4), CPU (İ3, İ5, İ7), Color(black, orange, silver, red)
        Map<Integer,ArrayList<String>> allData=new HashMap<>();
        ArrayList<String>l1=new ArrayList<>();
        l1.add("Apple");
        l1.add("middle");
        l1.add("32 gb");
        l1.add("i5");
        l1.add("Black");
        allData.put(110001,l1);

        ArrayList<String>l2=new ArrayList<>();
        l2.add("Lenovo");
        l2.add("min");
        l2.add("8 gb");
        l2.add("i3");
        l2.add("Silver");
        allData.put(110002,l2);

        ArrayList<String>l3=new ArrayList<>();
        l3.add("Smasung");
        l3.add("max");
        l3.add("16 gb");
        l3.add("i7");
        l3.add("Red");
        allData.put(110003,l3);

        ArrayList<String>l4=new ArrayList<>();
        l4.add("Asus");
        l4.add("max");
        l4.add("8 gb");
        l4.add("i7");
        l4.add("Purple");
        allData.put(110004,l4);

        ArrayList<String>l5=new ArrayList<>();
        l4.add("Apple");
        l4.add("max");
        l4.add("8 gb");
        l4.add("i7");
        l4.add("Purple");
        allData.put(110004,l4);

        return allData.get(laptopID);
    }
}
