enum Laptop {
    HP(75000), DELL(70000), MACBOOK(120000), SURFACE;

    private final int price;

    Laptop() {
        price = 45000;
    }

    Laptop(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}

public class EnumUseCase {
    public static void main(String[] args) {
        for (Laptop l : Laptop.values()) {
            System.out.println(l + ": " + l.getPrice());
        }
    }
}
