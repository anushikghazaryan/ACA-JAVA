package Week3.Polymorphism.n2;

public class Rectangle implements Shape{
    private final float sideX;
    private final float sideY;

    public Rectangle(float sideX, float sideY) {
        this.sideX = sideX;
        this.sideY = sideY;
    }

    @Override
    public double calculateArea() {
        return this.sideX * this.sideY;
    }

    @Override
    public void getName() {

    }
}
