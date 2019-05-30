package class1.loops.forLoop.gfg;

public class ForLoopMultipleInitializationDifferentDatatype {

	public static void main(String[] args) {
		for (int i = 0, String = "GFG"; i < 2; i++) 
            System.out.println("HELLO GEEKS");
		// Initialization part of the for loop will be executed only once in the for loop life cycle. 
		// Here we can declare any number of variables but should be of same type. 
		// By mistake if we are trying to declare different data types variables 
		// then we will get compile time error saying error: incompatible types: String cannot be converted to int.
	}

}
