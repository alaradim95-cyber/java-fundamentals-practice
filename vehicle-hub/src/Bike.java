public class Bike extends Vehicle {
    private String type;

    public Bike(String make, String model, int year, String type) {
        super(make, model, year);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void describe() {
        System.out.println("Bike: " + getYear() + " " + getMake() + " " + getModel() + ", Type: " + type + ".");
    }

    public void ringBell() {
        System.out.println("Bike bell is ringing!");
    }
}