package workSpace.src.abstractMethod;

    /*
      If extend the abstract class in a class then the abstract methods in a abstract class have their own access specifier
      It can be same in extended class. or else ranking wise. Only possible change is protected to public.
    */
public class ScientificCalculator extends Calculator{
    @Override
    public int pow(int valueA) {
        return valueA * valueA;
    }

    @Override
    public double floatDivision(double valueA, double valueB) {
        return (double) valueA / valueB;
    }


    public static void main(String[] args) {
        ScientificCalculator calculator = new ScientificCalculator();
        System.out.println("Addition : "+calculator.addition(2, 3));
        System.out.println("Subtraction : "+calculator.subtract(4, 2));
        System.out.println("Multiplication :"+calculator.multiply(4, 4));
        System.out.println("Division : "+calculator.division(6,2));
        System.out.println("Power : "+calculator.pow(4));
        System.out.println("Decimal Division : "+calculator.floatDivision(5,2));
    }
}
