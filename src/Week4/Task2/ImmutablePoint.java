package Week4.Task2;

import java.util.Objects;

public final class ImmutablePoint implements Point{
    private final int x;
    private final int y;

    public ImmutablePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public ImmutablePoint(ImmutablePoint o) {
        x = o.getX();
        y = o.getY();
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

    public Point shiftLeft() {
        int x = getX();
        int y = getY();
        return new ImmutablePoint(--x, y);
    }

    public Point shiftRight() {
        int x = getX();
        int y = getY();
        return new ImmutablePoint(++x, y);
    }

    public Point shiftUp() {
        int x = getX();
        int y = getY();
        return new ImmutablePoint(x, ++y);
    }

    public Point shiftDown() {
        int x = getX();
        int y = getY();
        return new ImmutablePoint(x, --y);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ImmutablePoint)) return false;
        ImmutablePoint that = (ImmutablePoint) o;
        return x == that.x && y == that.y;
    }

    @Override
    public String toString() {
        return String.format("X = %d, Y = %d", x, y);
    }
}
