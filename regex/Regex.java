package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("x");
        Matcher matcher = pattern.matcher("x");
        boolean m = matcher.matches();
        System.out.println(m);
    }
}
