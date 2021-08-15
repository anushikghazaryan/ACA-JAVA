package Week4.Task3.Processor;

public class Test {
    public static void main(String[] args) {
        Processor processor1 = new X86IntelProcessor();
        Processor processor2 = new X8664IntelProcessor();
        Processor processor3 = new ArmProcessor();

        processor1.calculateBinary(25);
        processor1.calculateBinary(884);
        processor1.calculateBinary(721);

        processor2.calculateBinary(25);
        processor2.calculateBinary(884);
        processor2.calculateBinary(721);

        processor3.calculateBinary(25);
        processor3.calculateBinary(884);
        processor3.calculateBinary(721);
    }
}
