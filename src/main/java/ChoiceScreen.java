import java.util.Scanner;
//  get from user  how much to convert

public class ChoiceScreen {

    public double getChoice(){
        double input;           //user choose how much to convert
        Scanner scannerInput;
        System.out.println("Please enter an amount to convert");
        scannerInput = new Scanner(System.in);
        input = scannerInput.nextDouble();
        return input;
    }
}
