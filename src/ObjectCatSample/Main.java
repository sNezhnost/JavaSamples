package ObjectCatSample;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
//          Cat murka = new Cat();
//        murka.fur = true;
//        murka.isAlive = true;
//        murka.name = "Murka";
//        murka.paws = 4;
//        murka.tail = true;
//        murka.eyeColor = Color.RED;
//        //murka.eyeColor = new Color(255,0,0,90);
//        murka.weight = 3.0;

        Cat murka = new Cat(4,true,"Murka",true,Color.black, 4.1);
        System.out.println();
        System.out.println(murka.weight);
        System.out.println(murka.fur);
        System.out.println(murka.isAlive);
        System.out.println(murka.name);
        System.out.println(murka.paws);
        System.out.println(murka.tail);
        System.out.println(murka.eyeColor);
        System.out.println(Cat.rodoslovnaya);
        System.out.println("Counter is " + Cat.counter);

        Cat vaska = new Cat ();
        vaska.fur = true;
        vaska.isAlive = true;
        vaska.name = "Vaska";
        vaska.paws = 4;
        vaska.tail = true;
        vaska.eyeColor = Color.blue;
        //murka.eyeColor = new Color(255,0,0,90);
        vaska.weight = 3.5;
        System.out.println(vaska.weight);
        System.out.println(vaska.fur);
        System.out.println(vaska.isAlive);
        System.out.println(vaska.name);
        System.out.println(vaska.paws);
        System.out.println(vaska.tail);
        System.out.println(vaska.eyeColor);
        System.out.println("somegetter " + vaska.getName());
        vaska.setName("SomeNewName");
        System.out.println("getter " + vaska.getName());
        vaska.setWeight(4.1);
        System.out.println("getter " + vaska.getWeight());

        Cat tom = new Cat(4, false, "Tom");
        System.out.println("New cat's name is " + tom.getName());
        Cat angela = new Cat(4, true, "Angela", Color.blue, 3.1);
        System.out.println("New cat's name is " + angela.getName());
        Cat angel = new Cat(4, true, "Angel", true, Color.black, 4.2, true);
        System.out.println("New cat's name is " + angel.getName());
        System.out.println("Counter is " + Cat.counter);

    }
}
