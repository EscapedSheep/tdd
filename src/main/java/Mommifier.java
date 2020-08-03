import java.util.ArrayList;
import java.util.List;

public class Mommifier {

    public static final String MOMMY = "mommy";

    String convert(String aString) {
        int length = aString.length();
        int vowelsCount = countVowelsOfStr(aString);

        if (vowelsCount/0.3 < length)
            return aString;

        char[]  charOfStr = aString.toCharArray();
        List<String> convertResult = new ArrayList<>();
        char previous = charOfStr[0];
        convertResult.add(String.valueOf(previous));
        for (int i = 1; i < charOfStr.length; i++) {
            char current = charOfStr[i];
            if (isVowel(previous) && !isVowel(current)) {
                convertResult.add(MOMMY);
            }
            convertResult.add(String.valueOf(current));
            previous = current;
        }
        if (isVowel(previous))
            convertResult.add(MOMMY);

        return String.join("",convertResult);

    }

    private Boolean isVowel(char aChar) {
        switch (aChar) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                return true;
        }
        return false;
    }

    private int countVowelsOfStr(String aString) {
        int vowelsCount = 0;
        char[]  charOfStr = aString.toCharArray();
        for (char c : charOfStr) {
            if (isVowel(c))
                vowelsCount += 1;
        }
        return vowelsCount;
    }
}
