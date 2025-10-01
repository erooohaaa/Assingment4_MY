package vehicles;

import engines.Engine;

public class Bike extends Vehicle {
    public Bike(Engine engine) {
        super(engine);
    }

    @Override
    public void drive() {
        System.out.print("Bike rides fast. ");
        engine.start();
    }
}
