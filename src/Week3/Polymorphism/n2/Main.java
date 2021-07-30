package Week3.Polymorphism.n2;

public class Main {
    public static void main(String[] args) {
        Shape s1 = new Square(12);
        System.out.println(s1.calculateArea());

        Shape s2 = new RightTriangle(12);
        System.out.println(s2.calculateArea());
    }
}
