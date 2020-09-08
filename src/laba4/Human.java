package laba4;

public class Human implements NameAble {
    private String name;

    public Human(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
