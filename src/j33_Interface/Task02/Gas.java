package j33_Interface.Task02;

public interface Gas extends Drive{
    abstract void changeOil();

    @Override
    default String drive() {
        return Drive.super.drive();
    }
}
