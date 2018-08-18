import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {


        String name = "Иванов";
        Pattern pattern = Pattern.compile("^[А-Яа-я]{4,16}$");
        Matcher matcher = pattern.matcher(name);
        if (matcher. matches()){
            System.out.println("Name is correct");
        } else{
            System.out.println("Name is incorrect");

        }

    }
}
