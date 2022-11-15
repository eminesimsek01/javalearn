package LaptopStore;

import java.util.ArrayList;

public class PriceforOneLaptop
{
    public int getPrice(int laptopID){
        Data pcPrice=new Data();
        ArrayList<String> pc=pcPrice.allData(laptopID);

        int totalAmount=Calculation.getSize(pc)+Calculation.getCPU(pc)+Calculation.getRam(pc)+Calculation.getSize(pc);

        return totalAmount;
    }
}
