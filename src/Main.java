import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {


        String fuelСonsumption = "8";
        Pattern pattern = Pattern.compile("^[0-9]{1,}$");
        Matcher matcher = pattern.matcher(fuelСonsumption);
        if (matcher. matches()){
            System.out.println("FuelСonsumption is correct");
        } else{
            System.out.println("FuelСonsumption is incorrect");
        }
    }
}
