package j19_StaticVariable;

public class C01_OgrtmnRunner {
    public static void main(String[] args) {
        C01_Ogrtmn hc1=new C01_Ogrtmn("Cüneyt", 11);
        System.out.println("hc1.tecrübe = " + hc1.tecrübe);//11
        System.out.println("hc1.isim = " + hc1.isim);//cüneyt
        // hc1.okul="kabadaş";
        System.out.println("hc1.okul = " + hc1.okul);

        C01_Ogrtmn.okul="KABATAŞ ERKEK LİSESİ";//Güneş değeri değişti
        //update oldu
        C01_Ogrtmn hc2=new C01_Ogrtmn("Bekir",7);
        System.out.println("hc2.tecrübe = " + hc2.tecrübe);//7
        System.out.println("hc2.isim = " + hc2.isim);//bekir
        //hc2.okul="kabataş";
        System.out.println("hc2.okul = " + hc2.okul);

        C01_Ogrtmn hc3=new C01_Ogrtmn("hamza",13);
        System.out.println("hc3.isim = " + hc3.isim);
        System.out.println("hc3.tecrübe = " + hc3.tecrübe);
        // hc3.okul="gabadaş";
        System.out.println("hc3.okul = " + hc3.okul);
        hc1.evlilikYıldonumu();//obje ile nonstatic method call ettik.
        C01_Ogrtmn.maasHesapla();//Class name ile static method call edildi.

    }


}
