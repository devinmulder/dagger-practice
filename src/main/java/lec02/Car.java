package lec02;

import javax.inject.Inject;

public class Car {

    private static final String TAG = "Car";

    private Engine engine;
    private Wheels wheels;

    @Inject
    public Car(Engine engine, Wheels wheels) {
        this.engine = engine;
        this.wheels = wheels;
    }

    public void drive() {
        System.out.println(TAG + " driving...");
        System.out.println("engine = " + engine);
        System.out.println("wheels = " + wheels);

    }
}
