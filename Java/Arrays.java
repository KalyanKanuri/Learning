class ObjArr {
    String Name;
    int Age;
    String Address;
}

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

    static int use2DArray() {
        int[][] twoD_Arr = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}};
        int sum = 0;

        for (int[] arr : twoD_Arr) {
            for (int number : arr) {
                sum += number;
            }
        }

        return sum;
    }

    static int use3DArray() {
        int [][][] threeD_Arr = {{{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}}};
        for (int[][] arr : threeD_Arr) {
            for (int[] number : arr) {
                for (int num : number) {
                    int fetch = num;
                    System.out.print(fetch);
                }
                System.out.println();
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        String r =  passwordAnalyzer();
        System.out.println("======================================");
        System.out.println("Password Analyzer");
        System.out.println("Resulting Password: " +r);
        System.out.println("======================================");
        System.out.println();

        System.out.println("======================================");
        System.out.println("Random Number Generator");
        int s = randomNumber();
        System.out.println("Resulting Sum: " +s);
        System.out.println("======================================");
        System.out.println();

        System.out.println("======================================");
        System.out.println("2D Array Sum");
        int t = use2DArray();
        System.out.println("Resulting Multi Arr Sum: " +t);
        System.out.println("======================================");

        System.out.println("======================================");
        System.out.println("3D Array Sum");
        int u = use3DArray();
        System.out.println("use3DArray completed returning " +u);
        System.out.println("======================================");
        System.out.println();

        ObjArr  person1 = new ObjArr();
        person1.Name = "John";
        person1.Age = 20;
        person1.Address = "New York";

        ObjArr  person2 = new ObjArr();
        person2.Name = "Mary";
        person2.Age = 25;
        person2.Address = "Los Angeles";

        ObjArr  person3 = new ObjArr();
        person3.Name = "Peter";
        person3.Age = 30;
        person3.Address = "Chicago";

        System.out.println("======================================");
        System.out.println("Person Details");
        for (ObjArr person : new ObjArr[]{person1, person2, person3}) {
            System.out.println("Name: " +person.Name + ", Age: " + person.Age + ", Address:" + person.Address);
        }
        System.out.println("======================================");
    }
}
