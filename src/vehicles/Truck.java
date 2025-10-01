package vehicles;

import engines.Engine;

public class Truck extends Vehicle {
    public Truck(Engine engine) {
        super(engine);
    }

    @Override
    public void drive() {
        System.out.print("Truck carries cargo. ");
        engine.start();
    }
}
