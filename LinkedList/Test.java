import java.util.*;

public class Test {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };

        for (int i = 0; i < arr.length; i++) {
            while (arr[i] == 0) {
                System.out.println("num exits");
                return;
            }
        }
        System.out.println("num not exits");
    }
}
