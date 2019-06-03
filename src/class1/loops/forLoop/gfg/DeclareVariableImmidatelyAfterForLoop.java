package class1.loops.forLoop.gfg;

public class DeclareVariableImmidatelyAfterForLoop {

	public static void main(String[] args) {

		 for (int g = 0; g < 10; g++) 
			 int e = 10; 
		 // Curly braces are optional and without curly braces we can take only one statement under for loop 
		 // which should not be declarative statement. Here we are declaring a variable 
		 // that’s why we will get compile time error saying error: variable declaration not allowed here.
	}

}
