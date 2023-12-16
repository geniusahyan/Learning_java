package Regular_expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexD3 {
    public static void main(String[] args) {
        int count =0;
        Pattern p = Pattern.compile("L[a-z]*n");
        Matcher m = p.matcher("Learn from the the best Expert Lrrrrn at Youtube and Lrrrrn enjoy this journey");
        while (m.find()) {
            count++;
            System.out.println("Count: " + count);
            System.out.println("Start() " + m.start());
            System.out.println("End() " + m.end());
        }
    }
}
