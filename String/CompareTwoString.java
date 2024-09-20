public class CompareTwoString {
    public static void main(String[] args) {
        String name1 = "viprajay";
        String name2 = "yajarpiv";
        for (int i = 0; i < name1.length(); i++) {
            for (int j = 0; j < name2.length(); j++) {
                if (name1.charAt(i) == name2.charAt(j)) {

                } else {
                    System.out.println("not same");
                    break;
                }
            }
        }
    }
}
