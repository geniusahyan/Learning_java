package Regular_expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegexLookFind{
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("LV");
        Matcher matcher = pattern.matcher("LV stand LV for LearnVern");
        boolean isLookingAt = matcher.lookingAt();
        // boolean isFind = matcher.find();
        boolean isFind = matcher.find(12);
        if (isLookingAt){
            System.out.println("Matched");
        }else{
            System.out.println("Not Matched");
        }

        if (isFind){
            System.out.println("Matched");
        }else{
            System.out.println("Not Matched");
        }
    }
}