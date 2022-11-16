package j32_Abstract.abstract02;

public class Isci extends Personel {

    @Override
    public void maasHesapla() {//personel parent classtan override abs method
        System.out.println("agam marabalara en çok yevmiye 499 gayme verilir: ");
    }

    @Override
    public void maasBilgisi() {//personel parent classtand override abs method
        System.out.println("Agam marabalar cay-cüğara hariç günde 8 saat kürek mahkumu ");
    }

}
