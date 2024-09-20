public class SubString {

    public static String substring(String name, int start, int end) {
        String newname = "";
        for (int i = start; i < end; i++) {
            newname += name.charAt(i);
        }
        return newname;
    }

    public static void main(String[] args) {
        String name = "viprajay";

        // System.out.println(name.substring(0, 3));

        System.out.println(substring(name, 0, 3));

    }
}
