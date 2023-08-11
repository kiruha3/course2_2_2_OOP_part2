package Bicycle;

public class Main {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle("Stels", 2);
        System.out.println("У велосипеда " + bicycle.getModelName() + "Покрышек : " + bicycle.getWheelsCount());
        bicycle.updateTyre()  ;
    }
}