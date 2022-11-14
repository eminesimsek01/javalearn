package j25_Encapsulation.encapsulation03;

public class Runner { //3.step
    public static void main(String[] args) {
        //4.step
        Arac arac1=new Arac();
        Arac arac2=new Arac("Peugeot","kırmızı",2,2022);
        Arac arac3=new Arac("Honda","Mavi",2,-2022);
        arac1.setModel("Audi");
        arac1.setMotor(700);
        arac1.setYıl(2022);
        arac1.setRenk("Mavi");
        System.out.println("Audi ne ararsan var onda"+arac1);
        System.out.println(arac2);
        System.out.println(arac3);;
    }
}
