package collectionAssifnment;

public class MyThread implements Runnable {

	public void run() {
		
    for(int i=0;i<10;i++) {
	System.out.println(" Thread VAlue is : "+i); 
}
	}
	public static void main(String[] args) {
		MyThread mythread = new MyThread();
		Thread t1 = new Thread(mythread);
		t1.start();

	}

}
