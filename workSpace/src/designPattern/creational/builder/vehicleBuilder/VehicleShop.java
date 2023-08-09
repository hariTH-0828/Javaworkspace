package workSpace.src.designPattern.creational.builder.vehicleBuilder;

public class VehicleShop{

    public static void main(String[] args) {
        Vehicle myBike = new VehicleManufacture().setColor("Blue")
                .setDesignType("AeroDynamic")
                .setEngineCC(250)
                .setEngineType("Petrol")
                .getCar();

        System.out.println(myBike);
    }
}
