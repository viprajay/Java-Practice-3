import java.util.ArrayList;

public class MaximumNum {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(6);
        list.add(5);

        int temp = 1;

        for (int i = 0; i < list.size(); i++) {
            if (temp < list.get(i)) {
                temp = list.get(i);
            }
        }
        System.out.println(temp);
    }
}
