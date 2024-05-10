public class Arrays {

    static String passwordAnalyzer() {
        String[] password = {"XY01", "XY02", "XY03", "XY04"};
        StringBuilder result = new StringBuilder();

        for (int i = password.length-1; i>=2; i--) {
            result.append(password[i]);
        }

        return result.toString();
    }

    static int randomNumber() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        return sum;
    }

    static int useMultiArr() {
        int[][] multiArr = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}};
        int sum = 0;

        for (int[] arr : multiArr) {
            for (int number : arr) {
                sum += number;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        String r =  passwordAnalyzer();
        System.out.println("Resulting Password: " +r);

        int s = randomNumber();
        System.out.println("Resulting Sum: " +s);

        int t = useMultiArr();
        System.out.println("Resulting Multi Arr Sum: " +t);
    }
}
