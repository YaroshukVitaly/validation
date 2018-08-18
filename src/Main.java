import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {


        String serialDriveDoc = "AA2";
        Pattern pattern = Pattern.compile("^[0-9A-z]{1,3}$");
        Matcher matcher = pattern.matcher(serialDriveDoc);
        if (matcher. matches()){
            System.out.println("SerialDriveDoc is correct");
        } else{
            System.out.println("SerialDriveDoc is incorrect");
        }

    }
}
