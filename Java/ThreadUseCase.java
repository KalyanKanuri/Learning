class NormalThread extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Normal Thread " +i);
        }
        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class ParallelThread extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Parallel Thread " +i);
        }
        try {
            Thread.sleep(7);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

public class ThreadUseCase {
    public static void main(String[] args) {
        NormalThread nt = new NormalThread();
        ParallelThread pt = new ParallelThread();
        nt.start();
        pt.start();
    }
}
