package org.example;

import java.util.*;

public class App {
    public static void main( String[] args ) {
        Car toyota = new Car(1990,2.4);
        Car mazda = new Car(2006,1.8);
        Car opel = new Car(1989,2.5);
        Car acura = new Car(2019,1.6);

        //Sorting by yearOfManufacture
        List<Car> carsList = Arrays.asList(toyota, mazda, opel, acura);
        Collections.sort(carsList);
        System.out.println("Sorted by yearOfManufacture:\n" + carsList);

        //Sorting by engineCapacity
        Set<Car> carsByEngineSortedSet = new TreeSet<>(Comparator.comparing(Car::getEngineCapacity));
        carsByEngineSortedSet.addAll(carsList);
        System.out.println("Sorted by engineCapacity:\n" + carsByEngineSortedSet);
    }
}
