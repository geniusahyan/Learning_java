package Regular_expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegexGroup {
    public static void main(String[] args) {
        int count =0;
        Pattern p = Pattern.compile("(You)(Tube)");
        Matcher m = p.matcher("You from Tube and enjoy YouTube");
        while (m.find()) {
            count++;
            System.out.println("Count: "+ count);
            System.out.println("Start(1) " + m.start(1));
            System.out.println("Start(2) " + m.start(2));
            System.out.println("End(1) " + m.end(1));
            System.out.println("End(2) " + m.end(2));
        }
    }
}
