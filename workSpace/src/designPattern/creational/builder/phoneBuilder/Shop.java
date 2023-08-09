package workSpace.src.designPattern.creational.builder.phoneBuilder;

public class Shop {

    public static void main(String[] args) {
        Phone myPhone = new PhoneBuilder().setOs("Android")
                .setRam(8)
                .setRom(256)
                .setBattery(5100)
                .setProcessor("Snapdragon 8Gen")
                .getPhone();

        System.out.println(myPhone);
    }
}
