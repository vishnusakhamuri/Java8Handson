package lamdas;

import java.time.*;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class DateAndTimeHandsOn {
    public static void main(String[] a)
    {
        //Java 8 Joda API
        LocalDate ld=LocalDate.now();
        out.println("Default value for date \n" +(ld));

        //get day, month and Year
        out.println("Day is "+ ld.getDayOfMonth()+ " \t month is "+ ld.getMonthValue()+
                "\t Year is "+ld.getYear());
        out.printf("%d-%d-%d \n", ld.getDayOfMonth(),ld.getMonthValue(),ld.getYear());

        LocalTime localTime = LocalTime.now();

        out.println("Default value for time \n" + localTime+"\n");

        out.printf("%d-%d-%d-%d \n", localTime.getHour(),localTime.getMinute(),localTime.getSecond(),localTime.getNano());



        LocalDateTime localDateTime = LocalDateTime.now();
        out.println("Default value for date time \n" + localDateTime);

        out.printf("%d-%d-%d:%d:%d:%d:%d: \n",
                localDateTime.getDayOfMonth(),localDateTime.getMonthValue(),localDateTime.getYear(),
                localDateTime.getHour(),localDateTime.getMinute(),localDateTime.getSecond(),localDateTime.getNano());

        //create local date time object for any given date

        LocalDateTime dt=LocalDateTime.of(1988,12,21,02,10);
        out.println("my Birthday is \n" + dt);
        out.println("After 33 Years Date and time is  \n" + dt.plusYears(33));
        out.println("Before 6 months Date and time is  \n" + dt.minusMonths(6));

        //how old am I using Period class
        LocalDate bDay=LocalDate.of(1988,12,21);
        LocalDate toDay=LocalDate.now();
        //period
        Period p=Period.between(bDay, toDay);
        out.printf("Your age is %d years %d months and %d days \n",p.getYears(),p.getMonths(),p.getDays());

        LocalDate dDay=LocalDate.of(1988+80,12,21);
        Period p1=Period.between(toDay, dDay);
        int d=p1.getDays()+p1.getMonths()*30+p1.getYears()*365;
        out.printf("Your here for %d years %d months and %d days only \n",p1.getYears(),p1.getMonths(),p1
                .getDays());
        out.printf("Over all  %d  days only \n",d);


        //Year Class
        //check if a year is a leap year using Year class
        /*Scanner sc=new Scanner(in);
        out.printf("Enter the year");
        int n=sc.nextInt();
        Year y= Year.of(n);
        if(y.isLeap())
            out.println(n+ "is a Leap Year");
        else
            out.println(n+ "is not a Leap Year");
*/
        //Internationalization
        //Zone ID
        //current system default zone
        ZoneId zone=ZoneId.systemDefault();
        out.println(zone);
        //get current date and time in my place
        ZoneId as=ZoneId.of("Asia/Calcutta");
        ZonedDateTime asDateTime = ZonedDateTime.now(as);
        out.println(asDateTime);

        //get current date and time in los-Angeles
        ZoneId la=ZoneId.of("America/Los_Angeles");
        ZonedDateTime laDateTime = ZonedDateTime.now(la);
        out.println(laDateTime);

    }

}
