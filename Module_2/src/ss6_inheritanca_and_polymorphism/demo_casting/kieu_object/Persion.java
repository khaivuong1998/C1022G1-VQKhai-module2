package ss6_inheritanca_and_polymorphism.demo_casting.kieu_object;

public class Persion {
    private String name;

    public Persion() {
    }

    public Persion(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Persion{" +
                "name='" + name + '\'' +
                '}';
    }
}
