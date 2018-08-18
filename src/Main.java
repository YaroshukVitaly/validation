import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {


        String brand = "BMW";
        Pattern pattern = Pattern.compile("^[A-za-z]{1,}$");
        Matcher matcher = pattern.matcher(brand);
        if (matcher. matches()){
            System.out.println("Brand is correct");
        } else{
            System.out.println("Brand is incorrect");
        }

    }
}
