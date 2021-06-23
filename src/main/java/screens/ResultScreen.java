package screens;

//showing 1 result each time on screen and create an array list to store them +

import javax.xml.transform.Result;
import java.util.ArrayList;
import java.util.Scanner;

public class ResultScreen {

    public ArrayList<Double> resultList = new ArrayList<>();  //for storing all results

    public void getResult(double result)
    {
        System.out.println("your result is: " + result);
        resultList.add(result);              //storing each result in array

    }

    public ArrayList<Double> returnResultList( )     // for writing in a text file in EndScreen class
    {
        return resultList;
    }

    public boolean startOver(boolean gameOn)
    {
        String start;           //for start over

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

        return gameOn;
    }
}
