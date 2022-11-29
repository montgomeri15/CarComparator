package org.example;

import org.assertj.core.data.Index;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;

public class AppTest {

    @Test
    void testCarsSortedByYear(){
        Car toyota = new Car(1990,2.4);
        Car mazda = new Car(2006,1.8);
        Car opel = new Car(1989,2.5);
        Car acura = new Car(2019,1.6);

        List<Car> carsList = Arrays.asList(toyota, mazda, opel, acura);
        Collections.sort(carsList);

        assertThat(carsList.size()).isEqualTo(4);
        assertThat(carsList).isNotEmpty()
                .contains(toyota, mazda, opel, acura)
                .contains(opel, Index.atIndex(0))
                .contains(toyota, Index.atIndex(1))
                .contains(mazda, Index.atIndex(2))
                .contains(acura, Index.atIndex(3));
    }

    @Test
    void testCarsSortedByEngine(){
        Car toyota = new Car(1990,2.4);
        Car mazda = new Car(2006,1.8);
        Car opel = new Car(1989,2.5);
        Car acura = new Car(2019,1.6);

        List<Car> carsList = Arrays.asList(toyota, mazda, opel, acura);
        Set<Car> carsByEngineSortedSet = new TreeSet<>(Comparator.comparing(Car::getEngineCapacity));
        carsByEngineSortedSet.addAll(carsList);

        assertThat(carsByEngineSortedSet.size()).isEqualTo(4);
        assertThat(carsByEngineSortedSet).isNotEmpty()
                .contains(toyota, mazda, opel, acura);
        assertThat(((TreeSet<Car>) carsByEngineSortedSet).first()).isEqualTo(acura);
        assertThat(((TreeSet<Car>) carsByEngineSortedSet).last()).isEqualTo(opel);
    }
}
