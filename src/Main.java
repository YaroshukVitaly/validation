import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {


        String password = "rfhhfh56WQnc";
        Pattern pattern = Pattern.compile("(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9@#$%]).{8,16}$");
        Matcher matcher = pattern.matcher(password);
        if (matcher. matches()){
            System.out.println("Password is correct");
        } else{
            System.out.println("Password is incorrect");

        }

    }
}
