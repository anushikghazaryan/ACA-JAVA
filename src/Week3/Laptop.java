package Week3;

public class Laptop {
    private static int count;
    private String name;

    public static void main(String[] args) {
        // Static fields
        Laptop laptop1 = new Laptop();
        Laptop laptop2 = new Laptop();
        Laptop laptop3 = new Laptop();
        Laptop laptop4 = new Laptop();
        Laptop laptop5 = new Laptop();

        laptop1.setName("asus");
    }

    //բացի public-ից պետք էր ունենալ նաև protected կոնստրուկտր
    public Laptop() {
        count++;
        System.out.println(count);
    }

    public Laptop setName(String name) {
        this.name = name;
        return this;
    }
}
