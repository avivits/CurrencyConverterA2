import java.nio.channels.ScatteringByteChannel;
import java.time.Year;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyConverter {


    public static void main(String[] args) throws NullPointerException {

        //------------------------------choice screen--------------------------

        boolean gameOn = true;
        int choice;             // 1/2 option
        double input;           //how much to convert
        double result;          //converting result
        Scanner scannerChoice;
        Scanner scannerInput;
        CoinFactory coinFactory = new CoinFactory();    //using enum choice
        ArrayList<Double>resultList=new ArrayList<>();  //for storing all results
        ResultsFile file = ResultsFile.getInstance();   //for writing all results
        String start;           //for start over

        System.out.println("Welcome to currency converter");

        while (gameOn)

          {
            try {
                System.out.println("Please choose an option (1/2):\n" + "1. Dollars to Shekels \n" + "2. Shekels to Dollars");
                scannerChoice = new Scanner(System.in);
                choice = scannerChoice.nextInt();

                switch (choice) {

                    case 1:
                        try {
                            System.out.println("Please enter an amount to convert");
                            scannerInput = new Scanner(System.in);
                            input = scannerInput.nextDouble();
                            Coin usd = coinFactory.getCoin(Coins.USD); //create and call USD
                            result = usd.calculate(input);
                            resultList.add(result);              //storing each result in array
                            System.out.println("your result is: " + result); //Use calculate() from ILS/USD classes to perform the calculations main

                        } catch (InputMismatchException e) {
                            System.out.println("case 1-Invalid choice, please try again");
                        }
                        break;

                    case 2:
                        try {
                            System.out.println("Please enter an amount to convert");
                            scannerInput = new Scanner(System.in);
                            input = scannerInput.nextDouble();
                            Coin ils = coinFactory.getCoin(Coins.ILS); //create and call ILS
                            result = ils.calculate(input);
                            resultList.add(result);         //storing each result in array
                            System.out.println("your result is: " + result); //Use calculate() from ILS/USD classes to perform the calculations main

                        } catch (InputMismatchException e) {
                            System.out.println("case 2-Invalid choice, please try again");
                        }
                        break;

                    default:
                        System.out.println("default-Invalid choice, please try again"); //if user choose other value
                        break;
                }

                    System.out.println("to start over choose Y / N ");
                while (gameOn) {
                    Scanner scannerStart = new Scanner(System.in);
                    start = scannerStart.next();

                    if (start.equalsIgnoreCase("Y")) {break;}
                    else {
                        if (start.equalsIgnoreCase("N")) {
                            gameOn = false;

                        } else {
                            System.out.println("choose just Y / N");   //if user choose other value
                        }
                    }
                } //while loop to start over

            } catch (IllegalArgumentException e) {
                System.out.println("IllegalArgumentException- Invalid choice, please try again");
            } catch (NullPointerException e) {
                System.out.println("null exception");
            } catch (InputMismatchException e) {
                System.out.println("InputMismatchException-Invalid choice, please try again");
            }
        } //while loop gameOn

        System.out.println("Thanks for using our currency converter");  //if user choose N
        System.out.println("these are all of your results: ");          // print all previous results from results list.

        for (Double d: resultList) {        //printing all results stored in the array
            try{
            System.out.println(d);
            file.resultWriting(resultList);     // writing array into a file
        }catch (Exception e) {
                e.printStackTrace(); }

        }

    }
}











