package workspace;

class Company{
    String name = "Avasoft";
}

class Employee extends Company{
    int unit = 5000;
}
public class Inheritance extends Employee {
    public static void main(String[] args) {
        Inheritance b = new Inheritance();

        for(int i = 0; i < 10; i++){
            System.out.println(b.unit);
            System.out.println(b.name);
        }
    }

}