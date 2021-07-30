package Week3;

public class Laptop {
    private static int count;

    public static void main(String[] args) {
        Laptop laptop1 = new Laptop();
        setCount(15);
        Laptop laptop2 = new Laptop();
    }

    public Laptop() {
        count++;
        System.out.println(count);
    }

    public static void setCount(int value) {
        count = value;
    }
}
