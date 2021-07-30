package Week3.Polymorphism.n2;

public class Circle implements Shape{
    private final double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(this.r, 2);
    }

    @Override
    public void getName() {

    }
}
