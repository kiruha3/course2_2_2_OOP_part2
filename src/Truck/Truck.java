package Truck;

public class Truck extends Transport {


    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public String toString() {
        return "Truck{" + super.toString();
    }
}
