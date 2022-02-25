package application;

public class App {

	//throws InterruptedException
	public static void main(String[] args) throws InterruptedException {
		// exceptions are an error handling mechanism
		// two kinds: run time, checked
		// checked exceptions force you to handle them
		
		System.out.println("one");
		Thread.sleep(2000);
		//sleep can be interrupted by other threads throwing an error
		System.out.println("two");
		
	}

}
