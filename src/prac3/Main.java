package prac3;

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle(1.0, "RED1", false);
        System.out.println(c.getColor()+c.isFilled()+c.radius);
    }
}
