package Uge4.KlasseOgObjekter;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Enes", "Zeki", "Filikci", 20);
        Car car = new Car();

        System.out.println(car);

        car.setBrand("Mercedes");
        car.setYear(2019);


        car.setOwner(p1);

        System.out.println(car);
        p1.setFirstName("Alan");
        p1.setMiddleName("Jassem Mohammad");
        p1.setLastName("Al-Jamour");
        p1.setAge(19);

        System.out.println(car);

        System.out.println(car.getBrand());

//        car.startEngine();
//        car.stopEngine();

        // System.out.println(person.getFullName()); printer den anden metode, hvori alderen ikke returneres

    }
}
