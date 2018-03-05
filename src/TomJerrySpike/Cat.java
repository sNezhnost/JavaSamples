package TomJerrySpike;

public class Cat implements Move, Go, Eat, BeEaten {
    String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void move() {
        System.out.println("Cat tramples");
    }

    @Override
    public void go() {
        System.out.println("Cat is going");
    }

    @Override
    public void eat() {
        System.out.println("Cat is eating something");
    }

    public void eat(Mouse mouse) {
        System.out.println("Cat is eating " + mouse);
    }

    @Override
    public void beEaten() {
        System.out.println("Cat is eaten");
    }

    @Override
    public String toString() {
        return name;
    }
}
