package Inheritance;

import NewPackage.SphericalHorse;

public class SphericalHorseInVacuum extends SphericalHorse implements Breathe {
    int a = 35;
    int b = 68;

    @Override
    public void neigh() {
        System.out.println("Horse is neighing in costume");
    }


    @Override
    public String toString() {
        return String.valueOf(a + b);
    }

    @Override
    public void breathe() {
        System.out.println("Ok, horse in vacuum can breathe in Vacuum");
    }
}
