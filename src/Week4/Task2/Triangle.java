package Week4.Task2;

public class Triangle {
    private final Point a;
    private final Point b;
    private final Point c;

    public Triangle(Point a, Point b, Point c) {
        AssertionUtils.assertNotNull(a);
        AssertionUtils.assertNotNull(b);
        AssertionUtils.assertNotNull(c);
        this.a = new ImmutablePoint((ImmutablePoint) a);
        this.b = new ImmutablePoint((ImmutablePoint) b);
        this.c = new ImmutablePoint((ImmutablePoint) c);
    }

    public Triangle(Triangle o) {
        AssertionUtils.assertNotNull(o);
        this.a = new ImmutablePoint((ImmutablePoint) o.a);
        this.b = new ImmutablePoint((ImmutablePoint) o.b);
        this.c = new ImmutablePoint((ImmutablePoint) o.c);
    }

    public Point getA() {
        return new ImmutablePoint((ImmutablePoint) a);
    }

    public Point getB() {
        return new ImmutablePoint((ImmutablePoint) b);
    }

    public Point getC() {
        return new ImmutablePoint((ImmutablePoint) c);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triangle)) return false;
        Triangle triangle = (Triangle) o;
        return a.equals(triangle.a) && b.equals(triangle.b) && c.equals(triangle.c);
    }

    @Override
    public String toString() {
        return a.toString() + b.toString() + c.toString();
    }
}
