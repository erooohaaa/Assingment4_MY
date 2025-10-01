package vehicles;

import engines.Engine;

public abstract class Vehicle {
    protected Engine engine;

    protected Vehicle(Engine engine) {
        this.engine = engine;
    }

    public abstract void drive();
}
