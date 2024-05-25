import java.util.*;

class Sorter {
    // Comparator to compare strings by their length
    Comparator<String> comp = Comparator.comparingInt(String::length);
}

public class ExecSort {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Kalyan");
        list.add("Loves");
        list.add("Sriya Patnaik");

        // Create an instance of Sorter
        Sorter sorter = new Sorter();

        // Sort the list using the comparator defined in Sorter
        Collections.sort(list, sorter.comp);

        // Print the sorted list
        for (String s : list) {
            System.out.println(s + " (length: " + s.length() + ")");
        }
    }
}
