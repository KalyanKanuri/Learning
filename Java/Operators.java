class Operators {
    public static void main (String[] args) {
        int a = 10;
        int b = 5;
        // Arithmetic Operators

        int result = a + b;
        System.out.println("Additional Operator: " +result);

        result = a - b;
        System.out.println("Subtraction Operator: " +result);

        result = a * b;
        System.out.println("Multiplication: " +result);

        result = a / b;
        System.out.println("Division: " +result);

        result = a % b;
        System.out.println("Modulo" +result);

        result = ++a; //pre-increment
        System.out.println("Pre increment: " +result);


        result = b++; //post-increment
        System.out.println("Post increment: " +result);

        boolean res = a>b;
        System.out.println("> Operator: " +res);

        res = a<b;
        System.out.println("< Operator: " +res);

        // Logical Operator

        res = a>b && a<b;
        System.out.println("&& Operator: " +res);

        res = a>b || a<b;
        System.out.println("|| Operator: " +res);

        boolean check = a!=b;
        System.out.println("! Operator" +check);

        // if-else blocks

        if (a>b) {
            System.out.println("a is greater: " +a);
        }
        else {
            System.out.println("b is greater: " +b);
        }

        int c = 15;

        if (a>b && a>c) {
            System.out.println("a is greater of all 3: " +a);
        } else if (b>c) {
            System.out.println("b is greater of all 3: " +b);
        }
        else {
            System.out.println("c is greater of all 3: " +c);
        }

        // Switch block
        int day = 1;

        switch (day) {
            case 1 -> System.out.println("Monday");

            case 2 -> System.out.println("Tuesday");

            case 3 -> System.out.println("Wednesday");

            case 4 -> System.out.println("Thursday");

            case 5 -> System.out.println("Friday");

            case 6 -> System.out.println("Saturday");

            case 7 -> System.out.println("Sunday");

            default -> System.out.println("Invalid day");
        }
    }
}