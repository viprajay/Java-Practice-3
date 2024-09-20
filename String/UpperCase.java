public class UpperCase {

    public static String getUpperCase(String name) {
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(name.charAt(0));
        sb.append(ch);

        for (int i = 1; i < name.length(); i++) {
            if (name.charAt(i) == ' ' && i < name.length() - 1) {
                sb.append(name.charAt(i));
                i++;
                sb.append(Character.toUpperCase(name.charAt(i)));
            } else {
                sb.append(name.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String name = "my name is viprajay dhali";

        // String newname = name.toUpperCase();
        // System.out.println(newname);

        System.out.println(getUpperCase(name));

    }
}