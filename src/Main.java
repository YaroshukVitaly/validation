import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {


        String mileage = "554300";
        Pattern pattern = Pattern.compile("^[0-9]{1,}$");
        Matcher matcher = pattern.matcher(mileage);
        if (matcher. matches()){
            System.out.println("Mileage is correct");
        } else{
            System.out.println("Mileage is incorrect");
        }

    }
}
