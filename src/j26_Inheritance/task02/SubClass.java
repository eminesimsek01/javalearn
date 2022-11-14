package j26_Inheritance.task02;

public class SubClass extends SuperClass{
    int num= 10;
    @Override
    public void goster() {
        System.out.println("Bu method  subclass'ın görüntüleme yöntemidir.");
    }
    public void mymethod(){
        goster();
        super.goster();
        System.out.println("object.num = " + num);
        System.out.println("super.num = " + super.num);
    }
    public static void main(String[] args) {
        SubClass object=new SubClass();
        object.mymethod();
    }
}
