package java8.predicate;

import java.util.function.Function;

public class FunctionSquare{
	public static void main(String[] args) {
 Function<Integer, Integer> functionSq= i ->{
	 
	 return i*25/100;
 };
 System.out.println(functionSq.apply(12));
	}

}
