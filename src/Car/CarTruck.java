package Car;

public class CarTruck extends Car {
    private boolean bucket;

    public CarTruck(String modelName, int wheelsCount, boolean bucket) {
        super(modelName, wheelsCount);
        this.bucket = bucket;
    }

    public boolean isBucket() {
        return bucket;
    }

    @Override
    public String toString() {
        return "CarTruck{" + super.toString()+
                " bucket=" + bucket +
                "} " ;
    }
}
