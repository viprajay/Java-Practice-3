public class FindKeyInIndex {

    public static void findkey(int arr[], int key) {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            while (arr[i] == key) {
                System.out.print("key found in : " + i + " ");
                System.out.println();
                i++;
            }

        }
    }

    public static void main(String[] args) {
        int arr[] = { 8, 3, 6, 9, 5, 10, 2, 5, 3 };
        int key = 5;
        findkey(arr, key);
    }
}
