package j33_Interface.Task02;

import java.util.ArrayList;
import java.util.List;

public class Vehicle {
    String model;
    double motor;

    public Vehicle(String model, double motor) {
        this.model = model;
        this.motor = motor;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "model='" + model + '\'' +
                ", motor=" + motor +
                '}';
    }

    public static void main(String[] args) {
        TeslaCar teslaobj = new TeslaCar("Tesla",2000);
        ToyotaPrius toyotaobj = new ToyotaPrius("Toyota",2.0);
        Bus busobj =new Bus("Mercedes",2000);

        List<Vehicle> vehicleList = new ArrayList<Vehicle>();
        vehicleList.add(teslaobj);
        vehicleList.add(busobj);
        vehicleList.add(toyotaobj);

        for (int i=0; i<vehicleList.size(); i++){
            System.out.println(vehicleList.get(i));
        }

        /*
        System.out.println("******tesla*********");
        teslaobj.changeBattery();
        System.out.println("teslaobj.motor = " + teslaobj.motor);
        System.out.println("teslaobj.model = " + teslaobj.model);
        System.out.println("teslaobj.drive() = " + teslaobj.drive());

        System.out.println("********toyota*********");

        System.out.println("toyotaobj.model = " + toyotaobj.model);
        System.out.println("toyotaobj.motor = " + toyotaobj.motor);
        toyotaobj.changeOil();
        System.out.println("toyotaobj.drive() = " + toyotaobj.drive());
        toyotaobj.changeBattery();

        System.out.println("********bus*********");
        System.out.println("busobj.model = " + busobj.model);
        System.out.println("busobj.motor = " + busobj.motor);
        busobj.changeDiesel();
        System.out.println("busobj.drive() = " + busobj.drive());
        */

    }


}
