package j18_Constructor;

public class C02_Arac {
    String marka;
    String model;
    int km=10;
    boolean ikinciEl;
    double motorHcm;
    boolean vitesAuto=false;
    int yıl;

    @Override
    public String toString() { //tüm obje fieldları print edilir.
        return "C02_Arac{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", km=" + km +
                ", ikinciEl=" + ikinciEl +
                ", motorHcm=" + motorHcm +
                ", vitesAuto=" + vitesAuto +
                ", yıl=" + yıl +
                '}';
    }

    public static void main(String[] args) {
        C02_Arac arac1=new C02_Arac();//default cons ile arac1 create edildi.
        arac1.ikinciEl=true;
        arac1.marka="volvo";
        arac1.km=50000;
        arac1.model="xc60";
        arac1.motorHcm=2.4;
        //                        volvo    xc60        50 000            default=0       true               2.4
        System.out.println(arac1.marka+" "+arac1.model+" "+arac1.km+" "+arac1.yıl+" "+arac1.ikinciEl+" "+arac1.motorHcm);
        //Task-> 2. bir aracın tüm fieldlarını atayarak print ediniz
        C02_Arac arac2=new C02_Arac();
        arac2.ikinciEl=false;
        arac2.marka="peugeot";
        arac2.km=10;
        arac2.model="3008";
        arac2.motorHcm=2.4;
        System.out.println(arac2.marka+" "+arac2.model+" "+arac2.km+" "+arac2.yıl+" "+arac2.ikinciEl+" "+arac2.motorHcm);
        System.out.println(arac1);

    }
}
