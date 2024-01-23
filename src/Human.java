import javax.xml.namespace.QName;

public class Human {
    // поля(свойства) класса Human
    private String name;
    private int age;
    private String color_eyes;
    public int weight;
    public int salary;

    public Human(String name, int age, String color_eyes, int weight, int salary) {
        this.name = name;
        this.age = age;
        this.color_eyes = color_eyes;
        this.weight = weight;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor_eyes() {
        return color_eyes;
    }

    public void setColor_eyes(String color_eyes) {
        this.color_eyes = color_eyes;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Имя: " + name + "\n" +
                "Возраст: " + age + "\n" +
                "Цвет глаз: " + color_eyes + "\n" +
                "Вес: " + weight + "\n" +
                "ЗП: " + salary + ".";
    }
}
