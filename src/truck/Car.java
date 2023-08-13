package truck;

public class Car extends Transport {


    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void doServise() {
        System.out.println("Обслуживаем " + this.getModelName());
        updateTyre();
        checkEngine();
    }

    @Override
    public String toString() {
        return "Car{" + super.toString();
    }
}
