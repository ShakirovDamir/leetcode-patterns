package leetcode.two_sum_1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class TwoSumTest {

    private TwoSum twoSum;

    @BeforeEach
    void setUp() {
        twoSum = new TwoSum();
    }

    @Test
    void testWithHashMap() {
        assertThat(twoSum.twoSumWithHashMap(new int[]{2,7,11,15}, 9)).isEqualTo(new int[]{0, 1});
        assertThat(twoSum.twoSumWithHashMap(new int[]{2,15,11,5}, 20)).isEqualTo(new int[]{1, 3});
    }
}