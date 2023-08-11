package Truck;

public interface Interface {
    default void updateTyre() {
        System.out.println("Нет инфы");
    }

    ;

    default void checkEngine() {
        System.out.println("Нет инфы");
    }

    ;

    default void checkTrailer() {
        System.out.println("Нет инфы");
    }

    ;
}
