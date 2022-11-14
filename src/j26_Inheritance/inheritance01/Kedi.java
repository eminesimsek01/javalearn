package j26_Inheritance.inheritance01;

public class Kedi extends Mammal {//Mammal parent class Mammal child class-torun
        /*
        Child class obje olmadan parent class variable ve methodlara ulaşabilir.
         */

    public Kedi() {
        System.out.println("agam ahan da kedi...");
    }
    public void cırmala(){
        System.out.println("kedi fena cırmalar, miyavlar...");
    }

}
