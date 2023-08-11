package ServiceStation;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Wolksvagen",4);
        Bicycle bicycle = new Bicycle("Stells",2);
        car=null;
        Truck truck = new Truck("MAN",8);
        ServiceStation serviceStation = new ServiceStation();
        serviceStation.check(car,bicycle,truck);
    }
}