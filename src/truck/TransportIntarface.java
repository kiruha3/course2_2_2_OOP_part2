package truck;

public interface TransportIntarface {
    default void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    default void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    default void checkTrailer() {
        System.out.println("Проверяем трейлер");
    }

   void doServise() ;

}
