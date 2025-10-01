import engines.*;
import vehicles.*;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car(new GasolineEngine());
        car.drive();

        Vehicle truck = new Truck(new DieselEngine());
        truck.drive();

        Vehicle tesla = new Car(new ElectricEngine());
        tesla.drive();

        Vehicle bike = new Bike(new GasolineEngine());
        bike.drive();
    }
}