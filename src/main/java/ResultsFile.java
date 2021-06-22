//singleton for writing results into a txt file

import java.io.*;
import java.util.ArrayList;

public class ResultsFile {

    private static ResultsFile text = null;

    private ResultsFile() {

    }

    public static ResultsFile getInstance() {      //a static method that has return type object of this singleton class
        if (text == null) {
            text = new ResultsFile();
        }
        return text;
    }

    public void resultWriting (ArrayList<Double> text) throws IOException {
        try{

            PrintStream ps = new PrintStream(new File("C:\\Users\\Erez\\Desktop\\results.txt"));
            ps.println(text);
            ps.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }


}

