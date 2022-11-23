package DepoYöntemi_Team06;

public class Ürün {
    private String urunIsmi;
    private String uretici;
    private int miktar;
    private String birim;
    private String raf;

    public Ürün(String urunIsmi, String uretici, int miktar, String birim, String raf) {
        this.urunIsmi = urunIsmi;
        this.uretici = uretici;
        this.miktar = miktar;
        this.birim = birim;
        this.raf = raf;
    }

    public String getUrunIsmi() {
        return urunIsmi;
    }

    public String getUretici() {
        return uretici;
    }

    public int getMiktar() {
        return miktar;
    }

    public String getBirim() {
        return birim;
    }

    public String getRaf() {
        return raf;
    }

    public void setUrunIsmi(String urunIsmi) {
        this.urunIsmi = urunIsmi;
    }

    public void setUretici(String uretici) {
        this.uretici = uretici;
    }

    public void setMiktar(int miktar) {
        this.miktar = miktar;
    }

    public void setBirim(String birim) {
        this.birim = birim;
    }

    public void setRaf(String raf) {
        this.raf = raf;
    }

    @Override
    public String toString() {
        return "Ürün{" +
                "urunIsmi='" + urunIsmi + '\'' +
                ", uretici='" + uretici + '\'' +
                ", miktar=" + miktar +
                ", birim='" + birim + '\'' +
                ", raf='" + raf + '\'' +
                '}';
    }
}
