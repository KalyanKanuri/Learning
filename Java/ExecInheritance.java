class Parent {
    public int add(int x, int y) {
        return x+y;
    }

    public int sub(int x, int y) {
        return x-y;
    }
}

class Child extends Parent {
    public int mul(int x, int y) {
        return x*y;
    }

    public int div(int x, int y) {
        return x/y;
    }
}

class GrandChild extends Child {
    public int mod(int x, int y) {
        return x%y;
    }

    public int pow(int x, int y) {
        return (int)Math.pow(x, y);
    }
}

public class ExecInheritance {

    public static void display(String ope, int result) {
        System.out.println(ope +": " +result);
    }

    public static void main(String[] args) {
        // object for parent
        System.out.println("Methods execution from Parent");
        Parent p = new Parent();
        int result = p.add(5, 3);
        display("add", result);

        result = p.sub(5, 3);
        display("sub", result);
        System.out.println("=====================================\n");

        // object for child
        System.out.println("Methods execution from Child");
        Child c = new Child();
        result = c.add(5, 3);
        display("Add from Child", result);

        result = c.sub(5, 3);
        display("Sub from Child", result);

        result = c.mul(5, 3);
        display("Multi from Child", result);

        result = c.div(5, 3);
        display("Div from Child", result);
        System.out.println("=====================================\n");

        // object for grandchild
        System.out.println("Methods execution from GrandChild");
        GrandChild gc = new GrandChild();
        result = gc.add(5, 3);
        display("Add from GrandChild", result);

        result = gc.sub(5, 3);
        display("Sub from GrandChild", result);

        result = gc.mul(5, 3);
        display("Multi from GrandChild", result);

        result = gc.div(5, 3);
        display("Div from GrandChild", result);

        result = gc.mod(5, 3);
        display("Mod from GrandChild", result);

        result = gc.pow(5, 3);
        display("Pow from GrandChild", result);
        System.out.println("=====================================\n");
    }
}
