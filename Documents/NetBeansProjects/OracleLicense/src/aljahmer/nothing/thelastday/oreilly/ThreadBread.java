package aljahmer.nothing.thelastday.oreilly;

public class ThreadBread {

    int k = 3;
    static int h = 22;

    static void staticHello() {
        System.out.println("Static method hello!");
    }

    void nonStaticHello() {
        System.out.println("Non static method hello");
    }

    public static void main(String[] args) {

        System.out.println(new ThreadBread().k);
        String s = "Said";
        String s2 = s.replaceAll("\\w+", "123");
        System.out.println(s.replace("Sa", "pa") + " NUMBER TWOO");
        System.out.println(s2);
    }
}

class InterruptedThread extends Thread {

    // Overrides run()  method of Thread class
    @Override
    public void run() {
        for (int i = 0; i <= 3; ++i) {
            /*  By using interrupted() method to check whether this 
                thread has been interrupted or not it will return and 
                execute the interrupted code 
             */
            if (Thread.currentThread().interrupted()) {
                System.out.println(Thread.currentThread().getName() + " has been interrupted and status is set to" + ": " + Thread.interrupted());
            } else {
                System.out.println(Thread.currentThread().getName() + " This thread has not been interrupted");
            }
        }
    }

    /*
 if (Thread.currentThread().isInterrupted()) {
 System.out.println("Is the thread" + Thread.currentThread().getName() + "has been interrupted: " +  Thread.currentThread().isInterrupted());
 } else {
 System.out.println("Is the thread" + Thread.currentThread().getName() + "has been interrupted: " +  Thread.currentThread().isInterrupted());
 }   
---------------------------------------------------------------------------------------------------------------------------------------------
 if (new Thread().interrupted()) {
 System.out.println(Thread.currentThread().getName() + " has been interrupted and status is set to" + ": " + Thread.interrupted());
 } else {
 System.out.println(Thread.currentThread().getName() + " This thread has not been interrupted");
 }
     */
    public static void main(String args[]) {
        InterruptedThread it1 = new InterruptedThread();
        InterruptedThread it2 = new InterruptedThread();
        /*  By using start() method to call the run() method of 
            Thread class and Thread class start() will call run() 
            method of InterruptedThread class
         */
        it1.setName("IT-1");
        it2.setName("IT-2");
        System.out.println(it1.getName() + " OVO JE IT 1");
        System.out.println(it2.getName() + " OVO JE IT 2");
        System.out.println("-----------------------------------------------");
        it2.start();
        it2.interrupt();
        it1.start();
    
    }
}

class Base {

    public void foo() {
    }
}

class Derived extends Base {

    /*  @Override
    public void foo() throws IOException {
    } */
}
