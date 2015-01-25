package javacodes.strings;

public class ReverseWords {
    public String reverseWords(String input) {
        if (input == null || input.length() == 0) {
            return "";
        }
        String[] stringArray = input.split("([ ]+)");
        StringBuilder result = new StringBuilder();

        for (int i = stringArray.length - 1; i >= 0; i--) {

            System.out.println(stringArray[i]);
            if (stringArray[i] != " ") {
                result.append(stringArray[i]);
                result.append(" ");
            }
        }

        if(result.length() > 0){
        return result.substring(0, result.length() - 1);
        }
        else {
            return "";
        }
    }
}
