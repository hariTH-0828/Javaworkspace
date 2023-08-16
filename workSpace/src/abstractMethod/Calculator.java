package workSpace.src.abstractMethod;

public abstract class Calculator {

    /* In abstract class can contain abstract method and non-abstract method.
     In abstract class, abstract methods are impossible to implement.
     Implementing a abstract method in some other class extend the abstract class to implement them.
     NOTE : Abstract method supports only two access-specifier : public, protected */

    public int addition(int valueA, int valueB) {
        return valueA + valueB;
    }

    public int subtract(int valueA, int valueB) {
        return valueA - valueB;
    }

    public int division(int valueA, int valueB){
        return valueA / valueB;
    }

    public int multiply(int valueA, int valueB) {
        return valueA * valueB;
    }

    public abstract int pow(int valueA);
    protected abstract double floatDivision(double valueA, double valueB);
}
