package mypackage;

public class Car {
    public static void aboutCar() {
        System.out.println("A car is a four-wheeled road vehicle.");
    }

    public void drive() {
        System.out.println("Car moves ahead 1m.");
    }

    public void startEngine() {
        System.out.println("Starting engine...");
        System.out.println("Engine started!");
        startAircon();
        startRadio();
        checkSeatBelts();
    }

    private void startAircon() {
        System.out.println("Aircon started!");
    }

    private void startRadio() {
        System.out.println("Radio started!");
    }

    private void checkSeatBelts() {
        System.out.println("Seat belts checked!");
    }
}
