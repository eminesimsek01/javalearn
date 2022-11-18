package j33_Interface.Task02;

public  class Bus extends Vehicle implements Drive, Deisel{
    public Bus(String model, double motor) {
        super(model, motor);
    }

    @Override
    public void changeDiesel() {

    }

    @Override
    public String drive() {
        return Deisel.super.drive();
    }
}
