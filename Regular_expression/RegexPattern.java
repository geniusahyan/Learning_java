package Regular_expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPattern {
    public static void main(String[] args) {
        // String s1 = "Something";
        String s1 = "aslam@gasdmail.com";
        // Pattern p1 = Pattern.compile("[a-e]");
        // Pattern p1 = Pattern.compile("[a-zA-Z]+");
        Pattern p1 = Pattern.compile("^[a-zA-Z0-9._%+-]+@gmail\\.com$");
        Matcher m1 = p1.matcher(s1);
        System.out.println( "Match: "+ m1.matches());
    }
}
