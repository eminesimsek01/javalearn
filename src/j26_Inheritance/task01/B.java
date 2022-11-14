package j26_Inheritance.task01;

public class B extends A {
    public B() {
        //Child parent ilişkisi olmsa static variable'ı class adıyla çağırırdık.
        mesaj="static variable inheritance'da class name olmadan call edilir";
    }
}
