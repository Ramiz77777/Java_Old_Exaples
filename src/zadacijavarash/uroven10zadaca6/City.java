package zadacijavarash.uroven10zadaca6;

public class City {
    private String name;
    private int temperature;

    public City(String name, int temperature) {
        this.name = name;
        this.temperature = temperature;
    }

    public String getName() {
        return name;
    }

    public int getTemperature() {
        return temperature;
    }



    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}
