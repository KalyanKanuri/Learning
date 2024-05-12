/*
    Interface is a contract between two or more classes.
    It is a collection of abstract methods and constants.
    It is a 100% abstract class.
*/

interface Vehicle {

    void start();
    void stop();
}

interface Driver {

    void drive();
}

// Multiple interfaces can be implemented in a single class
class Bike implements Vehicle, Driver {

    @Override
    public void start() {
        System.out.println("Bike started");
    }

    @Override
    public void stop() {
        System.out.println("Bike stopped");
    }

    @Override
    public void drive() {
        System.out.println("Driver is driving");
    }
}

public class InterfaceUseCase {

    public static void main(String[] args) {
        Bike  bike = new Bike();
        bike.start();
        bike.stop();
        bike.drive();
    }
}
