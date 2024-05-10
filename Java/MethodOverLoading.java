class Compute{
    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public int add(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }
}

public class MethodOverLoading {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;

        Compute com = new Compute();
        int r1 = com.add(num1, num2);
        int r2 = com.add(num1, num2, num3);
        System.out.println("result from r1: " +r1);
        System.out.println("result from r2: " +r2);
    }
}
