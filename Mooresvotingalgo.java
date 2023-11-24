
// greater than n/2 occurance;
import java.util.*;

public class Mooresvotingalgo {

    public static void main(String[] args) {

        int arr[] = { 1, 1, 2, 2, 3, 1, 1, };
        int count = 0, ans = 0;
        for (int i = 0; i < arr.length; i++) {
            if (count == 0) {
                count = 1;
                ans = arr[i];
            } else if (arr[i] == ans)
                count++;
            else
                count--;
        }
        System.out.println(ans);
    }
}
