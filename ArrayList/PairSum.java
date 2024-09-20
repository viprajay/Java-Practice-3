import java.util.ArrayList;

public class PairSum {

    public static boolean pair(ArrayList<Integer> list, int key) {

        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) + list.get(j) == key) {
                    return true;
                }
            }

        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(7);
        list.add(8);
        list.add(4);
        list.add(9);
        list.add(2);
        list.add(3);
        list.add(4);

        int key = 90;

        System.out.println(pair(list, key));
    }
}
