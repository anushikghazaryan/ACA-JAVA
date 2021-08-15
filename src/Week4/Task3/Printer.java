package Week4.Task3;

import Week4.Task1.User;
import Week4.Task1.UserGroup;
import Week4.Task2.ColoredTriangle;
import Week4.Task2.ImmutablePoint;
import Week4.Task2.Triangle;
import java.awt.*;

public class Printer {
    public static void specialPrint (Object parameter) {
        System.out.println("**************");
        System.out.println(parameter.toString());
        System.out.println("**************");
    }

    public static void main(String[] args) {
        User user = new User();
        user.setFirstName("Anushik");
        specialPrint(user);

        UserGroup userGroup = new UserGroup();
        userGroup.addUser(user);
        userGroup.addUser(new User());
        specialPrint(userGroup);

        ImmutablePoint immutablePoint = new ImmutablePoint(12,5);
        specialPrint(immutablePoint);

        Triangle triangle = new Triangle(new ImmutablePoint(12,15), new ImmutablePoint(23,25), new ImmutablePoint(17,19));
        specialPrint(triangle);

        ColoredTriangle coloredTriangle = new ColoredTriangle(new ImmutablePoint(12,15), new ImmutablePoint(23,25), new ImmutablePoint(17,19), Color.pink);
        specialPrint(coloredTriangle);
    }
}
