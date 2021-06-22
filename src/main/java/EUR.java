import java.io.Serializable;

// another class of coin type ERU

public class EUR extends Coin implements Serializable {

    final double value = 4.23;  // the rate of Euro

    @Override
    public double getValue() {
        return value;
    }

    public double calculate(double input) {
        getValue();   //Call getValue() method from calculate() inside both USD and ILS classes to perform the calculation.
        double result = value*input;
        return result;
    }
}