import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {


        String email = "73rhru@mail.ru";
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9]{1,}"+"((\\.|\\_|-{0,1})[a-zA-Z0-9]{1,})*"+"@"
        +"[a-zA-Z0-9]{1,}"+"((\\.|\\_|-{0,1})[a-zA-Z0-9]{1,})*"+"\\.[a-zA-Z]{2,}$");
        Matcher matcher = pattern.matcher(email);
        if (matcher. matches()){
            System.out.println("Email is correct");
        } else{
            System.out.println("Email is incorrect");

        }

    }
}
