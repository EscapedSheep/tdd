import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MommifierTest {
    @Test
    void should_return_the_same_string_when_convert_given_string_have_less_than_30percent_of_vowels() {
        Mommifier mommifier = new Mommifier();
        String strToConvert = "short";
        String expected = mommifier.convert(strToConvert);
        assertEquals(expected, strToConvert);

    }

    @Test
    void should_return_the_same_string_when_convert_given_string_have_no_continuous_vowels() {
        Mommifier mommifier = new Mommifier();
        String strToConvert = "apple";
        String expected = mommifier.convert(strToConvert);
        assertEquals(expected, "apple");
    }

    @Test
    void should_return_string_with_mommy_when_convert_given_string_have_more_than_30percent_of_continuous_vowels() {
        Mommifier mommifier = new Mommifier();
        String strToConvert = "sheep";
        String expected = mommifier.convert(strToConvert);
        assertEquals(expected, "shemommyep");
    }

    @Test
    void should_return_string_with_mommy_when_convert_given_string_have_3_letters_of_continuous_vowels() {
        Mommifier mommifier = new Mommifier();
        String strToConvert = "sheeep";
        String expected = mommifier.convert(strToConvert);
        assertEquals(expected, "shemommyemommyep");
    }
}
