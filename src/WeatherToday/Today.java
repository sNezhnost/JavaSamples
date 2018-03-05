package WeatherToday;

import java.util.GregorianCalendar;

public class Today implements Weather{
    GregorianCalendar date;

    public Today() {
        this.date = new GregorianCalendar();
    }

    public String getDate() {
        String s = date.get(GregorianCalendar.DATE) + "." + date.get(GregorianCalendar.MONTH)+ "." + date.get(GregorianCalendar.YEAR);
        return s;
    }

    @Override
    public String getWeatherType() {
        return Weather.type;
    }
}
