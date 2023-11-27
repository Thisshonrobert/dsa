import java.util.Collections;
import java.util.List;

public class nextgreatestpermutation {
    public static List<Integer> nextGreaterPermutation(List<Integer> arr) {
        int n = arr.size();
        int in = -1;

        // find the longest prefix,we can only get the next permutation only if the
        // arr[i]<arr[i+1] from back,else even if we rearrange it in any order we cannot
        // find it.
        for (int i = n - 2; i >= 0; i--) {
            if (arr.get(i) < arr.get(i + 1)) {
                in = i;
                break;
            }
        }
        // if every number is in decending order we cant find the largest prefix so we
        // reverse it [5 4 3 2 1] to [1 2 3 4 5]
        if (in == -1) {
            Collections.reverse(arr);
            return arr;
        }
        // find the number greater than arr[i] and less than other number to find the
        // closest one ie next greatest number of arr[i]and swap it
        for (int i = n - 1; i > in; i--) {
            if (arr.get(i) > arr.get(in)) {
                Collections.swap(arr, in, i);
                break;
            }
        }
        List<Integer> sub = arr.subList(in + 1, n);
        Collections.reverse(sub);
        return arr;
    }
}
