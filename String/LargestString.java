public class LargestString {
    public static void main(String[] args) {
        String name[] = { "y", "v", "dhali", "z", "college", };
        String largest = name[0];
        for (int i = 0; i < name.length; i++) {
            if (largest.compareTo(name[i]) < 0) {
                largest = name[i];
            }
        }
        System.out.println(largest);
    }
}
