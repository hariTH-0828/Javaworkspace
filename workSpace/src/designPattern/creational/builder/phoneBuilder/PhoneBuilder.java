package workSpace.src.designPattern.creational.builder.phoneBuilder;

public class PhoneBuilder {

    private String os;
    private int ram = 3;
    private int rom = 64;
    private double screenSize = 5.5;
    private String processor;
    private int battery = 3200;

    public PhoneBuilder setOs(String os) {
        this.os = os;
        return this;
    }

    public PhoneBuilder setRam(int ram) {
        this.ram = ram;
        return this;
    }

    public PhoneBuilder setRom(int rom) {
        this.rom = rom;
        return this;
    }

    public PhoneBuilder setScreenSize(double screenSize) {
        this.screenSize = screenSize;
        return this;
    }

    public PhoneBuilder setProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    public PhoneBuilder setBattery(int battery) {
        this.battery = battery;
        return this;
    }

    public Phone getPhone() {
        return new Phone(os, ram, rom, screenSize, processor, battery);
    }
}
