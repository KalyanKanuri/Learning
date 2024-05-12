class IntClass {
    int i = 10;
    Integer i2 = i; // AutoBoxing
    // Integer i2 = new Integer(i); // Explicit boxing

    int j = i2; // AutoUnboxing
    // int j = i2.intValue(); Explicit unboxing
}

public class Wrappers {
    public static void main(String[] args) {
        IntClass ic = new IntClass();
        System.out.println(ic.i);
        System.out.println(ic.i2);
        System.out.println(ic.j);
    }
}
