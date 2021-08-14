package Collections;

import java.util.TreeMap;

public class TreeMapSorting {
    public static void main(String s[]) {
//        default sorting
        TreeMap<Integer, String> tm = new TreeMap<>();
        tm.put(3, "Sunny");
        tm.put(1, "funny");
        tm.put(4, "Munny");
        tm.put(2, "Bunny");
        System.out.println(tm);
        //custom Sorting
        TreeMap<Integer, String> tm1 = new TreeMap<>((o1, o2) -> (o1 > o2) ? -1 : (o1 < o2) ? 1 : 0);
        tm1.put(3, "Sunny");
        tm1.put(2, "Bunny");
        tm1.put(4, "Munny");
        tm1.put(1, "funny");
        System.out.println(tm1);


    }
}
