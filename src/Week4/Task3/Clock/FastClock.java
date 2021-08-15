package Week4.Task3.Clock;

public class FastClock implements Clock {
    private long seconds;

    public FastClock() {
        this.seconds = 0;
    }

    public long getSeconds() {
        return seconds;
    }

    @Override
    public void start() {
        while(true) {
            Clock.countTime(500);
            System.out.println(++seconds);
        }
    }
}
