@FunctionalInterface
interface Lam {
    int add(int a, int b);
}

public class LambdaUseCase {
    public static void main(String[] args) {
        Lam lam = (a, b) -> a+b;
        System.out.println(lam.add(10, 20));
    }
}
