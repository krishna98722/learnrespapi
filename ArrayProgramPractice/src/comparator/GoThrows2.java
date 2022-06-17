package comparator;

public class GoThrows2 {
	public static void m3() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(2989);
	}

	public static void m2() throws IndexOutOfBoundsException, InterruptedException {
		m3();
	}

	public static void main(String[] args) {
		try {
			m3();
		} catch (IndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
