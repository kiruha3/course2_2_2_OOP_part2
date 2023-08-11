package Car;

public class CarSedan extends Car {
    private int would;

    public CarSedan(String modelName, int wheelsCount, int would) {
        super(modelName, wheelsCount);
        this.would = would;
    }

    public int isBucket() {
        return would;
    }

    @Override
    public String toString() {
        return "CarTruck{" + super.toString() + " bucket=" + would + "} ";
    }
}
