package j18_Constructor;

public class C01_Constructor {
    /*
        1-Constructor ismi Class name ile aynı olmalı, yanı Büyükharf ile başlamalı.
        2-Constructor create edildiğinde name'den sonra () {} mutlaka kullanılmalı.
        3-Eğer p'li cons. create edildiğinde java default cons ezer(siler).
        4-cons. return type'ı olmaz, methoddan ayıran özelliği budur.
        5-Class oluştuğunda java default cons. kendi create eder.
         */
        // C01_Constructor obj1 =new C01_Constructor();
         String str; //ins variable-> obj variable
         String selam="güzel insan" ;
    public static void main(String[] args) {
        //class name  obje name     new keyword default cons
        C01_Constructor  obj1   =  new C01_Constructor();
        C01_Constructor  obj2   =  new C01_Constructor();
        C01_Constructor  obj3   =  new C01_Constructor();
        C01_Constructor  obj4   =  new C01_Constructor();
       obj1.str="javacan";//str ins. variable obj1 ile call edilerek obj1 değeri atandı.
        obj2.str="javatar";//str ins. variable obj2 ile call edilerek obj1 javatar değeri atandı.
        System.out.println(obj3.selam);//"güzel insan"
        System.out.println(obj1.str);
        System.out.println(obj2.str);
        System.out.println(obj4.str);
        obj3.aga();//agama selamkee :)
        obj2.aga();
    }

    public void aga() {
        System.out.println("agama selamkee :)");
    }
}
