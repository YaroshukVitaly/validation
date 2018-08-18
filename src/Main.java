import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {


        String expirtyDate = "05.2019";
        Pattern pattern = Pattern.compile("^(0\\d|1[012])\\.(\\d{4})$");
        Matcher matcher = pattern.matcher(expirtyDate);
        if (matcher. matches()){
            System.out.println("ExpirtyDate is correct");
        } else{
            System.out.println("ExpirtyDate is incorrect");
        }

    }
}
