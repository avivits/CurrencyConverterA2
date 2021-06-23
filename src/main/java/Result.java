import java.util.IllegalFormatConversionException;

public class Result {

    private String flow;
    private double result;
    private String s;



    public Result( String flow1, double result1) {
        flow = flow1;
        result = result1;
        System.out.println( " result1-" +result1+ " flow1-" + flow1 );

    }


    public String storeResults() {
        try {
             s = String.format("%s,%s", flow, result);
            System.out.println(s);

        } catch (IllegalFormatConversionException e) {
            System.out.println("illegal");
        }
        return s;
    }

}