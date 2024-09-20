public class Palindrome {

    public static boolean isPlalindrome(String name) {
        // int n = name.length();
        for (int i = 0; i < name.length() / 2; i++) {
            if (name.charAt(i) != name.charAt(name.length() - i - 1)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String name = "nojijon";
        System.out.println(isPlalindrome(name));
    }
}