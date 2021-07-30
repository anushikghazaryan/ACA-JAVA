package Week3.Polymorphism.n2;

public class RightTriangle implements Shape{
    private final float side;

    public RightTriangle(float side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return Math.pow(this.side, 2) * Math.sqrt(3) / 4;
    }

    @Override
    public void getName() {

    }
}
