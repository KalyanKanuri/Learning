class Loops {
    public static void main (String [] args) {
        int  a = 10;

        // while loop
        while ( a < 20 ) {
            System.out.println("Executing while loop: " +a);
            a++;
        }

        // do-while loop
        do {
            System.out.println("Executing do-while: " +a);
            a++;
        } while (a<10);

        // for loop
        for (int i = 1; i <=5; i++) {
            System.out.println("Executing for loop: " +i);
        }
    }
}