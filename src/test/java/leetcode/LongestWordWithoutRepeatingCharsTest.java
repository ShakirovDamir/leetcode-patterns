package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class LongestWordWithoutRepeatingCharsTest {

    private LongestWordWithoutRepeatingChars longestWordWithoutRepeatingChars;

    @BeforeEach
    void setUp() {
        longestWordWithoutRepeatingChars = new LongestWordWithoutRepeatingChars();
    }

    @Test
    void determine() {
        assertThat(longestWordWithoutRepeatingChars.determine("")).isEqualTo(0);
        assertThat(longestWordWithoutRepeatingChars.determine("abcabcbb")).isEqualTo(3);
        assertThat(longestWordWithoutRepeatingChars.determine("bbbbb")).isEqualTo(1);
        assertThat(longestWordWithoutRepeatingChars.determine("pwwkew")).isEqualTo(3);
    }
}