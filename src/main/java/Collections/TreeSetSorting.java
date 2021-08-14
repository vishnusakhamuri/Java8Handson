package Collections;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetSorting {
    public static void main(String s[])
    {
        //default(Ascending) sorting
        TreeSet<Integer> t=new TreeSet<Integer>();
        t.add(10);
        t.add(30);
        t.add(40);
        t.add(20);
        t.add(60);
        t.add(70);
        System.out.println(t);

        //descending order using lamda
        TreeSet<Integer> t1=new TreeSet<Integer>((o1,o2)->(o1>o2)?-1:(o1<o2)?1:0);
        t1.add(10);
        t1.add(30);
        t1.add(40);
        t1.add(20);
        t1.add(60);
        t1.add(70);
        System.out.println(t1);
    }
}
