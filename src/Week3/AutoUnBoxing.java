package Week3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AutoUnBoxing {
    public static void main(String[] args) {
        // 1
        Integer neg = new Random().nextInt(60)-150;
        System.out.println(neg);
        absoluteNumber(neg);

        // 2
        List<Double> list = new ArrayList<>();
        // double Pi to Double === autoboxing
        list.add(Math.PI);

        double pi = list.get(0);
        System.out.println(pi);
    }

    // Integer neg - > int number --- automatic unboxing
    private static void absoluteNumber(int number) {
        System.out.println(-number);
    }

}
