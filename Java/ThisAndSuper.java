class A {
    public A() {
        System.out.println("A default Constructor");
    }

    public A(int i) {
        System.out.println("A Parameterized Constructor " +"invoked with: " +i);
    }
}

class B extends A {
    public B() {
        super(10); // super() invokes constructor of parent class
        System.out.println("B default Constructor");
    }
    public B(int i) {
        this(); // this() invokes constructor of same class
        System.out.println("B Parameterized Constructor " +"invoked with: " +i);
    }
}

public class ThisAndSuper {
    public static void main(String[] args) {
        A  a = new A(); // when we initialise object default constructor is automatically invoked
        B b = new B(10);
        System.out.println(a +" " +b);
    }
}
