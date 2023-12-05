package Basicprograms;

public class MyThread extends Thread{
	
	
	    public void run() {
	        // This method will be executed when the thread is started
	        for (int i = 0; i < 5; i++) {
	            System.out.println("Thread " + Thread.currentThread().getId() + ": Count " + i);
	        }
	    }
	}
