import java.util.*;

public class longestconsecutiveelements {

    public int longestConsecutive(int[] nums) {
        if (nums.length == 0)
            return 0;
        // Arrays.sort(nums);
        // int c = 1, max = 0;
        // for (int i = 0; i < nums.length - 1; i++) {
        // int val = Math.abs(nums[i] - nums[i + 1]);
        // if (val == 1)
        // c++;
        // else if (val == 0)
        // continue;
        // else {
        // max = Math.max(c, max);
        // c = 1;
        // }
        // }
        // return Math.max(max, c);
        Set<Integer> ls = new HashSet<>();
        int max = 1;
        for (int i = 0; i < nums.length; i++)
            ls.add(nums[i]);
        for (Integer n : ls) {
            if (!ls.contains(n - 1)) {
                int cnt = 1;
                int x = n;
                while (ls.contains(x + 1)) {
                    cnt++;
                    x++;
                }
                max = Math.max(max, cnt);
            }
        }
        return max;
    }

}
