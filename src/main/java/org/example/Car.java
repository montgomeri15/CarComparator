package org.example;

public class Car implements Comparable<Car> {
    private final int yearOfManufacture;
    private final double engineCapacity;

    public Car(int yearOfManufacture, double engineCapacity) {
        this.yearOfManufacture = yearOfManufacture;
        this.engineCapacity = engineCapacity;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    @Override
    public String toString() {
        return "Car{" +
                "yearOfManufacture=" + yearOfManufacture +
                ", engineCapacity=" + engineCapacity +
                '}';
    }

    @Override
    public int compareTo(Car o) {
        return Integer.compare(this.yearOfManufacture, o.yearOfManufacture);
    }
}
