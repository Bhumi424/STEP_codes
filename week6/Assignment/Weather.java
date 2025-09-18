public // HW PROBLEM 6: Weather System Hierarchy

class Weather {
    protected String condition;

    public Weather(String condition) {
        this.condition = condition;
        System.out.println("Weather constructor called");
    }

    public void showWeather() {
        System.out.println("Weather condition: " + condition);
    }
}

class Storm extends Weather {
    protected int windSpeed;

    public Storm(String condition, int windSpeed) {
        super(condition);
        this.windSpeed = windSpeed;
        System.out.println("Storm constructor called");
    }

    @Override
    public void showWeather() {
        super.showWeather();
        System.out.println("Storm -> Wind Speed: " + windSpeed + " km/h");
    }
}

class Thunderstorm extends Storm {
    private boolean lightning;

    public Thunderstorm(String condition, int windSpeed, boolean lightning) {
        super(condition, windSpeed);
        this.lightning = lightning;
        System.out.println("Thunderstorm constructor called");
    }

    @Override
    public void showWeather() {
        super.showWeather();
        System.out.println("Thunderstorm -> Lightning: " + lightning);
    }
}

class Sunshine extends Weather {
    private int temperature;

    public Sunshine(String condition, int temperature) {
        super(condition);
        this.temperature = temperature;
        System.out.println("Sunshine constructor called");
    }

    @Override
    public void showWeather() {
        super.showWeather();
        System.out.println("Sunshine -> Temperature: " + temperature + "°C");
    }
}

public class WeatherTest {
    public static void main(String[] args) {
        Weather[] forecasts = {
            new Weather("Generic Weather"),
            new Storm("Strong Storm", 80),
            new Thunderstorm("Severe Thunderstorm", 120, true),
            new Sunshine("Clear Sky", 30)
        };

        System.out.println("\n--- Forecasts ---");
        for (Weather w : forecasts) {
            w.showWeather();
            System.out.println();
        }
    }
}
 {
    
}
