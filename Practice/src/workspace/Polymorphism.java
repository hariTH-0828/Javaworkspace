package workspace;


class Bike{
    void run(){
        System.out.println("Running..");
        String companyName = "Splender";
        System.out.println(companyName);
    }
}
class Splender extends Bike{
    @Override
    void run() {
        super.run();
        System.out.println("Running at 60kmph");
        int model = 10;
        System.out.println(model);
    }
}

public class Polymorphism{
    public static void main(String[] args) {
        Bike obj = new Splender();
        obj.run();
    }
}
