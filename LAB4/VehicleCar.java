class Vehicle {
    String model;
    int year;

    public Vehicle(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public void displayInfo() {
        System.out.println("Vehicle Model: " + model + ", Year: " + year);
    }
}

class Car extends Vehicle {
    int numDoors;
    String fuelType;

    public Car(String model, int year, int numDoors, String fuelType) {
        super(model, year);
        this.numDoors = numDoors;
        this.fuelType = fuelType;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Doors: " + numDoors + ", Fuel Type: " + fuelType);
    }
}

public class VehicleCar {
    public static void main(String[] args) {
        Car car = new Car("Toyota Camry", 2022, 4, "Petrol");
        car.displayInfo();
    }
}
