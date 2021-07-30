package Week3.Polymorphism.n1;

public class Main {
    public static void main(String[] args) {
        Staff person1 = new Director();
        Staff person2 = new Manager();

        person1.work();
        person2.work();
    }
}
