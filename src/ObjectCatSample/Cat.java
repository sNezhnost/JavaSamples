package ObjectCatSample;

import java.awt.*;
/**
 * Created by TKolos on 26.02.2018.
 */
public class Cat {
    int paws;
    boolean fur;
    String name;
    boolean tail;
    Color eyeColor;
    double weight;
    boolean isAlive;
    static String rodoslovnaya = "Britain";
    static int counter = 0;

    public Cat()
    {
        counter++;
    }

    public Cat(int paws, boolean fur, String name, boolean tail, Color eyeColor, double weight)
    {
        this.paws = paws;
        this.fur = fur;
        this.name = name;
        this.tail = tail;
        this.eyeColor = eyeColor;
        this.weight = weight;
        counter++;
    }

    public Cat(int paws, boolean fur, String name, Color eyeColor, double weight)
    {
        this.paws = paws;
        this.fur = fur;
        this.name = name;
        this.eyeColor = eyeColor;
        this.weight = weight;
        counter++;
    }

    public Cat(int paws, boolean fur, String name, boolean tail, Color eyeColor, double weight, boolean isAlive) {
        this.paws = paws;
        this.fur = fur;
        this.name = name;
        this.tail = tail;
        this.eyeColor = eyeColor;
        this.weight = weight;
        this.isAlive = isAlive;
        counter++;
    }

    public Cat(int paws, boolean fur, String name) {
        this.paws = paws;
        this.fur = fur;
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getWeight()
    {
        return weight;
    }

    public void setWeight(double weight)
    {
        this.weight = weight;
    }

    public int getPaws() {
        return paws;
    }

    public void setPaws(int paws) {
        this.paws = paws;
    }

    public boolean isFur() {
        return fur;
    }

    public boolean isTail() {
        return tail;
    }

    public void setTail(boolean tail) {
        this.tail = tail;
    }

    public Color getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(Color eyeColor) {
        this.eyeColor = eyeColor;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }
}

