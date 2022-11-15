package j32_Abstract.abstract02;

public class IdariPersonel extends Personel {

    @Override//personel parent classtand override abs method
    public void maasHesapla() {
        System.out.println("agam frapan iadrecimize saatine 12$");
    }

    @Override
    public void sigorta() {//tercihen override edildi
        super.sigorta();
    }

    @Override//personel parent classtand override abs method
    public void maasBilgisi() {
        System.out.println("agam cıncık kod yapan idarecimiize ekstra biy ikramiye");
    }
}
