package DynamicArrays;

import java.util.ArrayList;

public class app {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(25);
        list.add(4);
        list.add(17);
        list.remove(1);
        list.indexOf(17);
        list.toArray();
        System.out.println(list);
    }
}
