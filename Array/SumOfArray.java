public class SumOfArray {

    public static int sum(int arr[]) {
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            temp = arr[i] + temp;
        }
        return temp;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        System.out.println(sum(arr));

    }
}
