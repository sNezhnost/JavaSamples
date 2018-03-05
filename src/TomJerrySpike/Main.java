package TomJerrySpike;

public class Main {

    public static void main(String[] args) {
        Cat tom = new Cat("Tom");
        Mouse jerry = new Mouse("Jerry");
        Dog spike = new Dog ("Spike");

        tom.move();
        tom.go();
        tom.eat(jerry);
        spike.eat();
        spike.eat(tom);

    }

}
