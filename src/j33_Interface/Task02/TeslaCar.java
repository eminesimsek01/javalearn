package j33_Interface.Task02;

public class TeslaCar extends Vehicle implements Electric  {

    public TeslaCar(String model, double motor) {
        super(model, motor);
    }

    @Override
    public void changeBattery() {
        System.out.println("Enerji krizi var, ona göre kullanasun");
    }
}
