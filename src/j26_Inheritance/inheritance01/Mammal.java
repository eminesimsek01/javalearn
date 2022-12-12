package j26_Inheritance.inheritance01;

public class Mammal extends Hayvancık {//Hayvancık parent class'ın child class-baba
    public Mammal() {//p'siz constructor
        System.out.println("Agam ahan da Mammal p'siz consctuctor...");
    }
    public void sutBeslenme(){
        System.out.println("bebeleri süt ile besler....");
    }
    public void dogum(){
        System.out.println("nur topu gibi yavrısı olur");
    }
}

