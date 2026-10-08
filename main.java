import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("Jaswanth");
        names.add("Rahul");
        

        for (String name : names) {
            System.out.println("Name: " + name);
        }

        
        System.out.println("Total names: " + names.size();

        
        try {
            int result = 10 / 0;
            System.out.println("Result: " + result);
        }

        
        System.out.println("Program completed")
    }
}