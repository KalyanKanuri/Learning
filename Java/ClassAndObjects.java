class Calculate {
    public int add(int n1, int n2) {
        int r = n1 + n2;
        return r;
    }
}

public class ClassAndObjects {
    public static void main(String [] args) {
        int num1 = 4;
        int num2 = 5;

        Calculate c = new Calculate();
        int result = c.add(num1, num2);
        System.out.println("Result from Calculate class: " +result);
    }
}
