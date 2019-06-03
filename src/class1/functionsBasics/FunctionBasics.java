package class1.functionsBasics;

public class FunctionBasics {
	// Functions/Methods are Independent small unit of execution 
	public static void main(String[] args) {
		testMe();
		testMe();
		testMe();
		testMe();
		System.out.println("In Main Function");
	}
	public static void testMe() {
		System.out.println("In test me Function");
	}
}