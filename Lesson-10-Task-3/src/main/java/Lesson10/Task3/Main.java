package Lesson10.Task3;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Main {
    public static void main(String[] args){
        String[] addressesURL = {"http://www.onet.pl",
                "https://mail.google.com",
                "http://wiadmosci.onet.pl",
                "http://onet.pl"};
        validatorURL(addressesURL);
    }
    public static void validatorURL(String[] textToValidate){
        Pattern addressPattern = Pattern.compile("https?://[a-z]+\\.?[a-z]+\\.[a-z]+");
        for (String adress : textToValidate){
            Matcher addressMatcher = addressPattern.matcher(adress);
            boolean matches =   addressMatcher.find();
            System.out.println(matches);
        }
    }
}
