import java.util.List;
import java.util.ArrayList;

public class TestingCode {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("Jaswanth");
        names.add("Rahul");

        for (String name : names) {
            System.out.println("Name: " + name);
        }

        System.out.println("Total names: " + names.size());

        try {
            int result = 10 / 0;
            System.out.println("Result: " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Program completed");
    }
}