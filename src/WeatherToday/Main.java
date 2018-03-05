package WeatherToday;

public class Main {
    public static void main(String[] args) {
        Today today = new Today();
        System.out.println("Today is " + today.getDate());
        System.out.println("The weather is " + today.getWeatherType());
    }
}
