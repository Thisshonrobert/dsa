
import java.util.*;

public class leaderelement {

    public static List<Integer> superiorElements(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.length;
        // Last element of an array is always a leader,
        // push into ans array.
        int max = arr[n - 1];

        ans.add(arr[n - 1]);

        // Start checking from the end whether a number is greater
        // than max no. from right, hence leader.
        for (int i = n - 2; i >= 0; i--)
            if (arr[i] > max) {
                ans.add(arr[i]);
                max = arr[i];
            }

        return ans;

    }
}
