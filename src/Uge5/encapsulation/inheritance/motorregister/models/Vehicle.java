package Uge5.encapsulation.inheritance.motorregister.models;

public class Vehicle { // Super class
    private String licensePlate;
    private String brand;
    private int year;
    private int mileage;

    public Vehicle (){
    }

    public Vehicle (String licensePlate, String brand, int year, int mileage) {
        this.licensePlate = licensePlate;
        this.brand = brand;
        this.year = year;
        this.mileage = mileage;
    }

    public void drive(int km){
        if (km > 0) {
            this.mileage += km;
        }
    }

    public String getLicensePlate(){
        return licensePlate;
    }

    public String getBrand(){
        return brand;
    }

    public int getYear(){
        return year;
    }

    public int getMileage(){
        return mileage;
    }

    public void setMileage(int mileage){
        this.mileage = mileage;
    }

    public void printInfo(){
        System.out.println("Bilens nummerplade: " + licensePlate +
                "Mærket er: " + brand +
                "Fra årgang: " + year +
                "Har kørt: " + mileage);
    }

    public String toString(){
        return "\nNummerplade: " + licensePlate +
                "\nMærket er: " + brand +
                "\nÅrgang: " + year +
                "\nKørt: " + mileage + " km";
    }
}
