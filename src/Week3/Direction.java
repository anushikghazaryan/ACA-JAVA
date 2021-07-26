package Week3;

public enum Direction {
    EAST (1),
    NORTH (2),
    WEST (3),
    SOUTH (4);

    private Direction(int value) {}

    public static void main(String[] args) {
        print();
    }

    public static void print() {
        for(Direction dir : Direction.values()) {
            System.out.println(dir);
        }
    }

}
