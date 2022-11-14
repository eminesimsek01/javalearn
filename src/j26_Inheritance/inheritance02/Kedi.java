package j26_Inheritance.inheritance02;

public class Kedi extends Mammal {//Mammal parent class Mammal child class-torun
        /*
        Child class obje olmadan parent class variable ve methodlara ulaşabilir.
         */

    public Kedi() {

        System.out.println("agam ahan da kedi...");
    }

    public Kedi(String str) {
        this();
        System.out.println(super.c);
        System.out.println("agam ahan da kedi p'li cons..");
    }
     int c=2;
     int d=5;

    @Override
    public void mC() {//Parentten ezen method
        System.out.println("mC-> Kedi class method call. ");
    }
}//Class sonu
