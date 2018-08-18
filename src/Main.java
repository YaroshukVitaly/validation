import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {


        String birthPlace = "Гродненская обл. г.Гродно";
        Pattern pattern = Pattern.compile("^[А-яа-я\\s\\.\\,]{1,60}$");
        Matcher matcher = pattern.matcher(birthPlace);
        if (matcher. matches()){
            System.out.println("BirthPlace is correct");
        } else{
            System.out.println("BirthPlace is incorrect");

        }

    }
}
