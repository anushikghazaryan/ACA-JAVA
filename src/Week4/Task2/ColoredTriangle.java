package Week4.Task2;

import java.awt.*;
import java.util.Objects;

public class ColoredTriangle extends Triangle{
    Color color;

    public ColoredTriangle(Point a, Point b, Point c, Color color) {
        super(a, b, c);
        this.color = color;
    }

    @Override
    public String toString() {
        return "color=" + color + super.toString() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triangle)) {
            return false;
        } else {
            if(o instanceof ColoredTriangle) {
                ColoredTriangle that = (ColoredTriangle) o;
                return color.equals(that.color) && super.equals(that);
            }
            return super.equals((Triangle) o);
        }
    }

    public static void main(String[] args) {
        ColoredTriangle coloredTriangle1 = new ColoredTriangle(new ImmutablePoint(12,15), new ImmutablePoint(23,25), new ImmutablePoint(17,19), Color.black);
        ColoredTriangle coloredTriangle2 = new ColoredTriangle(new ImmutablePoint(12,15), new ImmutablePoint(23,25), new ImmutablePoint(17,19), Color.black);
        ColoredTriangle coloredTriangle3 = new ColoredTriangle(new ImmutablePoint(10,15), new ImmutablePoint(23,75), new ImmutablePoint(17,19), Color.black);
        Triangle Triangle1 = new Triangle(new ImmutablePoint(12,15), new ImmutablePoint(23,25), new ImmutablePoint(17,19));
        Triangle Triangle2 = new Triangle(new ImmutablePoint(10,15), new ImmutablePoint(23,25), new ImmutablePoint(17,19));

        System.out.println(coloredTriangle1.equals(coloredTriangle2));
        System.out.println(coloredTriangle1.equals(coloredTriangle3));
        System.out.println(coloredTriangle1.equals(Triangle1));
        System.out.println(coloredTriangle1.equals(Triangle2));

    }
}
