package j33_Interface.Task02;

public interface Electric extends Drive {
    abstract void changeBattery();

    @Override
    default String drive() {
        return Drive.super.drive();
    }
}
