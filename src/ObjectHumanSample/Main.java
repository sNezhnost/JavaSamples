package ObjectHumanSample;
/**
 * Created by TKolos on 27.02.2018.
 */
public class Main {
    public static void main(String[] args) {
        Human mother = new Human("female", 1.71, 56.0, "Anna", "Koval");
        Human father = new Human("male", 1.92, 83.4, "Ivan", "Koval", (short) 35, (short) 127, true, false);
        Human son = new Human("male", "Igor", "Koval", (short) 9);
        Human kid = new Human("Sasha", "Koval", (short) 1);
        System.out.println();
    }
}
