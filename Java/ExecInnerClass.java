class InnerClass {
    public void print() {
        System.out.println("InnerClass");
    }

    class InnerClass2 {
        public void print() {
            System.out.println("InnerClass2");
        }
    }
}

class AnonymousInnerClass {
    public void print() {
        System.out.println("AnonymousInnerClass");
    }
}

abstract class AbstractInnerClass {
    public abstract void show();
}

public class ExecInnerClass {
    public static void main(String[] args) {
        InnerClass ic = new InnerClass();
        ic.print();

        InnerClass.InnerClass2 ic2 = ic.new InnerClass2();
        ic2.print();

        AnonymousInnerClass aic = new AnonymousInnerClass() {
            @Override
            public void print() {
                System.out.println("In new AnonymousInnerClass");
            }
        };
        aic.print();

        AbstractInnerClass abic = new AbstractInnerClass() {
            @Override
            public void show() {
                System.out.println("In new AbstractInnerClass");
            }
        };
        abic.show();
    }

}
