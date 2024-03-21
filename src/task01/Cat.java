package task01;

public class Cat extends Animal {
//    private String name;

    public Cat(String name) {
        super(name);
//        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        super.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
