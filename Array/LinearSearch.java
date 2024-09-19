
public class LinearSearch {

    public static int findkey(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 9, 7, 8 };
        int index = findkey(arr, 5);
        if (index == -1) {
            System.out.println("key not found");
        } else {
            System.out.println("key find in index no : " + index);
        }

    }
}