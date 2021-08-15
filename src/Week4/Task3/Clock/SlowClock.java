package Week4.Task3.Clock;

public class SlowClock implements Clock {
    private long seconds;

    public SlowClock() {
        this.seconds = 0;
    }

    public long getSeconds() {
        return seconds;
    }

    @Override
    public void start() {
        while(true) {
            Clock.countTime(2000);
            System.out.println(++seconds);
        }
    }
}
