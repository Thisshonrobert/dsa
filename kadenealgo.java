//subarray with maxsum 
public class kadenealgo {
    public static void main(String[] args) {
        int nums[] = { -1, -2, 3, 4, -3, 5, 7, 2 };
        int n = nums.length;
        int max = nums[0], sum = 0;

        for (int i = 0; i < n; i++) {
            sum += nums[i];
            max = Math.max(sum, max);

            if (sum < 0)
                sum = 0;
        }
        System.out.println(max);
    }

}
