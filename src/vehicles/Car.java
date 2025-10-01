package vehicles;

import engines.Engine;

public class Car extends Vehicle {
    public Car(Engine engine) {
        super(engine);
    }

    @Override
    public void drive() {
        System.out.print("Car drives. ");
        engine.start();
    }
}
