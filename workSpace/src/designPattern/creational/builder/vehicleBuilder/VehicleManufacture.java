package workSpace.src.designPattern.creational.builder.vehicleBuilder;

public class VehicleManufacture {
    private String color;
    private String engineType;
    private String designType;
    private int engineCC;

    public VehicleManufacture setColor(String color) {
        this.color = color;
        return this;
    }

    public VehicleManufacture setEngineType(String engineType) {
        this.engineType = engineType;
        return this;
    }

    public VehicleManufacture setDesignType(String designType) {
        this.designType = designType;
        return this;
    }

    public VehicleManufacture setEngineCC(int engineCC) {
        this.engineCC = engineCC;
        return this;
    }


    public Bike getBike() {
        return new Bike(color, engineType, designType, engineCC);
    }

    public Car getCar() {
        return new Car(color, engineType, designType, engineCC);
    }
}
