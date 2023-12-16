package Regular_expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegexD1{
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("L[a-zA-Z]*n");
        Matcher matcher = pattern.matcher("LearnVern");
        boolean isMatched = matcher.matches();
        if (isMatched){
            System.out.println("Matched");
        }else{
            System.out.println("Not Matched");
        }
    }
}