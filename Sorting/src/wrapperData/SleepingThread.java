package wrapperData;

public class SleepingThread extends Thread {
	@Override
	public void run() {
		String str = "abcdefghijkl";
		for (int i = 0; i < str.length(); i++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(str.charAt(i));
		}
	}
}