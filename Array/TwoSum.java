public class TwoSum {

    public static void sum(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] + arr[i] == target) {
                    System.out.println("index " + i + " and " + j);
                    return;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int target = 1;
        sum(arr, target);
    }
}
