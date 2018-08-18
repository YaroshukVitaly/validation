import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {


        String whoGetPasport = "Ленинскй ОБЛ исполком";
        Pattern pattern = Pattern.compile("^[А-яа-я\\s]{1,60}$");
        Matcher matcher = pattern.matcher(whoGetPasport);
        if (matcher. matches()){
            System.out.println("WhoGetPasport is correct");
        } else{
            System.out.println("WhoGetPasport is incorrect");

        }

    }
}
