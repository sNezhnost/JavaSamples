package NewPackage;

public abstract class SphericalHorse {
    private int a = 35;

    public abstract void neigh();

    public int getA() {
        return a;
    }

    private void gallop() {
        for (int i = 0; i < 10; i++) {
            a *= i;
        }
    }
    public int gallop(String s) {
        gallop();
        return a + Integer.parseInt(s);
    }

}
