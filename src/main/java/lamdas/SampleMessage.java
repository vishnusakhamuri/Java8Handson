package lamdas;

@FunctionalInterface
interface myInterface{
    public void ma();
        }

public class SampleMessage {
    public static void main(String args[])
    {
        myInterface i=()-> System.out.println("Printing from Lamda Expressions");
        i.ma();
    }
}
