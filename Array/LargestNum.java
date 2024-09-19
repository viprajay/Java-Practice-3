import java.util.Arrays;

public class LargestNum {

    // method 1
    public static void getLargest(int arr[]) {
        Arrays.sort(arr);
        int size = arr.length;
        System.out.println(arr[size - 1]);

    }

    // method 2
    // public static int getLargest(int arr[]) {
    // int largest = Integer.MIN_VALUE;
    // for (int i = 0; i < arr.length; i++) {
    // if (largest < arr[i]) {
    // largest = arr[i];
    // }
    // }
    // return largest;
    // }

    // method 3
    // public static int getLargest(int arr[]) {
    // int temp = 0;
    // for (int i = 0; i < arr.length; i++) {
    // if (temp < arr[i]) {
    // temp = arr[i];
    // }
    // }
    // return temp;
    // }

    public static void main(String[] args) {
        int arr[] = { 4, 3, 6, 9, 2, 1, 7 };
        // int largest = getLargest(arr);
        // System.out.println(largest);
        getLargest(arr);

    }
}
