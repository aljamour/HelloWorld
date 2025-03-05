package Uge5.encapsulation.inheritance.motorregister.models;

public class Motorcycle extends Vehicle { // Subclass
    private int engineSize;

    public Motorcycle (String licensePlate, String brand, int year, int mileage, int engineSize){
        super(licensePlate, brand, year, mileage);
        this.engineSize = engineSize;
    }

    public int getEngineSize(){
        return engineSize;
    }

    public void setEngineSize(int engineSize){
        if (engineSize > 0) {
            this.engineSize = engineSize;
        }
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("Motorstørrelse: " + engineSize + " CC");
    }

    public String toString(){
        return super.toString() + "\nMotorstørrelse: " + engineSize + " CC";
    }
}
