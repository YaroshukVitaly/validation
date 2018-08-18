import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {


        String year = "1988";
        Pattern pattern = Pattern.compile("^\\d{4}$");
        Matcher matcher = pattern.matcher(year);
        if (matcher. matches()){
            System.out.println("Year is correct");
        } else{
            System.out.println("Year is incorrect");
        }

    }
}
