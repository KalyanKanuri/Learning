class FinalVarExecution {
    public void execute() {
        final int a = 10;
        System.out.println(a);
        System.out.println("this is a Final variable it cannot be changed anymore");
    }
}

final class FinalClassExecution extends FinalVarExecution {
    public void execute() {
        System.out.println("this is a Final class it cannot be inherited");
    }
}

class FinalMethodExecution {
    final public void execute() {
        System.out.println("this is a Final method this cannot be Overridden");
    }
}

public class FinalUseCase {
    public static void main(String[] args) {
        FinalVarExecution fve = new FinalVarExecution();
        fve.execute();

        FinalClassExecution fce = new FinalClassExecution();
        fce.execute();

        FinalMethodExecution fme = new FinalMethodExecution();
        fme.execute();
    }
}
