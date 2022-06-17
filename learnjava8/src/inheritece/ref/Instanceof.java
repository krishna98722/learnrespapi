package inheritece.ref;

class Aq {
	int a = 11;
}

class Bq extends Aq {
	int b = 21;
}

class Cq extends Bq {
	int c = 32;
}

class Dq {

}

public class Instanceof {
	public static void main(String[] args) {
		// (OBJECT) instanceof (TYPE)
		if ((new Aq()) instanceof Aq) {
			System.out.println("TRUE");
		} else {
			System.out.println("FALSE ");
		}
	}
}
