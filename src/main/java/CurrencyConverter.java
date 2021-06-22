import screens.ChoiceScreen;
import screens.EndScreen;
import screens.ResultScreen;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CurrencyConverter {


    public static void main(String[] args) throws NullPointerException {

        boolean gameOn = true;
        int choice;             // 1/2 option
        Scanner scannerChoice;
        CoinFactory coinFactory = new CoinFactory();    //using enum choice
        ChoiceScreen choiceScreen = new ChoiceScreen();
        ResultScreen resultScreen = new ResultScreen();
        EndScreen endScreen = new EndScreen();

        //-------------------------------------welcome screen-----------------------------------------------------

        System.out.println("**** Welcome to currency converter ****");
        System.out.println("*************************************************");

        while (gameOn) {
            try {
                System.out.println("Please choose an option (1/2):\n" + "1. Dollars to Shekels \n" + "2. Shekels to Dollars");
                scannerChoice = new Scanner(System.in);
                choice = scannerChoice.nextInt();

                switch (choice) {
                    case 1:
                        try {
                            Coin usd = coinFactory.getCoin(Coins.USD); //create and call USD
                            resultScreen.getResult(usd.calculate(choiceScreen.getChoice())); //Use calculate() from ILS/USD classes to perform the calculations main

                        } catch (InputMismatchException e) {
                            System.out.println("Invalid choice, please try again");
                        }
                        break;

                    case 2:
                        try {
                            Coin ils = coinFactory.getCoin(Coins.ILS); //create and call ILS
                            resultScreen.getResult(ils.calculate(choiceScreen.getChoice()));  //Use calculate() from ILS/USD classes to perform the calculations main

                        } catch (InputMismatchException e) {
                            System.out.println("Invalid choice, please try again");
                        }
                        break;

                    default:
                        System.out.println("Invalid choice, please try again"); //if user choose other value
                        break;
                }

                gameOn = resultScreen.startOver(gameOn);      //---------------Result screen------------------

            } catch (IllegalArgumentException e) {
                System.out.println("Invalid choice, please try again");
            } catch (NullPointerException e) {
                System.out.println("null exception");
            } catch (InputMismatchException e) {
                System.out.println("Invalid choice, please try again");
            }
        } //while loop gameOn

        endScreen.writeResult(resultScreen.returnResultList());    // -----------End Screen-------------------

    }
}











