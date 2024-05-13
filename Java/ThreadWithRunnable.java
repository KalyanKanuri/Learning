public class ThreadWithRunnable {
    public static void main(String[] args) {
        Runnable r1 = () -> {
          for (int i = 0; i < 5; i++) {
            System.out.println("Running thread R1 from Runnable " +i);
            try {
              Thread.sleep(10);
            } catch (InterruptedException e) {
              e.printStackTrace();
            }
          }
        };

        Runnable r2 = () -> {
          for (int i = 0; i < 5; i++) {
            System.out.println("Running thread R2 from Runnable " +i);
          }
        };

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();
    }
}
