package Week4.Task3.Processor;

import Week4.Task3.Clock.Clock;

public class X86IntelProcessor implements Processor{

    @Override
    public void calculateBinary(long decimal) {
        Clock.countTime(4000);
        System.out.println(Long.toBinaryString(decimal));
    }
}
