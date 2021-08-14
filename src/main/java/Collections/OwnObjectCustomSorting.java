package Collections;

import sun.management.snmp.jvmmib.EnumJvmMemPoolCollectThreshdSupport;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

class Employee
{
    int empId;
    String empName;
    public Employee(int empId,String empName)
    {
        this.empId=empId;
        this.empName=empName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                '}';
    }
}
public class OwnObjectCustomSorting {
    public static void main(String s[])
    {
        ArrayList<Employee> al=new ArrayList<Employee>();
        al.add(new Employee(1,"Bunny"));
        al.add(new Employee(4,"Funny"));
        al.add(new Employee(2,"Munny"));
        al.add(new Employee(3,"Sunny"));
        System.out.println(al);
         //Custom sorting
        ArrayList<Employee> al1=new ArrayList<Employee>();
        al1.add(new Employee(1,"Bunny"));
        al1.add(new Employee(4,"Funny"));
        al1.add(new Employee(2,"Munny"));
        al1.add(new Employee(3,"Sunny"));
        System.out.println(al);
        System.out.println("After Sorting");
        Collections.sort(al1,(e1,e2)->(e1.empId>e2.empId)?-1:(e1.empId<e2.empId)?1:0);
        System.out.println(al1);

    }

}
