package j36_Map;

import java.util.HashMap;
import java.util.Map;

public class Kartvizit {//pojo-> obj üretecek
    String isim;
    String email;
    String telefon;
    int id=100;

    public Kartvizit(String isim, String email, String telefon, int id) {
        this.isim = isim;
        this.email = email;
        this.telefon = telefon;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Kartvizit{" +
                "isim='" + isim + '\'' +
                ", email='" + email + '\'' +
                ", telefon='" + telefon + '\'' +
                ", id=" + id +
                '}';
    }
}
