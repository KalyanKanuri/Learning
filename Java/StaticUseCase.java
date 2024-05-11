class Mobile {
    String brand;
    String model;
    int price;
    static int count = 0;

    static {
        System.out.println("Static Block");
    }

    public Mobile(String brand, String model, int price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        count++;
        System.out.println("Constructor");
    }
    public void show() {
        System.out.println(brand + " " + model + " " + price);
        System.out.println("======================================");
    }
    public static void showCount() {
        System.out.println(count);
    }
}

public class StaticUseCase {
    public static void main(String[] args) {
        Mobile  m1 = new Mobile("Samsung", "A50", 50000);
        Mobile.showCount();
        m1.show();

        Mobile m2 = new Mobile("Samsung", "A51", 60000);
        Mobile.showCount();
        m2.show();
    }
}
