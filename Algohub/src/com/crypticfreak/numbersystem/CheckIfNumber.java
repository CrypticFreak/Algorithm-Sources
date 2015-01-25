package javacodes.numbersystem;

import java.util.regex.Pattern;

/**
 * Created by Ankur K on 11/4/14.
 */
public class CheckIfNumber {
    public boolean isNumber(String s) {
        Pattern p = Pattern.compile("(([+-]*)((([0-9]+)(.))*([0-9]+))*)(e[0-9]+)*");
        return p.matcher(s).find();
    }
}