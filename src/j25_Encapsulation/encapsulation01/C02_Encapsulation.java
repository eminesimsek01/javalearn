package j25_Encapsulation.encapsulation01;

public class C02_Encapsulation {

       private String name="Gamze Hanım";
       private  int id=1001;
       public C02_Encapsulation() {

       }

    public C02_Encapsulation(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public String isimVer() {
        return name;
    }

    public int idVer() {
        return id;
    }
    public void isimDegis(String isim){
           this.name=isim;
    }

    @Override
    public String toString() {
        return "C02_Encapsulation{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }


}
