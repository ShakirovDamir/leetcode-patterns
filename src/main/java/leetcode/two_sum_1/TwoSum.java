package leetcode.two_sum_1;

import java.util.HashMap;
import java.util.Map;

/**
 * https://www.youtube.com/watch?v=fXSUganWkco Eugene Suleimanov
 *
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 */

public class TwoSum {

    //O(1)
    public int[] twoSumWithHashMap(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int requaredNumber = target - nums[i];
            if (map.containsKey(requaredNumber) && map.get(requaredNumber) != i) {
                return new int[] {i, map.get(requaredNumber)};
            }
        }
        throw new IllegalArgumentException("No solution for defined input data");
    }
}
