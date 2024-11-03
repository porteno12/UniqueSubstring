import csYa_ronny.UniqueSubstring;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UniqueSubstringTest {

    @Test
    public void testLongestUniqueSubstring() {

        // Test cases
        assertEquals("abc", UniqueSubstring.longestUniqueSubstring("abcabcbb"));
        assertEquals("b", UniqueSubstring.longestUniqueSubstring("bbbbb"));
        assertEquals("wke", UniqueSubstring.longestUniqueSubstring("pwwkew"));
        assertEquals("abcdef", UniqueSubstring.longestUniqueSubstring("abcdef"));
        assertEquals("", UniqueSubstring.longestUniqueSubstring(""));
    }
}
