package Regular_expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexQuantifier {
    public static void main(String[] args) {
        // String regex = "a*"; // a repeated zero or more times
        // Pattern pattern = Pattern.compile(regex);
        // Matcher matcher = pattern.matcher("a");
        // System.out.println(matcher.matches());

        boolean isMatched = Pattern.matches("[0-9]?", "16");
        System.out.println(isMatched);

    }
}
