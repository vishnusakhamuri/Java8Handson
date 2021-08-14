package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class MyCustomClass implements Comparator<Integer>
{

    @Override
    public int compare(Integer o1, Integer o2) {
        return (o1>o2)? -1:(o1<o2)? 1:0;
    }
}
public class ListSortingWitoutLamdaComparator {
    public static void main(String s[]) {
        ArrayList<Integer> i = new ArrayList<Integer>();
        i.add(5);
        i.add(1);
        i.add(7);
        i.add(2);
        System.out.println("Before Sorting");
        System.out.println(i);
        //default sorting
        //Collections.sort(i);
        //customized sorting
        Collections.sort(i, new MyCustomClass());
        //lamda implementation for above
        //Collections.sort(i, (o1, o2) -> (o1 > o2) ? -1 : (o1 < o2) ? 1 : 0);
        System.out.println("After Sorting");
        System.out.println(i);
    }
}
