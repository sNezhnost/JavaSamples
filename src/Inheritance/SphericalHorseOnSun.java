package Inheritance;

import NewPackage.SphericalHorse;

public class SphericalHorseOnSun extends SphericalHorse implements Breathe {
    @Override
    public void neigh() {
        System.out.println("Horse is neighing on sun");
    }

    @Override
    public void breathe() {
        System.out.println("Ok, horse can now breathe on sun");
    }
}
