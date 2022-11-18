package j33_Interface.Task02;

public class ToyotaPrius extends Vehicle implements Electric,Gas {
    public ToyotaPrius(String model, double motor) {
        super(model, motor);
    }

    @Override
    public void changeBattery() {
        System.out.println(" Bataryan bitmek üzere toyota ");
    }

    @Override
    public String drive() {
        return Electric.super.drive();
    }

    @Override
    public void changeOil() {
        System.out.println("Göstergeye hiç bakmıyorsun galiba toyota");

    }
}
