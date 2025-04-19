package Uge11.ComparatorOpgaver.Opgave1;

import java.util.ArrayList;
import java.util.Collections;

public class SortCars {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
        Car car1 = new Car("MO 2025");
        Car car2 = new Car("JU 1992");
        Car car3 = new Car("FI 1723");

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);

        System.out.println(cars);

        Collections.sort(cars);

        System.out.println(cars);

    }
}
