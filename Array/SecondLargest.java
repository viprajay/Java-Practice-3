import java.util.*;

class SecondLargest {

    static void print2largest(Integer arr[]) {
        Arrays.sort(arr, Collections.reverseOrder());
        // int start = 0, end = arr.length - 1;
        // while (start < end) {
        // int temp = arr[end];
        // arr[end] = arr[start];
        // arr[start] = temp;
        // start++;
        // end--;
        // }

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[0]) {
                System.out.print(arr[i]);
                return;
            }
        }
    }

    public static void main(String[] args) {
        Integer arr[] = { 1, 2, 2, 2, 2, 2, 2, 2 };
        print2largest(arr);
    }
}
