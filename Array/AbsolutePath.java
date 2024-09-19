
public class AbsolutePath {
    public static void main(String[] args) {
        int arr[] = { -5, -3, 0, 1, 3, 5, 6 };
        int count = 0;
        // for (int i = 0; i < arr.length; i++) {
        // if (arr[i] < 0) {
        // arr[i] = arr[i] * -1;
        // }
        // }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                arr[i] = arr[i] * -1;
            }

            for (int j = i + 1; j < arr.length - 1; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
        }

        int arrsize = arr.length;
        int absolute = arrsize - count;
        System.out.println("absolute path : " + absolute);
    }
}
