package Inheritance;

public class Main {
    public static void main(String[] args) {
        SphericalHorseInVacuum sphericalHorseInVacuum = new SphericalHorseInVacuum();
        sphericalHorseInVacuum.neigh();
        //sphericalHorseInVacuum.gallop();
        sphericalHorseInVacuum.breathe();
        System.out.println(sphericalHorseInVacuum);
        SphericalHorseOnSun sphericalHorseOnSun = new SphericalHorseOnSun();
        sphericalHorseOnSun.neigh();
        //sphericalHorseOnSun.gallop();
        sphericalHorseOnSun.breathe();
    }
}
