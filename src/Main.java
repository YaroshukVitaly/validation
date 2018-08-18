import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {


        String numDriveDoc = "635992";
        Pattern pattern = Pattern.compile("^[0-9]{1,6}$");
        Matcher matcher = pattern.matcher(numDriveDoc);
        if (matcher. matches()){
            System.out.println("NumDriveDoc is correct");
        } else{
            System.out.println("NumDriveDoc is incorrect");
        }

    }
}
