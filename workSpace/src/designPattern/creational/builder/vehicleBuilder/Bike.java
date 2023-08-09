package workSpace.src.designPattern.creational.builder.vehicleBuilder;

public class Bike implements Vehicle {
    private String color;
    private String engineType;
    private String designType;
    private int engineCC;

    public Bike(String color, String engineType, String designType, int engineCC) {
        this.color = color;
        this.engineType = engineType;
        this.designType = designType;
        this.engineCC = engineCC;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "color='" + color + '\'' +
                ", engineType='" + engineType + '\'' +
                ", designType='" + designType + '\'' +
                ", engineCC=" + engineCC +
                '}';
    }
}
