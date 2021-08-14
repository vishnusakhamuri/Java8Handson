package lamdas;

import java.util.Date;
import java.util.Random;
import java.util.function.Supplier;

public class SuppierHandson {
    public static void main(String a[])
    {
        Supplier<Date> s=()->new Date();
        System.out.println("Current Date is "+s.get());
        Supplier<Integer> s1=()->
        {
            return (int)Math.random()*4;
        };
        System.out.println("Random Value generted is "+s1.get());

    }
}
