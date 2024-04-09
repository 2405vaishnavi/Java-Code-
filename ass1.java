// 1. Write a program To Create Two Threads And Assign Two Different Jobs To The Threads.
// Ensure That The Second Thread Should Not Terminate Before The One 
public class ass1{

    public static void main(String[] args) {
      // Create the first thread
      Thread thread1 = new Thread(new Runnable() {
        @Override
        public void run() {
          // Job for thread 1
          for (int i = 0; i < 10; i++) {
            System.out.println("Thread 1: " + i);
          }
        }
      });
  
      // Create the second thread
      Thread thread2 = new Thread(new Runnable() {
        @Override
        public void run() {
          // Job for thread 2
          for (int i = 0; i < 10; i++) {
            System.out.println("Thread 2: " + i);
          }
        }
      });
  
      // Start the first thread
      thread1.start();
  
      // Start the second thread after the first thread completes
      try {
        thread1.join();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      thread2.start();
  
      // Start the second thread after the first thread completes
      try {
        thread1.join();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }}