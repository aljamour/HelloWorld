package Uge5.encapsulation.inheritance.motorregister.services;
import Uge5.encapsulation.inheritance.motorregister.models.Vehicle;

public class Registry extends Vehicle { // Subclass
    private Vehicle[] vehicles; // Array til at gemme køretøjer i
    private int count; // Antal køretøjer i registret

    // COnstructor der opretter array med en maksimal størrelse
    public Registry (int maxVehicles){
        vehicles = new Vehicle[maxVehicles];
        count = 0;
    }

    // Tilføjer køretøj til arrayet, hvis der er plads
    public void addVehicle(Vehicle v) {
        if (count < vehicles.length) {
            vehicles[count] = v;
            count++;
        } else {
            System.out.println("Registret er fuldt. Kan ikke tilføje flere køretøjer");
            System.exit(count);
        }
    }

    // udskriver alle køretøjer ved kalde deres printInfo() metode
    public void listVehicles(){
        if (count == 0){
            System.out.println("Der er ingen køretøjer i registret");
        } else {
            for (int i = 0; i < count; i++){
                vehicles[i].printInfo(); // kalder den korrekte printInfo() for hver type køretøj. Polymorfi
            }
        }
    }
}
