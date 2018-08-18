import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {


        String seriesPassport = "BM";
        Pattern pattern = Pattern.compile("^(?:AB|BM|HB|KH|MP|MC|KB|PP){1}$");
        Matcher matcher = pattern.matcher(seriesPassport);
        if (matcher. matches()){
            System.out.println("SeriesPassport is correct");
        } else{
            System.out.println("SeriesPassport is incorrect");
        }

    }
}
