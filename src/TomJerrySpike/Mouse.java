package TomJerrySpike;

public class Mouse implements Go, BeEaten {
    String name;

    public Mouse(String name) {
        this.name = name;
    }

    @Override
    public void go() {
        System.out.println("Mouse is going");
    }

    @Override
    public void beEaten() {
        System.out.println("Mouse is eaten");
    }

    @Override
    public String toString() {
        return name;
    }
}
