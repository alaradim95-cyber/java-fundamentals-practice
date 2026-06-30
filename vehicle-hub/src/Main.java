public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Corolla", 2020, 4);
        Bike bike = new Bike("Giant", "Escape", 2019, "Mountain");

        car.describe();
        car.startEngine();
        car.honk();

        System.out.println();

        bike.describe();
        bike.startEngine();
        bike.ringBell();

        System.out.println();

        car.setModel("Camry");
        bike.setType("Road");

        System.out.println("Updated car model: " + car.getModel());
        System.out.println("Updated bike type: " + bike.getType());
    }
}