public class SecondLargestWithoutSort {

    public static int secondLargest(int arr[]) {
        int largest = 0, temp = -1;
        for (int i = 0; i < arr.length; i++) {
            if (largest < arr[i]) {
                largest = arr[i];
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if (temp < arr[j] && arr[j] < largest) {
                temp = arr[j];
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 4, 4 };

        System.out.println(secondLargest(arr));

    }
}
