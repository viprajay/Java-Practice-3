public class RemoveDuplicate {

    public static void remove(int arr[]) {
        int temp = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (temp != arr[i]) {
                temp = arr[i];
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { -1, -1, 0, 0, 1, 1, 2, 3, 4, 5, 5, 6, 6, 7, 7 };
        remove(arr);
    }
}
