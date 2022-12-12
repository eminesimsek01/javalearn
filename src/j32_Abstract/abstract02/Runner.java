package j32_Abstract.abstract02;

public class Runner {
    public static void main(String[] args) {
        Isci mrb1=new Isci();
        mrb1.maasBilgisi();
        mrb1.maasHesapla();
        mrb1.name="Ali";
        System.out.println(mrb1.name);
        mrb1.sigorta();//abs parent classtaki conc method call//Agam özel sigorta kapsamındasınız :)
        IdariPersonel cncCdr=new IdariPersonel();
        cncCdr.name="Emine Şimşek ";
        System.out.println(cncCdr.name);//Emine Şimşek
        cncCdr.maasBilgisi();;//agam cıncık kod yapan idarecimiize ekstra biy ikramiye
        cncCdr.maasHesapla();//agam frapan iadrecimize saatine 12$
    }

}
