package j32_Abstract.abstract02;

public abstract class Personel {
    String name="Nur Hanım";

    public abstract void maasHesapla();//abs. method
    public abstract void maasBilgisi();//abs.method

    public void sigorta(){
        System.out.println("Agam özel sigorta kapsamındasınız :)");//Conc. method
    }
}
