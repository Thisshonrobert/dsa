public class buyorsellstocks {
    public static void main(String[] args) {
        int arr[] = { 7, 1, 5, 3, 6, 4 };
        int min = arr[0], profit = 0;
        for (int i = 1; i < arr.length; i++) {
            int cost = arr[i] - min;
            profit = Math.max(cost, profit);
            min = Math.min(arr[i], min);
        }
        System.out.println(profit);
    }
}
