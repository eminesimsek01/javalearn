package j33_Interface.Task02;

public interface Deisel extends Drive{
    abstract void changeDiesel();

    @Override
    default String drive() {
        return Drive.super.drive();
    }
}
