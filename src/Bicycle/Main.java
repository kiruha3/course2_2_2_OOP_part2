package Bicycle;

public class Main {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle("Stels", 2);
        System.out.println("У велосипеда " + bicycle.getModelName() + "надо сменить покрышку под номером : " + bicycle.getWheelsCount());
        bicycle.updateTyre()  ;
    }
}