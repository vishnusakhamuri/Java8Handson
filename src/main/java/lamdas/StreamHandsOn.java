package lamdas;

import java.util.ArrayList;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java.lang.System.*;

public class StreamHandsOn {
    public static void main(String[] args)
    {
        //Hands on Streams
        ArrayList<Integer> al=new ArrayList<>();
        al.add(10);        al.add(14);        al.add(8);        al.add(9);        al.add(12);        al.add(13);
        al.add(11);        al.add(7);        al.add(5);        al.add(2);

        out.println("Original List is \n"+al+"\n");

        //using map, double the previous list values
        List<Integer> doubles =al.stream().map(i->i*2).collect(Collectors.toList());
        //using filter, separate odd numbers from  the previous list values
        out.println("post doubling the list is \n"+ doubles +"\n");
        List<Integer> oddList =al.stream().filter(i->i%2!=0).collect(Collectors.toList());
        out.println("post filtering odd values the list is \n "+ oddList +"\n");
        out.println(al+"\n");

        //sort the original list in default sorted order
        out.println("default sorted order  is \n"+ al.stream().sorted().collect(Collectors.toList()) +"\n");
        //sort the original list in custom sorting order
        out.println("Custom sorted order  is \n"+ al.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()) +"\n");

        //count the all even values in the original list
        out.println("count of all even values in the original list \n"+ al.stream().filter(i->i%2==0).count() +"\n");

        //print min value in the original list
        out.println("min value in the natural order list \n"+ al.stream().min(Comparator.naturalOrder()).get() +"\n");
        out.println("min value in the original list \n"+ al.stream().min(Comparator.naturalOrder()).get() +"\n");
        //print max value in the original list
        out.println("max value in the natural order list \n"+ al.stream().max(Comparator.naturalOrder()).get() +"\n");
        out.println("min value in the original list \n"+ al.stream().max(Comparator.naturalOrder()).get() +"\n");
        out.println("min value in the reverse order list \n"+ al.stream().max(Comparator.naturalOrder()).get() +"\n");
        al.forEach(out::print);
        Integer[] a= al.toArray(new Integer[0]);
        for (Integer e:a)
        {
            out.print(" " +e);
        }

    }
}
