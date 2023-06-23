import java.lang.*;
public class Multi extends Thread {
   public void run() {
      
   }
   public static void main(String[] args) {
      Multi t1 = new Multi();
      Multi t2 = new Multi();
        Multi t3 = new Multi();
      System.out.println(" Tejal Prashant Yawalkar");
	  System.out.println("___________________________________________________________________");
	  System.out.println("*******************************************************************");
	  System.out.println("___________________________________________________________________");
	  System.out.println();
      System.out.println("Priority of first thread is : " + t1.getPriority());
	  System.out.println("___________________________________________________________________");
      System.out.println("Priority of second thread is : " + t2.getPriority());
	  System.out.println("___________________________________________________________________");
      System.out.println("Priority of third thread is : " + t3.getPriority());
	  System.out.println("___________________________________________________________________");
      t1.setPriority(2);
      t2.setPriority(1);
      t3.setPriority(8);
      System.out.println("Priority of first thread is : " + t1.getPriority());
	  System.out.println("___________________________________________________________________");
      System.out.println("Priority of second thread is : " + t2.getPriority());
	  System.out.println("___________________________________________________________________");
      System.out.println("Priority of third thread is : " + t3.getPriority());
	  System.out.println("___________________________________________________________________");
      System.out.print(Thread.currentThread().getName());
      System.out.println("Priority of main thread is : " + Thread.currentThread().getPriority());
	  System.out.println("___________________________________________________________________");
      Thread.currentThread().setPriority(7);
      System.out.println("Priority of main thread is : " +Thread.currentThread().getPriority());
   }
}
