package Week3;

public enum Month {
    JANUARY (1),
    FEBRUARY (2),
    MARCH (3),
    APRIL (4),
    MAY (5),
    JUNE (6),
    JULY (7),
    AUGUST (8),
    SEPTEMBER (9),
    OCTOBER (10),
    NOVEMBER (11),
    DECEMBER (12);

    int index;

    private Month(int value) {
        this.index = value;
    }

    public static Month getMonth(int index) {
        return Month.values()[index];
    }

    public static void main(String[] args) {
        System.out.println(Month.getMonth(5));
    }
}
