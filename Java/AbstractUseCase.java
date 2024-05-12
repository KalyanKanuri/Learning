abstract class Car {
    public void drive() {
        System.out.println("Driving...");
    }

    public void stop() {
        System.out.println("Stopping...");
    }

    public void park() {
        System.out.println("Parking...");
    }

    public abstract void accelerate(); // Only declared here
}

class Toyota extends Car {

    @Override
    public void accelerate() {
        System.out.println("Implemented from Abstract class... Accelerating");
    }
}

public class AbstractUseCase {
    public static void main(String[] args) {
        // Abstract class can't be instantiated
        // Abstract class can have abstract methods
        // Abstract class can have non-abstract methods
        // Abstract class can have constructors
        // Abstract class can have static methods
        // Abstract class can have final methods
        // Abstract class can have private methods
        // Abstract class can have protected methods
        // Abstract class can have package-private methods
        // Abstract class can have inner classes
        // Abstract class can have nested classes
        // Abstract class can be extended by concrete classes
        // Abstract class can be implemented by concrete classes
        // Abstract class can be used as a base class for other classes
        // Abstract class can be used as a mixin for other classes
        // Abstract class can be used as a template for other classes
        // Abstract class can be used as a blueprint for other classes
        // Abstract class can be used as a factory for other classes
        // Abstract class can be used as a data structure for other classes

        Toyota toyota = new Toyota();
        toyota.drive();
        toyota.stop();
        toyota.park();
        toyota.accelerate();
        System.out.println("----------------------------------------");
    }
}
