package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class LengthOfLastWordTest {

    private LengthOfLastWord lengthOfLastWord;

    @BeforeEach
    void setUp() {
        lengthOfLastWord = new LengthOfLastWord();
    }

    @Test
    void determine() {
        assertThat(lengthOfLastWord.determine("Hello")).isEqualTo(5);
        assertThat(lengthOfLastWord.determine("Hello World")).isEqualTo(5);
        assertThat(lengthOfLastWord.determine("   fly me   to   the moon  ")).isEqualTo(4);
        assertThat(lengthOfLastWord.determine("luffy is still joyboy")).isEqualTo(6);
    }

    @Test
    void determineWithoutTrim() {
        assertThat(lengthOfLastWord.determineWithoutTrim(" Hi ooo ")).isEqualTo(3);
        assertThat(lengthOfLastWord.determineWithoutTrim("Hello World")).isEqualTo(5);
        assertThat(lengthOfLastWord.determineWithoutTrim("   fly me   to   the moon  ")).isEqualTo(4);
        assertThat(lengthOfLastWord.determineWithoutTrim("luffy is still joyboy")).isEqualTo(6);
    }

    @Test
    void determineUsingRegex() {
        assertThat(lengthOfLastWord.determineUsingRegex(" Hi ooo ")).isEqualTo(3);
        assertThat(lengthOfLastWord.determineUsingRegex("Hello World")).isEqualTo(5);
        assertThat(lengthOfLastWord.determineUsingRegex("   fly me   to   the moon  ")).isEqualTo(4);
        assertThat(lengthOfLastWord.determineUsingRegex("luffy is still joyboy")).isEqualTo(6);
    }
}