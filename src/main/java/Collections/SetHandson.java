package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class SetHandson {
    public static void main(String s[])
    {
        HashSet l=new HashSet<String>();
        l.add("sunny");
        l.add("bunny");
        l.add("sunny");
        l.add("munny");

        TreeSet t=new TreeSet<String>();
        t.add("sunny");
        t.add("bunny");
        t.add("sunny");
        t.add("munny");
        System.out.println(t);
    }

}
