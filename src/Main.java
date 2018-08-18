import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {


        String phoneNum = "+375293113322";
        Pattern pattern = Pattern.compile("^((\\+?375)([0-9]){9})$");
        Matcher matcher = pattern.matcher(phoneNum);
        if (matcher. matches()){
            System.out.println("Phone number is correct");
        } else{
            System.out.println("Phone number is incorrect");

        }

    }
}
