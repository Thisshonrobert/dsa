public class rearrangeArray {

    public static void main(String[] args) {
        int nums[] = { 1, 2, -5, -4, };
        int pos = 0, neg = 1;
        int ans[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                ans[pos] = nums[i];
                pos += 2;
            } else {
                ans[neg] = nums[i];
                neg += 2;
            }

        }
        System.out.println(ans);
    }
}
