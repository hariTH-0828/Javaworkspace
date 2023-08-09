package workSpace.src.designPattern.creational.builder.phoneBuilder;

public class Phone {
    private String os;
    private int ram;
    private int rom;
    private double screenSize;
    private String processor;
    private int battery;

    public Phone(String os, int ram, int rom, double screenSize, String processor, int battery) {
        this.os = os;
        this.ram = ram;
        this.rom = rom;
        this.screenSize = screenSize;
        this.processor = processor;
        this.battery = battery;
    }

    @Override
    public String toString() {
        return "Phone [" +
                "os='" + os + '\'' +
                ", ram=" + ram +
                ", rom=" + rom +
                ", screenSize=" + screenSize +
                ", processor='" + processor + '\'' +
                ", battery=" + battery +
                ']';
    }
}
