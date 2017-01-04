package com.lova.ocajp;

public class Threads2 implements Runnable {

	public void run() {
		System.out.println("run.");
		throw new RuntimeException("Problem");
	}

	public static void main(String[] args) {
		Thread t = new Thread(new Threads2());
		t.start();
		System.out.println("End of method.");
	}
}

/*

End of method.
run.Exception in thread "Thread-0" 
java.lang.RuntimeException: Problem
	at Threads2.run(Threads2.java:6)
	at java.lang.Thread.run(Unknown Source)
	
	
	or
	
	
End of method.Exception in thread "Thread-0" 
run.
java.lang.RuntimeException: Problem
	at Threads2.run(Threads2.java:6)
	at java.lang.Thread.run(Unknown Source)
	
*/









