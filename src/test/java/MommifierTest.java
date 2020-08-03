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
    void should_return_string_add_mommy_when_convert_given_string_have_more_than_30percent_of_vowels() {
        Mommifier mommifier = new Mommifier();
        String strToConvert = "apple";
        String expected = mommifier.convert(strToConvert);
        assertEquals(expected, "amommypplemommy");
    }
}
