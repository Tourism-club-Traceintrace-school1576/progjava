package laba4;

public class Main {
    public static void main(String[] args) {
        Planet mars = new Planet("Mars");
        Human mark = new Human("Mark");
        Animal dog = new Animal("Chapie");
        System.out.println(mars.getName());
        System.out.println(mark.getName());
        System.out.println(dog.getName());
    }
}
