public class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String make, String model, int year, int numberOfDoors) {
        super(make, model, year);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void describe() {
        System.out.println("Car: " + getYear() + " " + getMake() + " " + getModel() + ", " + numberOfDoors + " doors.");
    }

    public void honk() {
        System.out.println("Car is honking!");
    }
}