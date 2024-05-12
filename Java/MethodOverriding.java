class UpperClass {
    public void display() {
        System.out.println("This is UpperClass");
    }
}

class LowerClass extends UpperClass {
    public void display() {
        System.out.println("This is LowerClass");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        LowerClass lc = new LowerClass();
        lc.display();
        // Even if the LowerClass is extending UpperClass and inheriting display() method
        //, it will still call the display() method of LowerClass. this is called Method Overriding.
        // to access the display() method of UpperClass, we need to create an object of UpperClass.
        UpperClass uc = new UpperClass();
        uc.display();
    }
}
