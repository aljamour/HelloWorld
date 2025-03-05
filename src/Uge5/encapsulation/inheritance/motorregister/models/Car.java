package Uge5.encapsulation.inheritance.motorregister.models;

public class Car extends Vehicle { // Subclass
    private String fuelType;

    public Car (String licensePlate, String brand, int year, int mileage, String fuelType) {
        super(licensePlate, brand, year, mileage);
        this.fuelType = fuelType;
    }

    public String getFuelType(){
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("Kører på: " + fuelType);
    }

    public String toString(){
        return super.toString() + "\nKører på: " + fuelType;

    }
}

