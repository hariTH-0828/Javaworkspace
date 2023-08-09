package workSpace.src.designPattern.creational.factory.os;

public class FactoryMain {

    public static void main(String[] args) {
        OS os = new MainWrapper().getInstance(new MainWrapper().getClose());
        os.spec();
    }

}
