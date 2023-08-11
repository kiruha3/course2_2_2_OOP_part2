package Car;

public class Main {
    public static void main(String[] args) {
        CarTruck bigCar = new CarTruck("MAN",6,true);
        CarSedan smallCar = new CarSedan("Wolkswagen",4,50);
        System.out.println("bigCar.toString() = " + bigCar.toString());
        bigCar.updateTyre();
        bigCar.checkEngine();
        System.out.println("smallCar.toString() = " + smallCar.toString());
        smallCar.updateTyre();
        smallCar.checkEngine();

    }
}