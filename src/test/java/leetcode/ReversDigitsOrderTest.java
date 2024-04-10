package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ReversDigitsOrderTest {

    @Test
    void usingString() {
        assertThat(ReversDigitsOrder.usingString(0)).isZero();
        assertThat(ReversDigitsOrder.usingString(12389)).isEqualTo(98321);
        assertThat(ReversDigitsOrder.usingString(-123)).isEqualTo(-321);
    }

    @Test
    void usingNumber() {
        assertThat(ReversDigitsOrder.usingNumber(0)).isZero();
        assertThat(ReversDigitsOrder.usingNumber(12389)).isEqualTo(98321);
        assertThat(ReversDigitsOrder.usingNumber(-123)).isEqualTo(-321);
    }
}