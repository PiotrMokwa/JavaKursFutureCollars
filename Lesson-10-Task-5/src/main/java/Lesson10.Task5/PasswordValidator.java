package Lesson10.Task5;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class PasswordValidator {
    private final String password;
        public PasswordValidator(String password){
            this.password = password;
        }
        public boolean check(){
            Pattern passwordPattern = Pattern.compile("(?=.*[A-Z])(?=.*\\d)(?=.*.{7})(?!.*.(2024|24))");
            Matcher passwordMatcher = passwordPattern.matcher(this.password);
         return passwordMatcher.find();
        }
}
