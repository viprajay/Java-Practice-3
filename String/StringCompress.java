public class StringCompress {

    public static String getCompress(String name) {
        String newstr = "";
        for (int i = 0; i < name.length(); i++) {
            Integer count = 1;
            while (i < name.length() - 1 && name.charAt(i) == name.charAt(i + 1)) {
                count++;
                i++;
            }
            newstr += name.charAt(i);
            if (count > 1) {
                newstr += count.toString();
            }
        }

        return newstr;
    }

    public static void main(String[] args) {
        String name = "aaasssssdddddfffff";

        System.out.println(getCompress(name));
    }
}
