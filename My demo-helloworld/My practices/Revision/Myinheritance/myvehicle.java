public class myvehicle {
    private String make;
    private String model;
    private int year;

    public void Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // getters and setters omitted for brevity
}

public class Car extends Vehicle {
    private int numDoors;
    private int numSeats;

    public Car(String make, String model, int year, int numDoors, int numSeats) {
        super(make, model, year);
        this.numDoors = numDoors;
        this.numSeats = numSeats;
    }

    // getters and setters omitted for brevity
}

public class Truck extends myvehicle {
    private int numWheels;
    private double payloadCapacity;

    public Truck(String make, String model, int year, int numWheels, double payloadCapacity) {
        super(make, model, year);
        this.numWheels = numWheels;
        this.payloadCapacity = payloadCapacity;
    }

    // getters and setters omitted for brevity
}

public class Main {
    public static void main(String[] args) {
        myvehicle myvehicle = new myvehicle("Toyota", "Corolla", 2021);
        Car car = new Car("Honda", "Accord", 2022, 4, 5);
        Truck truck = new Truck("Ford", "F-150", 2020, 4, 1.5);

        System.out.println("Vehicle: " + myvehicle.getMake() + " " + myvehicle.getModel() + " (" + myvehicle.getYear() + ")");
        System.out.println("Car: " + car.getMake() + " " + car.getModel() + " (" + car.getYear() + "), " + car.getNumDoors() + " doors, " + car.getNumSeats() + " seats");
        System.out.println("Truck: " + truck.getMake() + " " + truck.getModel() + " (" + truck.getYear() + "), " + truck.getNumWheels() + " wheels, " + truck.getPayloadCapacity() + " tons payload capacity");
    }
}