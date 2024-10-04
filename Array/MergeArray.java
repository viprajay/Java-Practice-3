
public class MergeArray {
    public static void main(String[] args) {
        int arr2[] = { 6, 7, 8, 9 };
        int arr1[] = { 1, 2, 3, 4, 5 };

        int len1 = arr1.length;
        int len2 = arr2.length;
        int totellen = len1 + len2;

        int newarr[] = new int[totellen];
        int i = 0;
        int j = 0;
        int ind = 0;

        while (i < len1 && j < len2) {
            if (arr1[i] < arr2[j]) {
                newarr[ind++] = arr1[i++];
            } else {
                newarr[ind++] = arr2[j++];
            }
        }

        while (i < len1) {
            newarr[ind++] = arr1[i++];
        }

        while (j < len2) {
            newarr[ind++] = arr2[j++];
        }

        for (int k : newarr) {
            System.out.print(k + " ");
        }

    }
}
