package lamdas;

public class RunnableAnonymousClass {

    public static void main(String s[])
    {
        //regular implementaiton
        Runnable r=new Runnable() {
            @Override
            public void run() {
            for (int i=0;i<10;i++)System.out.println("Child Class t:"+ Thread.currentThread());
            }
        };
        //lambda implementation
        Runnable r1=()->{
        for (int i=0;i<10;i++)
            System.out.println("Child Class t1:"+ Thread.currentThread());
        };

        Thread t=new Thread(r);
        Thread t1=new Thread(r1);
        t.start();
        t1.start();

        //further Lambda implementation
        Thread t2=new Thread(()->{
            for (int i=0;i<10;i++)
                System.out.println("Child Class t2:"+ Thread.currentThread());
        });
        t2.start();
        for (int i=0;i<10;i++)System.out.println("Main Class :" +t.getName());
    }
}
