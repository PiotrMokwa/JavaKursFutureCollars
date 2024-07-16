package Lesson10.Task4;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Main {
    public static void main(String[] args) {
        String[] data = {"342", "5.34", "756", "1.234e+07", "7.234243E-02", "6.09", "3457", "87", "1.0001", "3", "5"};
        String[] data1 = {"E", "2Ee", "3a", "5ee"};
        chooseIntegerNumbers(data, "\\.");
        chooseFloatNumbers(data, "\\.", "[Ee]");
        chooseScientificNumbers(data, "\\d+\\.\\d+[eE]");
    }
    public static void chooseIntegerNumbers(String[] data, String firstRegularExpression) {
        Pattern pattern = Pattern.compile(firstRegularExpression);
            System.out.print("1. Integer numbers: ");
            for (String text : data){
                Matcher matcher = pattern.matcher(text);
                boolean matchedInteger = matcher.find();
                if (!matchedInteger) {
                    System.out.print(text + ", ");
                }
            }
    }
        public static void chooseFloatNumbers(String[] data, String firstRegularExpression, String secondRegularExpression) {
            System.out.println();
            System.out.print("2. Float numbers: ");
            Pattern patternDot = Pattern.compile(firstRegularExpression);
            Pattern patternFloat = Pattern.compile(secondRegularExpression);
                for (String text : data) {
                    Matcher matcherFloat = patternFloat.matcher(text);
                    Matcher matcherDot = patternDot.matcher(text);
                    boolean matchedFloat = matcherFloat.find();
                    boolean matchedDot = matcherDot.find();
                        if (!matchedFloat & matchedDot) {
                            System.out.print(text + ", ");
                        }
                }
        }

    public static void chooseScientificNumbers(String[] data, String regularExpression) {
        System.out.println();
        System.out.print("3. Scientific notation numbers: ");
        Pattern patternScientific = Pattern.compile(regularExpression);
        for (String text : data) {
            Matcher matcherFloat = patternScientific.matcher(text);
            boolean matched = matcherFloat.find();
                if (matched) {
                    System.out.print(text + ", ");
                }
        }
    }
}
