import java.util.Arrays;

public class twosum {
    public static String read(int n, int[] book, int target) {
        int left = 0, right = n - 1;
        Arrays.sort(book);
        while (left < right) {
            int sum = book[left] + book[right];
            if (sum == target)
                return "YES";
            if (sum < target)
                left++;

            else
                right--;

        }
        return "NO";
    }
}