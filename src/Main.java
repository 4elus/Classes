import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Классы и объекты
        Human human1 = new Human("Alex", 17, "Red", 59, 5000); // объект класса Human

        human1.setAge(2);

        human1.weight = -70;
        human1.salary = -5000;
        human1.setName("Alex");
        System.out.println(human1.getName());

        System.out.println(human1.toString());
        //human1.salary = human1.increaseSalary(2500);

        System.out.println(human1.toString());

    }
}