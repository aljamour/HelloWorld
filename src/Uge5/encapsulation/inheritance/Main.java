package Uge5.encapsulation.inheritance;

import Uge5.encapsulation.inheritance.motorregister.models.Car;
import Uge5.encapsulation.inheritance.motorregister.models.Motorcycle;
import Uge5.encapsulation.inheritance.motorregister.models.Vehicle;
import Uge5.encapsulation.inheritance.motorregister.services.Registry;

public class Main {
    public static void main(String[] args) {
        Registry registry = new Registry(5);

        Vehicle car = new Car("CU39P88", "BMW", 2025, 5129, "Diesel");
        Vehicle car2 = new Car("PL11732", "Toyota", 2018, 109662, "Hybrid");
        Vehicle bike = new Motorcycle("MC98", "Kawasaki", 2025, 11_315, 1000);
        Vehicle bike2 = new Motorcycle("BY20", "Aprilia", 2023, 53977, 750);
        Vehicle bike3 = new Motorcycle("RX66", "Ducati", 2024, 2498, 900);

        registry.addVehicle(car);
        registry.addVehicle(car2);
        registry.addVehicle(bike);
        registry.addVehicle(bike2);
        registry.addVehicle(bike3);

        System.out.println("ZIS IZ MY GARAGJE");
        System.out.println("MINE BILER:\n");

        System.out.println("Bil 1\n" + car);
        System.out.println("\nBil 2\n" + car2);


        System.out.println("\nMINE MOTORCYKLER");
        System.out.println("\nMotorcykel 1\n" + bike);
        System.out.println("\nMotorcykel 2\n" + bike2);
        System.out.println("\nMotorcykel 3\n" + bike3);
    }
}
