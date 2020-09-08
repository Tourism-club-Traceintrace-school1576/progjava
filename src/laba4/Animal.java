package laba4;

public class Animal implements NameAble {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
