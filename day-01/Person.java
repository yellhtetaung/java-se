public class Person {
    public static void main(String[] args) {
        Student aung = new Student();
        aung.name = "Aung Aung";
        aung.age = 20;

        Student maung = new Student();
        maung.name = "Maung Maung";
        maung.age = 25;

        maung.greet();
        aung.greet();
    }
}

class Student {
    String name;
    int age;

    void greet() {
        System.out.println("My name is " + name);
        System.out.println("My age is " + age);
    }
}