package Week3.Polymorphism.n2;

public class Square implements Shape{
    private final double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return Math.pow(this.side, 2);
    }

    @Override
    public void getName() {

    }
}
