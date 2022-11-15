package LaptopStore;

public class Main {
    public static void main(String[] args) {
        PriceforOneLaptop priceOneForLaptop = new PriceforOneLaptop ();

        System.out.println("Eklenecek Fiyat: " + priceOneForLaptop.getPrice(110001));
    }
}
