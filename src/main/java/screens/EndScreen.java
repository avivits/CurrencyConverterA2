package screens;

import javax.xml.transform.Result;
import java.util.ArrayList;
import java.awt.Desktop;
import java.io.*;

public class EndScreen {

    ResultsFile file = ResultsFile.getInstance();   //for writing all results

    public void writeResult(ArrayList<Double> resultList) {
        System.out.println("Thanks for using our currency converter");  //if user choose N
        System.out.println("these are all of your results: ");          // print all previous results from results list.

        for (Double d : resultList) {        //printing all results stored in the array
            try {
                System.out.println(d);
                file.resultWriting(resultList);     // writing array into a file
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }

    public void openFile() {
        try {
            File file = new File("C:\\Users\\Erez\\Desktop\\results.txt");
            if (!Desktop.isDesktopSupported())//check if Desktop is supported by Platform or not
            {
                System.out.println("not supported");
                return;
            }
            Desktop desktop = Desktop.getDesktop();
            if (file.exists()) {         //checks file exists or not
                desktop.open(file);              //opens the specified file
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


