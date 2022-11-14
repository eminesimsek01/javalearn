package j26_Inheritance.inheritance01;

public class Runner {
    /*
     1)Java'da class'lar arasinda parent(Aile)-child(Cocuk)  relationship(iliski) tanımlanmıştır.
     2)Parent Class'a "super class"   Child Class'a "subclass"  denir.
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
        Hayvancık hayvan = new Hayvancık();
        hayvan.hareket();
        hayvan.içme();
        hayvan.beslenme();


        System.out.println("  ***********    ");


        Mammal m1 = new Mammal();
        m1.hareket();//parent Hayvancık class call
        m1.içme();//parent Hayvancık class call
        m1.beslenme();//parent haycancık class call
        m1.dogum();//child normal class call
        m1.sutBeslenme();//child normal class

        System.out.println(" *************** ");
        Paluk hms=new Paluk();
        hms.ızgaraTava();//parent class call
        hms.beslenme();//parent class call
        hms.içme();//parent class call

        System.out.println(" ***************** ");
        Kedi kedi =new Kedi ();
        kedi.beslenme();
        kedi.içme();
        kedi.dogum();
        kedi.cırmala();
        kedi.sutBeslenme();
        kedi.hareket();

        System.out.println(" ******************** ");
        Koyun koyun=new Koyun();
        koyun.içme();
        koyun.beslenme();
        koyun.hareket();
        koyun.sutBeslenme();
        koyun.semir();
    }
}
