package pl.akademia108;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Car one = new Car("opel", "red");
        Car two = new Car("audi", "green");
        Car three = new Car("toyota", "blue");

        List<Car> cars = new ArrayList<Car>();

        cars.add(one);
        cars.add(two);
        cars.add(three);

        for (Car car : cars) {
            System.out.println("Samochód " + car.getName() + " ma kolor " + car.getColor());
        }
    }
}
