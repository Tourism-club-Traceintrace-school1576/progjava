package laba4;

public class Planet implements NameAble {
    private String name;

    public Planet(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
