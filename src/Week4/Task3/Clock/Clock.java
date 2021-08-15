package Week4.Task3.Clock;

public interface Clock {
    void start();
    // method is static because I use it in processors
    static void countTime(long interval) {
        long start = System.currentTimeMillis();
        while(System.currentTimeMillis() - start <= interval) {
        }
    }
}
