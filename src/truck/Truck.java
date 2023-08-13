package truck;

public class Truck extends Transport {


    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void doServise() {
        System.out.println("Обслуживаем " + this.getModelName());
        updateTyre();
        checkEngine();
        checkTrailer();
    }

    @Override
    public String toString() {
        return "Truck{" + super.toString();
    }
}
