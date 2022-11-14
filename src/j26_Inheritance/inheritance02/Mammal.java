package j26_Inheritance.inheritance02;

public class Mammal extends Hayvancık {//Hayvancık parent class'ın child class-baba
    public Mammal() {//p'siz constructor
        this('Y');
        System.out.println("Agam ahan da Mammal p'siz consctuctor...");
    }
    public Mammal(char c) {//p'li constructor
        super(17);
        System.out.println("Agam ahan da Mammal p'li consctuctor...");
    }
    public void mC() {
        System.out.println("mC -> Mammal class meth call ");
    }
    int m=1;
    int c=4;

    @Override
    public void mM() {//parenttan ezen method
        System.out.println("mM -> Mammal class meth call ");
    }
}//class sonu
