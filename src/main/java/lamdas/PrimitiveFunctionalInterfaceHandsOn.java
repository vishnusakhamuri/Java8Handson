package lamdas;



import java.util.Optional;
import java.util.function.*;

import static java.lang.System.out;

class Employee
{
    String eName;
    double salary;

    public Employee(String eName, double salary) {
        this.eName=eName;
        this.salary=salary;
    }
}
public class PrimitiveFunctionalInterfaceHandsOn {

    public static void main(String[] as)
    {

        //predicate primitive types are of 3 types
        //IntPredicate
        int[] a = {0,5,10,15,20,25};

        IntPredicate ip=i->i%2==0;
        for(int x:a)
        {
            if(ip.test(x))
            {
                out.println(x);
            }
        }

        //DoublePredicate
        double[] ad = {0,5,10,15,20,25};

        DoublePredicate dp= i->i%2==0;
        for(double x:ad)
        {
            if(dp.test(x))
            {
                out.println(x);
            }
        }

        //LongPredicate
        long[] la = {0,5,10,15,20,25};

        LongPredicate lp= i->i%2==0;
        for(long x:a)
        {
            if(lp.test(x))
            {
                out.println(x);
            }
        }

        //Functional primitive types
        //control on input
        // IntFunction
        IntFunction<Integer> ifun=i->i*i;
        int[] af = {0,5,10,15,20,25};
        for(int x:af)
        {
            out.println( ifun.apply(x));

        }
        //LongFunction
        //DoubleFunction

        //ToIntFunction
        ToIntFunction<String> tif=s->s.length();
        out.println( tif.applyAsInt("Vishnu"));
        //ToLongFunction
        //ToDoubleFunction
        //IntToDoubleFunction
        IntToDoubleFunction itdf=i->Math.sqrt(i);
        out.println( itdf.applyAsDouble(25));
        //IntToLongFunction
        //LongToIntFunction
        //LongToDoubleFunction
        //DoubleToIntFunction
        //DoubleToLongFunction

        //ToIntBiFunction
        //ToLongBiFunction
        //ToDoubleBiFunction



        //primitive versions for Consumer

        IntConsumer ic=i->out.println(i*i);
        ic.accept(10);

        LongConsumer lc=i->out.println(i*i);
        lc.accept(10);

        DoubleConsumer dc=i->out.println(i*i);
        dc.accept(10);
        //ObjIntConsumer

        //ObjLongConsumer
        //ObjDoubleConsumer
        ObjDoubleConsumer<Employee> c=(e,d)-> e.salary+=d;
        Employee employee=new Employee("Raju",5000);
        c.accept(employee,1000);

        out.println(employee.salary);


        //primitive types for Supplier
        //IntSupplier
        IntSupplier s=()->(int)(Math.random()*10);
        String otp="";
        for(int i=0;i<6;i++)
        { otp=otp+s.getAsInt();}
        out.println(otp);
        //LongSuppier
        //DoubleSuppier
        //BooleanSuppier
        //#############################################################
        //Unary Operator(if input and output are same), go for this instead of Function
        UnaryOperator<Integer> u=i->i*i;
        out.println(u.apply(10));

        //primitive Unary Operator
        IntUnaryOperator iu=i->i*7;
        iu.applyAsInt(10);

        //LongUnaryOperator
        //DoubleUnaryOperator


        //Binary Operator
        BinaryOperator<Integer> b=(i,j)->i+j;
        out.println(b.apply(10,20));

        //primitive Binary Operator

        IntBinaryOperator ib=(i,j)->i+j;
        out.println(ib.applyAsInt(30,40));

        //LongBinaryOperator
        //DoubleBinaryOperator

    }

}
