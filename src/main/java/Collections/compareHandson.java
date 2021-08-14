package Collections;

import java.util.Comparator;


public class compareHandson implements Comparator{
    public static void main(String s[])
    {
        Integer i=new Integer(6);
        Integer j=new Integer(5);
 Comparator comparator =new compareHandson();

        System.out.println(comparator.compare(i,j));
    }

    @Override
    public int compare(Object o1, Object o2) {
        if(o1.equals(o2)) return 0;
        else return -1;
    }
}
