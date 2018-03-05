package TomJerrySpike;

public class Dog implements Go, Eat {
    String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void go() {
        System.out.println("Dog is going");
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating something");
    }

    public void eat(Mouse mouse) {
        System.out.println("Dog is eating " + mouse);
    }

    public void eat(Cat cat) {
        System.out.println("Dog is eating " + cat);
    }
}
