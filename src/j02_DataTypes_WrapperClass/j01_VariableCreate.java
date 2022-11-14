package j02_DataTypes_WrapperClass;

public class j01_VariableCreate {
    public static void main(String[] args) {
        //1.yol -> best practice (Recommended) tavsiye edilen
        int yas = 30;
        int maas = 50000;
        System.out.println(yas);// yasın karsılıgını, degiskenin değerini yazdırır
        System.out.println(maas);
        System.out.println("Emine Hanım Baslangıc Maası: " +maas);
        System.out.println(maas); // degisken. direkt degiskeni yazdırr
        int boy; // 2. yol değeri atanmayan boy isminde bir integer atandı
        // degeri atanmamıs boy hicbir aksiyonda kullanılamaz.
        //initialize etmek ilk deger atamaktır.
        //Bir değere atamadığımız zaman tekrar tekrar kullanamayız
        boy=175;
        System.out.println(boy);
        // 3. yol
        int yevmiye, age, kilo;// birden çok aynı tipte değişken atandı
        age=30;
        yevmiye=2000;
        kilo=51;//tanımlama değişken ataması yapıldı..

        int gunluk=1500, yil=2022, agırlık=50;
        //trıck: variable sadece bir kez kullanılabilir
        // System.out.println(gunluk);//1500
        gunluk=1800; // gunluk yeni degeri 1800. Update edilen degeri yazar
        System.out.println(gunluk);
        System.out.println("gunluk degeri:"+gunluk+" yıl değeri: "+yil+" yevmiye degeri: "+yevmiye+" agırlık degeri: "+agırlık);


    }
}
