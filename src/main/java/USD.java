import java.io.Serializable;

// 2 classes ILS and USD that extends Coin class, and implement the abstract method getValue()

public class USD extends Coin implements Serializable {

    private final double value = 3.52; // the rate of Dollars

    @Override
    public double getValue() {
        return value;
    }

    @Override
    public double calculate(double input) {
        getValue();    //Call getValue() method from calculate() inside both USD and ILS classes to perform the calculation.
        double result = value*input;
        return result;
    }

    public String flowChoice (){
        return "“USD to ILS";
    }
}
