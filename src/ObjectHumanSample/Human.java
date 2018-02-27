package ObjectHumanSample;
/**
 * Created by TKolos on 27.02.2018.
 */
public class Human {
    String sex;
    double height;
    double weight;
    String firstName;
    String lastName;
    short age;
    short iq;
    boolean hungry;
    boolean sleepy;
    int lifeSatisfaction = 100;
    static long population = 7300000000L;

    public Human() {
        population++;
    }

    public Human(String sex, String firstName, String lastName) {
        this.sex = sex;
        this.firstName = firstName;
        this.lastName = lastName;
        population++;
    }

    public Human(String sex, double height, double weight, String firstName, String lastName) {
        this.sex = sex;
        this.height = height;
        this.weight = weight;
        this.firstName = firstName;
        this.lastName = lastName;
        population++;
    }

    public Human(String sex, String firstName, String lastName, short age) {
        this.sex = sex;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        population++;
    }

    public Human(String firstName, String lastName, short age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        population++;
    }

    public Human(String sex, double height, double weight, String firstName, String lastName, short age, short iq) {
        this.sex = sex;
        this.height = height;
        this.weight = weight;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.iq = iq;
        population++;
    }

    public Human(String sex, double height, double weight, String firstName, String lastName, short age, short iq, boolean hungry, boolean sleepy) {
        this.sex = sex;
        this.height = height;
        this.weight = weight;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.iq = iq;
        this.hungry = hungry;
        this.sleepy = sleepy;
        population++;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public short getAge() {
        return age;
    }

    public void setAge(short age) {
        this.age = age;
    }

    public short getIq() {
        return iq;
    }

    public void setIq(short iq) {
        this.iq = iq;
    }

    public boolean isHungry() {
        return hungry;
    }

    public void setHungry(boolean hungry) {
        this.hungry = hungry;
    }

    public boolean isSleepy() {
        return sleepy;
    }

    public void setSleepy(boolean sleepy) {
        this.sleepy = sleepy;
    }

    public int getLifeSatisfaction() {
        return lifeSatisfaction;
    }

    public void setLifeSatisfaction(int lifeSatisfaction) {
        this.lifeSatisfaction = lifeSatisfaction;
    }

    public static long getPopulation() {
        return population;
    }

    public void eat(){
        if (this.hungry){
            this.hungry = false;
            this.lifeSatisfaction += 25;
        } else {
            this.sleepy = true;
        }
    }

    public void sleep(){
        if (!this.sleepy){
            this.sleepy = true;
            this.lifeSatisfaction += 25;
        }
    }

    public void rest(){
        this.lifeSatisfaction += 25;
    }

    public void getTired(){
        this.lifeSatisfaction -= 50;
    }
}
