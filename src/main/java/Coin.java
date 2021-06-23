
//an abstract class named Coin with abstract method getValue() which returns a double

public abstract class  Coin implements ICalculate {

    public abstract double getValue();

    public double calculate(double d) {return d; }

    public abstract String flowChoice() ;

}
