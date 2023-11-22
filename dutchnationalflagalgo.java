public class dutchnationalflagalgo {
    public void sort012(int[] arr) {
        int low = 0, mid = 0, high = arr.length - 1;
        while (mid <= high) {
            if (arr[mid] == 0) {
                swap(low, mid, arr);
                mid++;
                low++;
            } else if (arr[mid] == 1)
                mid++;
            else {
                swap(mid, high, arr);
                high--;
            }
        }

    }

    public void swap(int a, int b, int[] arr) {
        int t = arr[a];
        arr[a] = arr[b];
        arr[b] = t;
    }
}
