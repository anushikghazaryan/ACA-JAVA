package Week4.Task3.Clock;

import java.util.Scanner;

public class ClockTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("type 1 for fastClock, 2 for slowClock");
        switch (scanner.nextInt()){
            case 1: {
                new FastClock().start();
            }
            case 2: {
                new SlowClock().start();
            }
            default: {
                throw new RuntimeException("incorrect input");
            }
        }
    }
}
