package j20_PassbyValue;

public class C02_PassByValue {
    public static void main(String[] args) {
        //task -> Verilen fiyat için yüzde11, yüzde 22 ve yüzde 33 indirimli fiyatı rint eden method create ediniz.
        double fiyat=100;
        System.out.println("method call öncesi fiyat değeri "+fiyat);
        System.out.println("yuzdeonbir(fiyat) = " + yuzdeonbir(fiyat));
        System.out.println("yuzdeyirmiiki(fiyat) = " + yuzdeyirmiiki(fiyat));
        System.out.println("yuzdeotuzuc(fiyat) = " + yuzdeotuzuc(fiyat));
        System.out.println("method call sonrası fiyat değeri "+fiyat);
    }

    private static double yuzdeotuzuc(double fiyat) {

        return fiyat*=0.67;
    }

    private static double yuzdeyirmiiki(double fiyat) {
        return fiyat*=0.78;
    }

    private static double yuzdeonbir(double fiyat) {
        return fiyat*=0.89;
    }


}
