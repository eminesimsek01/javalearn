package j18_Constructor;

public class C03_Student { // main olmayan sadece student obj create etmek için proje-> plan object java old: için
    //standart class kalıphane
    String ad;
    String soyad;
    int sınıf;
    double ortalama;
    int okulNo;
    boolean takdir;

    @Override
    public String toString() {
        return "C03_Student{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", sınıf=" + sınıf +
                ", ortalama=" + ortalama +
                ", okulNo=" + okulNo +
                ", takdir=" + takdir +
                '}';
    }


    public void mezuniyet(){//method
        if (ortalama>=50){
            System.out.println("agam diploman hayırlı olsun :)");
        } else System.out.println(" agam seneye de bekleriz, dewamkee");


    }


}
