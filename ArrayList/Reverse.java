import java.util.ArrayList;
import java.util.*;

public class Reverse {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(list);

        // method 1
        Collections.reverse(list);
        System.out.println(list);

        // method 2
        // for (int i = list.size() - 1; i >= 0; i--) {
        // System.out.print(list.get(i) + " ");

        // }

    }
}
