public class BuyAndSellStock {
    public static void main(String[] args) {
        int arr[] = { 7, 1, 5, 3, 6, 4 };
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j <= arr.length - 1; j++) {
                if (temp < arr[j] - arr[i]) {
                    temp = arr[j] - arr[i];
                }
            }
        }
        System.out.println(temp);
    }
}
