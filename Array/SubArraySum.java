public class SubArraySum {

    public static int sum(int arr[]) {
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (temp < arr[i] + arr[j]) {
                    temp = arr[i] + arr[j];
                }
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        int arr[] = { 6, 5, 6, 4, 3, 2, 1 };
        System.out.println(sum(arr));
    }
}
