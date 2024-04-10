package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class ShiftCharactersAndCapitalizeVowelsTest {

    @Test
    void vowelCapitalizingNotNeeded() {
        assertThat(ShiftCharactersAndCapitalizeVowels.apply("mama 45")).isEqualTo("nbnb 45");
    }

    @Test
    void vowelCapitalizingRequired() {
        assertThat(ShiftCharactersAndCapitalizeVowels.apply("tower")).isEqualTo("Upxfs");
    }

}