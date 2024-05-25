import java.util.Arrays;
import java.util.List;

public class ForEachUseCase {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "c");
        list.forEach(n -> System.out.println(n));
    }
}
