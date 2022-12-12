package j26_Inheritance.inheritance02;

import j26_Inheritance.inheritance01.Koyun;
import j26_Inheritance.inheritance01.Paluk;

public class Runner {
    /*
     1)Java'da class'lar arasinda parent(Aile)-child(Cocuk)  relationship(iliski) tanımlanmıştır.
     2)Parent Class'a "super class"   Child Class'a "sub class"  denir.
     3)Ortak ozellikler parent class'a, specific ozellikler child class'a tanımlanır.
     4)Parent Child Relationship "reusability", "maintenance",  "less code", "well organization" avantajları içim kullanılır.
     5)Child classlar parent'lardaki her methodu ve variable'i  kullanabilir ama parent class child'dakileri kullanamaz.
     6)Java "Multiple Inheritance"'i desteklemez. Yani; Java'da  bir Child Class'in 1'den fazla parent'i olamaz.
     7)Bir parent class, 1'den fazla child class ile olusturulan  parent child relationship'e "Hierarchical Inheritance"
       denir.
     8)Child-Parent-Grandparent... seklinde olusturulan cok katli  parent child relationshipe'e multi-level inheritance denir.
     9)"Object Class" -> Hz.Adem Class :) butun classlarin parent class'idir. Java'da parent class'i olmayan tek class "Object Class"dir

    */

    public static void main(String[] args) {
        //Datatype objName
        Kedi k1=new Kedi();
        System.out.println("k1.a = " + k1.a);//0->Hayvancık class call
        System.out.println("k1.a = " + k1.c);//2-> Kedi class call
        System.out.println("k1.a = " + k1.d);//5-> Kedi class call
        System.out.println("k1.a = " + k1.m);//1->Mammal class call

                /*
         Method cagirilirken ayni isimli methodlardan
         hangisinin kullanilacagina Constructor karar verir.
         Methodlari arastirmaya Consctuctor ismini tasiyan
         class'dan baslayin ve parentlarda arastirmaya devam edin.
         */

        k1.ma();//Hayvancık class call
        k1.mC();//Kedi class call
        k1.mM();//Mammal calss call

                /*
          Ayni isimli variable'lardan hangisinin kullanildi
        olusturulan object'in data type'ina göre bilinir
        Variable'i arastirmaya data type'i classindan baslanır.
        */
        Mammal k2=new Kedi("Kevser");//Datatypeî parent mammal class Cons -> parametreli cons kedi classtan
        System.out.println(k2.c);
        System.out.println(k2.a);
        //k2.d->CTE K2 objesi data type'ı mammal class d varible yok call edilemez.
        k2.ma();//mA-> HAYVANCIK method call 
        k2.mC();//mC-> Kedi class method call
        k2.mM();//mM-> Mammal class method call

        Hayvancık k3=new Kedi();
        System.out.println("k3.m = " + k3.m);
        //k3.c-> Dtattype Hayvancık Class olduğu için Class'da olmayan c variable'ı çağrılamaz.
        System.out.println("k3.a = " + k3.a);

      k3.ma();//Hayvancık class method call
      k3.mM();//Mammal class method call
        Mammal m1=new Mammal ('$');
        System.out.println("m1.m = " + m1.m);//1
        System.out.println("m1.a = " + m1.a);//0
        System.out.println("m1.c = " + m1.c);//4
        // m1.d-> parent Mammal Class Child Kedi Class'dan variable call edemez
        m1.ma();//Hayvancık class call
        m1.mC();//Mammal class call
        m1.mM();//Mammal class method call


    }
}
