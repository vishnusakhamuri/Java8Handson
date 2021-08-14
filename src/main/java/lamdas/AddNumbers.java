package lamdas;

@FunctionalInterface
interface myAdd
{
    public void add(int a, int b);
}

public class AddNumbers {
    public static void main(String args[])
    {
        myAdd i=(a,b)->{
                System.out.println("From Lamda expression" );
                System.out.println("sum is : "+ (a+b));
        };
        i.add(5,6);
        i.add(100,200);
    }
}
