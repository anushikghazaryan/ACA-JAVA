package Week4.Task3.Processor;

import Week4.Task3.Clock.Clock;

public class ArmProcessor implements Processor{
    @Override
    public void calculateBinary(long decimal) {
        Clock.countTime(1000);
        System.out.println(Long.toBinaryString(decimal));
    }
}
