import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class ExecStream2ParallelStream {
    public void Streamer() {
        int size = 10_000;
        List<Integer> li = new ArrayList<>(size);
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            li.add(random.nextInt(100));
        }

        long start = System.currentTimeMillis();
        int sum1 = li.stream().map(i -> {
            try {
                Thread.sleep(1);
                return i;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return i;
        }).mapToInt(i -> i).sum();
        System.out.println(System.currentTimeMillis() - start);
        System.out.println(sum1);

        start = System.currentTimeMillis();
        int sum2 = li.parallelStream().map( i -> {
            try {
                Thread.sleep(1);
                return i;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return i;
        }).mapToInt(i -> i).sum();
        System.out.println(System.currentTimeMillis() - start);
        System.out.println(sum2);
    }
}

public class ParallelStreamUseCase {
    public static void main(String[] args) {
        ExecStream2ParallelStream es = new ExecStream2ParallelStream();
        es.Streamer();
        System.out.println("Done");
    }
}
