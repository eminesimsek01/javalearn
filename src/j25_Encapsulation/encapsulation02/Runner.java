package j25_Encapsulation.encapsulation02;

public class Runner {
    public static void main(String[] args) {
        Kisi kisi=new Kisi("emine","S","eminel",30);//obje create edildi.
        System.out.println("kisi.ad = " + kisi.ad);
        kisi.ad="Beautiful";
        System.out.println("kisi.ad = " + kisi.ad);
        System.out.println("kisi.soyad = " + kisi.soyad);
        System.out.println("kisi.getPassword() = " + kisi.getPassword());
        kisi.setYas(-23);
        System.out.println("kisi.getYas() = " + kisi.getYas());
    }
}
