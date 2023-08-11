package Truck;

import ServiceStation.Interface;

public class Truck implements Interface {
    private String modelName;
    private int wheelsCount;

    public Truck(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    @Override
    public String toString() {
        return "Car{" +
                "Название модели='" + modelName + '\'' +
                ", Количество колес=" + wheelsCount +
                '}';
    }

//    public void checkTrailer() {
//        System.out.println("Проверяем трейлер");
//    }
}
