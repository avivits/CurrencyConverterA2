import java.util.ArrayList;

public class EndScreen {

    ResultsFile file = ResultsFile.getInstance();   //for writing all results

    public void writeResult(ArrayList<Double> resultList)
    {
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
