public class Engine {
    private String type;
    private int horsepower;
    public Engine(String type, int horsepower) {
        this.type = type;
        this.horsepower = horsepower;
    }

    @Override
    public String toString() {
        return "SportEngine{" +
                "type='" + type + '\'' +
                ", horsepower=" + horsepower +
                '}';
    }
}
