package Regular_expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexReplace {
    public static void main(String[] args) {
        String s1 = "Welcome                 to YouTube            and Enjoy Your         Learning";
        Pattern p1 = Pattern.compile("\\s{2,}");
        Matcher m1 = p1.matcher(s1);

        String replaceString1 = m1.replaceAll(" ");
        System.out.println( "Original String: " + s1);
        System.out.println( "ReplaceAll String: " + replaceString1);

        String replaceString2 = m1.replaceFirst(" ");
        System.out.println( "Original String: " + s1);
        System.out.println( "ReplaceFirst String: " + replaceString2);
        
        String s2 = "I Have 1Doller";
        Pattern p2 = Pattern.compile("1Doller");
        Matcher m2 = p2.matcher(s2);

        String replaceString3 = m2.replaceAll(m2.quoteReplacement("1$"));
        System.out.println( "Original String: " + s2);
        System.out.println( "QuoteReplacement String: " + replaceString3);


    }
}
