import java.io.Serializable;

// 2 classes ILS and USD that extends Coin class, and implement the abstract method getValue()

public class ILS extends Coin implements Serializable {

   final double value = 0.28;  // the rate of Shekels

   @Override
    public double getValue() {
        return value;
    }

    @Override
    public double calculate(double input) {
        getValue();   //Call getValue() method from calculate() inside both USD and ILS classes to perform the calculation.
        double result = value*input;
        return result;
    }
}
