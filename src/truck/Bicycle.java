package truck;

public class Bicycle extends Transport {


    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void doServise() {
        System.out.println("Обслуживаем " + this.getModelName());
        updateTyre();
    }

    @Override
    public String toString() {
        return "Bicycle{" + super.toString();
    }
}
