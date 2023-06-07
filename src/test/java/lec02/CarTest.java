package lec02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    private Car car;

    @Test
    public void test1() {


        CarComponent component = DaggerCarComponent.create();

        car = component.getCar();

        car.drive();

    }


}