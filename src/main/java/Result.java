public class Result {

    private String flow;
    private double result;

    public Result(String flow1, double result1) {
        flow = flow1;
        result = result1;
    }


    public void storeResults(){
    String s = String.format("%s , %d", flow, result);
        System.out.println(s);

    }
}
//Result result = new Result(4.27, “USD to ILS”);