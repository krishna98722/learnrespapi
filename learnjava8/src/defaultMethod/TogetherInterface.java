package defaultMethod;

public interface TogetherInterface extends Left,Right{

	@Override
	default void m3() {   // In interface Modifier will be '' default ''<< 
		Left.super.m3();
	}

}
