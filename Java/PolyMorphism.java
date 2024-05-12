class First {
    public void display() {
        System.out.println("First");
    }
}

class Second extends First {
    public void display() {
        System.out.println("Second");
    }
}

public class PolyMorphism {
    public static void main(String[] args) {
        First s = new Second(); // Dynamic Method Dispatch (Run Time Polymorphism)
        s.display();
        System.out.println(s);

        s = new First();
        s.display(); // S object has different forms of displaying at run time
        System.out.println(s); // the address link will be newly assigned creating First() object and assigning to s var
    }
}
