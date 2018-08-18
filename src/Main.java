import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {


        String numPassport = "635992";
        Pattern pattern = Pattern.compile("^[0-9]{1,7}$");
        Matcher matcher = pattern.matcher(numPassport);
        if (matcher. matches()){
            System.out.println("NumPassport is correct");
        } else{
            System.out.println("NumPassport is incorrect");

        }

    }
}
