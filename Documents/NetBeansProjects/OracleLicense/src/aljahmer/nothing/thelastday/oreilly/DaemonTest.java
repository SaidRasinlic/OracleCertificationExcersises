package aljahmer.nothing.thelastday.oreilly;

public class DaemonTest {

    public static void main(String[] args) {
        new WorkerThread().start();
        System.out.println("Calling WorkerThread aka Deamon");
        try {
            Thread thread = Thread.currentThread();
            System.out.println(thread.getName() + " has started!");
            Thread.sleep(0);
            System.out.println("Im sleeping..");
        } catch (InterruptedException e) {
            // handle here exception
        }
        System.out.println("Main Thread ending");
    }
}

class WorkerThread extends Thread {

    public WorkerThread() {
        // When false, (i.e. when it's a non daemon thread),
        // the WorkerThread continues to run.
        // When true, (i.e. when it's a daemon thread),
        // the WorkerThread terminates when the main 
        // thread or/and user defined thread(non daemon) terminates.
        setDaemon(true);
    }

    @Override
    public void run() {
        int count = 0;
        while (true) {
            System.out.println("Hello from Worker " + ++count + " " + Thread.currentThread().getName());
            try {
                sleep(10);
            } catch (InterruptedException e) {
                // handle exception here
            }
        }
    }
}
class A {
//InterruptedException is a direct subclass of Exception.
   void compute(A this) throws ArithmeticException, InterruptedException {
      this.div(5, 5);
   }
   int div(int i, int j) throws ArithmeticException {
   return i/j;
   }
}
 class Client extends A {
   @Override
   void compute(Client this)/* Line 1 */ {
      try {
         div(5, 0);
      } catch (ArithmeticException e) {
         return;
      }
   throw new RuntimeException("ArithmeticException was expected.");
   }
}