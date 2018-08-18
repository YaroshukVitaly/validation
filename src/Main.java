import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {


        String whoGetDriveDoc = "ГАИ Гродно";
        Pattern pattern = Pattern.compile("^[А-яа-я\\s]{1,60}$");
        Matcher matcher = pattern.matcher(whoGetDriveDoc);
        if (matcher. matches()){
            System.out.println("WhoGetDriveDoc is correct");
        } else{
            System.out.println("WhoGetDriveDoc is incorrect");

        }

    }
}
