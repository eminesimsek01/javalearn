package j26_Inheritance.task01;

public class Runner {
    public static void main(String[] args) {
        A a=new A();
        System.out.println("a.mesaj = " + a.mesaj);//"Agam'a A classtan selam"
        B b=new B();
        System.out.println("b.mesaj = " + b.mesaj);//"static variable inheritance'da class name olmadan call edilir"
    }

}
