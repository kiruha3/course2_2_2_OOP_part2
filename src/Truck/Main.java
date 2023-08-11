package Truck;

import ServiceStation.Bicycle;
import ServiceStation.Car;
import ServiceStation.ServiceStation;
import ServiceStation.Truck;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("car1", 4);
        Car car2 = new Car("car2", 4);

        Truck truck = new Truck("truck1", 6);
        Truck truck2 = new Truck("truck2", 8);

        Bicycle bicycle = new Bicycle("bicycle1", 2);
        Bicycle bicycle2 = new Bicycle("bicycle2", 2);


        ServiceStation station = new ServiceStation();
        station.check(car, null, null);
        System.out.println("\"\" = " + "");
        station.check(car2, null, null);
        System.out.println("\"\" = " + "");
        station.check(null, bicycle, null);
        System.out.println("\"\" = " + "");
        station.check(null, bicycle2, null);
        System.out.println("\"\" = " + "");
        station.check(null, null, truck);
        System.out.println("\"\" = " + "");
        station.check(null, null, truck2);
        System.out.println("\"\" = " + "");
    }
}